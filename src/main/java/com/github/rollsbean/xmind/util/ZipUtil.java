package com.github.rollsbean.xmind.util;

import com.github.rollsbean.xmind.exception.XmindCommonException;
import org.apache.commons.compress.archivers.ArchiveException;
import org.apache.commons.compress.archivers.examples.Expander;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @author 景行
 * @author Kevin Fan
 * @date 2021/07/06
 **/
public class ZipUtil {

    /**
     * Current path
     */
    private static final String CURRENT_PATH = System.getProperty("user.dir");

    /**
     * Sava the expanded Xmind files into here
     */
    private static final String Xmind = "Xmind";

    /**
     * 找到压缩文件中匹配的子文件，返回的为
     * getContents("comments.xml,
     * unzip
     * @param subFileNames
     * @param fileName
     */
    public static Map<String,String> getContents(List<String> subFileNames, String fileName, String extractFileDir) throws IOException, ArchiveException {
        String destFilePath =extractFileDir;
        Map<String,String> map = new HashMap<>();
        File destFile = new File(destFilePath);
        if (destFile.isDirectory()) {
            String[] res = destFile.list(new FileFilter());
            for (int i = 0; i < Objects.requireNonNull(res).length; i++) {
                if (subFileNames.contains(res[i])) {
                    String s = destFilePath + File.separator + res[i];
                    String content = getFileContent(s);
                    map.put(res[i], content);
                }
            }
        }
        return map;
    }

    /**
     * Return the expanded directory name
     * @param fileName
     * @return tmpDirectoryPath
     * @throws IOException
     * @throws ArchiveException
     */
    public static String extract(String fileName) throws IOException, ArchiveException {
        File file = new File(fileName);
        Expander expander = new Expander();
        String destFileName = CURRENT_PATH +File.separator+ Xmind +System.currentTimeMillis();
        expander.expand(file, new File(destFileName));
        return destFileName;
    }

    //这是一个内部类过滤器,策略模式
    static class FileFilter implements FilenameFilter {
        @Override
        public boolean accept(File dir, String name) {
            //String的 endsWith(String str)方法  筛选出以str结尾的字符串
            if (name.endsWith(".xml") || name.endsWith(".json")) {
                return true;
            }
            return false;
        }
    }

    public static String getFileContent(String fileName) throws IOException {
        File file;
        try {
            file = new File(fileName);
        } catch (Exception e) {
            throw new XmindCommonException("File not found", e);
        }
        FileReader fileReader = new FileReader(file);
        StringBuilder stringBuffer;
        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            stringBuffer = new StringBuilder();
            while (bufferedReader.ready()) {
                stringBuffer.append(bufferedReader.readLine());
            }
        } finally {
            fileReader.close();
        }
        return stringBuffer.toString();
    }
}
