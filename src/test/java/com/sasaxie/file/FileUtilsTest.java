package com.sasaxie.file;

import com.sasaxie.file.filefilter.FileTypeFilter;
import org.junit.Test;

import java.io.File;
import java.util.List;

public class FileUtilsTest {
    @Test
    public void testGetListFiles() {
        File file = new File("/Users/xiexiaodong/Documents/vagrant/dev-tron/github/java-utils");
        List<File> fileList = FileUtils.getFiles(file, new FileTypeFilter(".java"));

        for (File f : fileList) {
            System.out.println(f);
        }
    }
}
