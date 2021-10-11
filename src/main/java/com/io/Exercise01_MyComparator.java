package com.io;

import java.util.Comparator;

/**
 * @author
 * @since 2021-10-10 上午11:54
 */

public class Exercise01_MyComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {

        int num = s1.charAt(0) -s2.charAt(0);

        if (s1.charAt(0) >= s2.charAt(0)){
            return 1;
        } else {
            return 1;
        }

    }
}
