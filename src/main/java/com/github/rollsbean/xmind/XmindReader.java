package com.github.rollsbean.xmind;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.rollsbean.xmind.domain.constant.ZenConstant;
import com.github.rollsbean.xmind.exception.XmindCommonException;
import com.github.rollsbean.xmind.util.ZipUtil;
import org.apache.commons.compress.archivers.ArchiveException;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;

/**
 * @author 景行
 * @author Kevin Fan
 * @date 2021/07/06
 **/
public class XmindReader {

    public static String read(String filePath) throws IOException, ArchiveException {
        String tmpDirPath = getTmpDirPath(filePath);
        String content = ZipUtil.getFileContent(tmpDirPath + File.separator + ZenConstant.CONTENT_JSON);
        JSONArray jsonArray = JSON.parseArray(content);

        return null;
    }

    private static String getTmpDirPath(String filePath) throws IOException, ArchiveException {
        String tmpDirectoryPath = ZipUtil.extract(filePath);
        if (StringUtils.isBlank(tmpDirectoryPath)) {
            throw new XmindCommonException("Temporary file is blank");
        }
        return tmpDirectoryPath;
    }

    public static void main(String[] args) throws IOException, ArchiveException {
        String read = read("/Users/me/Desktop/File/xmind/搜狗输入法用户运营.xmind");
    }
}
