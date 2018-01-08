package com.sasaxie.file.filefilter;

import java.io.File;
import java.io.FilenameFilter;

public class FileTypeFilter implements FilenameFilter {
    private String suffix;

    public FileTypeFilter(String suffix) {
        this.suffix = suffix;
    }

    @Override
    public boolean accept(File dir, String name) {
        File file = new File(dir + File.separator + name);

        if (file.isDirectory()) {
            return true;
        }

        return name.endsWith(suffix);
    }
}
