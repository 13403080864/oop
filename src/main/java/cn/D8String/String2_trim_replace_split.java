package cn.D8String;

/**
 * @author wq
 * @since 2022-03-13 下午4:31
 */

public class String2_trim_replace_split {

    public static void main(String[] args) {

        //String 的去掉空格，去掉前面后面的空格，中间不去掉

        String str = "  trim   ";
        String s = str.trim();

        System.out.println(s);    //trim

        //String 的替换,注意 要是没有改字符，则不替换 ，例如：O 替换成M 字符串串 是 o 所以不能替换

        String str2 = "how do you do";
        String replace = str2.replace("o", "N");

        System.out.println(replace);  //hNw dN yNu dN

        //String 的分割 ,分割后是用数组存起来的

        String str3 = "aa,bb,cc";
        String[] split = str3.split(",");


        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);  //aa bb cc
        }
    }
}
