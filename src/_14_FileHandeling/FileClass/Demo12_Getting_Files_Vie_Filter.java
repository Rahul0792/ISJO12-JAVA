package _14_FileHandeling.FileClass;

import java.io.File;
import java.io.FilenameFilter;

public class Demo12_Getting_Files_Vie_Filter {
    public static void main(String[] args) {
        String path = "D:\\A\\git hub";

        File file = new File(path);
        FilenameFilter filter = (folder , filename ) -> filename.startsWith("I");
        String Filename[] = file.list(filter);

        for(String FilenamebyFilter  : Filename){
            System.out.println(FilenamebyFilter);
        }
    }
}
