package utils;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileUtils {
    public static void clearFile(String fileName) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(fileName);
        pw.close();
    }
}
