package jsoup;

import java.io.File;
import java.io.IOException;

/**
 * @author wq
 * @since 2021-11-04 14:16
 */

public class CreatFile {
    public static void main(String[] args) throws IOException {
        //新建文件
        File file = new File("2.html");
        boolean newFile = file.createNewFile();
//        System.out.println(newFile);
    }
}
