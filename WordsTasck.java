package com.first.wordstasck;

import java.io.*;

/**
 * Created by Андрей on 19.07.2017.
 */
public class WordsTasck {


    String word;

    public WordsTasck(File file) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));

        while ((word = reader.readLine()) != null) {
            canMakeWith(word);


        }


    }


    public WordsTasck() {
    }


    public void selectByLength(int length) throws IOException {

        if (word.length() < length) {

        }
    }


    public void selectByLetter(int position, char letter) throws IOException {

        char[] myCharArray = this.word.toCharArray();
        if (myCharArray[position] == letter) {
            System.out.println(word);
        }
    }


    public void matchPattern(String pattern) throws IOException {
        if (word.startsWith(pattern))
            System.out.println(word);
    }


    public void canMakeWith(String s) {
        String s0, s1, s2, s3, s4, s5, swap;
        s0 = "test";
        s1 = s0;
        int t = s1.length();
        int j;


        for (int i = t ; i > 0; i--) {
            for (j = 0; j < t-1; j++) {
                int n;
                if (t > 2) {

                    if (t-2==t-j){
                        n=1;
                    }
                    else n=0;


                    s2 = s1.substring(0, j);
                    s3 = s1.substring(j, j + 1);
                    s4 = s1.substring(j + 1, j + 2-n);
                    s5 = s1.substring(j + 2-n, t);

                    //swap
                    swap = s4;
                    s4 = s3;
                    s3 = swap;
                    //swap end

                    s1 = s2 + s3 + s4 + s5;
                    if (s.contains(s1))
                        System.out.println(s);


                } else {
                    s2 = s1.substring(0, 1);
                    s3 = s1.substring(1, 2);
                    s1 = s3 + s2;
                    if (s.contains(s1))
                        System.out.println(s);

                }
            }
        }
    }



}


/*

    String s0 = "dcba";
    String s1 = s;
    String s2,s3;
    int t1 = s.length();
    int  count = fuctorial(t1);
    int t =t1-1;



    for (;count>0;count--) {
            for (int i = 0; i < t; i++) {
        s2 = s1.substring(0, t  - i);
        s3 = s1.substring(t - i, t+1 );
        s1 = s2.substring(0, s2.length() - 1) + s3 + s2.substring(s2.length() - 1, s2.length());

        }
        if (s0.contains(s1))
        System.out.println(s1);
        }
        }
public static int fuctorial( int t ) {
        return (t > 0) ? t * fuctorial(t - 1) : 1;
        }
        }

*/
























