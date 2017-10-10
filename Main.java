package com.first.wordstasck;

import java.io.File;
import java.io.IOException;

/**
 * Created by Андрей on 19.07.2017.
 */
public class Main {

    static String fileName = "C:\\Users\\Андрей\\Desktop\\JAVA\\task\\big-word-list.txt";

    public static void main(String[] args) throws IOException {
        File file = new File(fileName);
        WordsTasck wordsTasck = new WordsTasck(file);
       // wordsTasck.selectByLength(4);
       // wordsTasck.selectByLetter(0,'t');
       // wordsTasck.matchPattern("te");
       //  wordsTasck.canMakeWith("012");
    }




}
