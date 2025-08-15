package _14_FileHandeling.FileClass;

import java.io.File;

public class Demo11_Getting_All_Files {
    public static void main(String[] args) {
        String path = "D:\\A\\git hub";
        File dir = new File(path);

        //Getting All Files In Related Folder
        String names[] = dir.list();

        for(String AllFileNames : names ){
            System.out.println(AllFileNames);
        }

    }
}
