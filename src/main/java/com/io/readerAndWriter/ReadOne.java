package com.io.readerAndWriter;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author wq
 * @since 2022-05-22 下午4:21
 */

public class ReadOne {


    @Test
    public void test1() throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("a.txt"));
        String str = null;
        while ((str = br.readLine()) != null){
            System.out.println(str);

        }
    }
}
