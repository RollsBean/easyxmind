package com.github.rollsbean.xmind;

import com.alibaba.fastjson.JSON;
import com.github.rollsbean.xmind.domain.constant.ZenConstant;
import com.github.rollsbean.xmind.domain.internal.Content;
import com.github.rollsbean.xmind.exception.XmindCommonException;
import com.github.rollsbean.xmind.util.ZipUtil;
import org.apache.commons.compress.archivers.ArchiveException;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author 景行
 * @author Kevin Fan
 * @date 2021/07/06
 **/
public class XmindReader {

    public static List<Content> read(String filePath) throws IOException, ArchiveException {
        String tmpDirPath = getTmpDirPath(filePath);
        String content = ZipUtil.getFileContent(tmpDirPath + File.separator + ZenConstant.CONTENT_JSON);
        return JSON.parseArray(content, Content.class);
    }

    public static List<Content> readContent(String content) {
        return JSON.parseArray(content, Content.class);
    }

    private static String getTmpDirPath(String filePath) throws IOException, ArchiveException {
        String tmpDirectoryPath = ZipUtil.extract(filePath);
        if (StringUtils.isBlank(tmpDirectoryPath)) {
            throw new XmindCommonException("Temporary file is blank");
        }
        return tmpDirectoryPath;
    }

    public static void main(String[] args) throws IOException, ArchiveException {
        List<Content> contents = read("/Users/me/Desktop/File/xmind/搜狗输入法用户运营.xmind");
    }
}
