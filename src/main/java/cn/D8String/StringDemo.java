package cn.D8String;

/**
 * @author
 * @since 2022-03-08 下午8:49
 */

public class StringDemo {

    public static void main(String[] args) {

        //stringConsChar();
        stringConsChar2();
    }


    public static void stringConsChar(){

        char[] ch = {'a','b','c','d'};

        //转换为字符串，直接把字符数组传进去,全部转换

        String s = new String(ch);

        System.out.println(s);   //abcd
    }


    public static void stringConsChar2(){

        char[] ch = {'a','b','c','d'};

        //转换为字符串，从索引 1 转换2个字符

        String s = new String(ch,1,2);

        System.out.println(s);   //bc
    }

}
