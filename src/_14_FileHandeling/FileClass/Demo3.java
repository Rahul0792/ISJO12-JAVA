package _14_FileHandeling.FileClass;

import java.io.File;

public class Demo3 {
    public static void main(String[] args) {

        String path = "D:\\D\\Placement\\ATS RESUME\\FF1";
        File Folder = new File(path);

        //mkdir is used for creating folder
        System.out.println(Folder.mkdir());
    }
}
