package com.newcourse;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Z on 5/22/2016.
 */
public class Utils {
    public static boolean checkName(String name) {
        return true;
    }

    public static FileWriter createFile(String name) {
        FileWriter result = null;
         try {
            FileWriter fw = new FileWriter(name,false);
            result = fw;
        } catch (IOException e) {
            e.printStackTrace();

        }
        return result;
    }
public static boolean writeFile(FileWriter fw,String text){
    boolean result;
    try {
        fw.write(text);
        fw.append('\n');
        fw.flush();
        result=true;
    } catch (IOException e) {
        e.printStackTrace();
        result=false;
    }
    return result;
}
}
