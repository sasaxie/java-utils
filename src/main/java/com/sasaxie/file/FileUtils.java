package com.sasaxie.file;

import com.sasaxie.file.filefilter.FileTypeFilter;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 文件操作工具类
 */
public class FileUtils {
    public static List<File> getFiles(File file, FileTypeFilter fileTypeFilter) {
        List<File> fileList = new ArrayList<>();

        if (!file.exists()) {
            throw new IllegalArgumentException("File: " + file.getAbsolutePath() + " is not exists");
        }
        
        if (!file.isDirectory()) {
            throw new IllegalArgumentException("File: " + file.getAbsolutePath() + "is not a directory");
        }
        
        File[] files = file.listFiles(fileTypeFilter);

        for (File f : files) {
            if (f.isDirectory()) {
                fileList.addAll(getFiles(f, fileTypeFilter));
            } else {
                fileList.add(f);
            }
        }
        
        return fileList;
    }
}
