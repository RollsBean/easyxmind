package com.github.rollsbean.xmind.core;

import java.math.BigInteger;
import java.util.Random;

/**
 * @author 景行
 * @author Kevin Fan
 * @date 2021/07/06
 **/
public class IdFactory implements IIdFactory {

    private static final int ID_LENGTH = 26;

    private static final char PADDING_CHAR = '0';

    private static final Random random = new Random(System.currentTimeMillis());

    @Override
    public String createId() {
        BigInteger bi = new BigInteger(128, random);
        String id = bi.toString(32);
        int paddingLength = ID_LENGTH - id.length();
        if (paddingLength > 0) {
            StringBuffer buf = new StringBuffer(ID_LENGTH);
            for (int i = 0; i < paddingLength; i++) {
                buf.append(PADDING_CHAR);
            }
            buf.append(id);
            return buf.toString();
        }
        return id;
    }
}
