package com.io;

import com.map.treeMap.Student;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author
 * @since 2021-10-10 上午11:48
 */

public class Exercise_Order01 {

    public static void main(String[] args) throws IOException {

        Exercise01_MyComparator mc = new Exercise01_MyComparator();

        TreeMap<String,String> map = new TreeMap<String,String>(mc);

        BufferedReader br = new BufferedReader(new FileReader("in.txt"));

        BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"));

        String line;
        while ((line = br.readLine()) != null){

            //分割
            String[] arr = line.split("\\.");

            //把分割好的存入TreeMap集合中
            map.put(arr[0],arr[1]);
        }

        for(Map.Entry entry:map.entrySet()){

            line = entry.getKey() + "." + entry.getValue();

            bw.write(line);
            bw.newLine();
        }

        bw.close();
        br.close();

    }

}
