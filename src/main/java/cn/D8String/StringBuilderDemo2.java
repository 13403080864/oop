package cn.D8String;



/**
 * @author wq
 * @since 2022-03-14 下午9:32
 * Append 添加任何参数，最终都会转换为一个字符串类
 */

public class StringBuilderDemo2 {

    public static void main(String[] args) {

        //stringBuilder2();  //100truech
        //stringBuilder();   //100true

        //stringBuilder3();
//        stringBuilder4();  //ab9d
//        stringBuilder5();  //dcba
//        stringBuilder6();  //4

        StringBuilderToString();

    }

    public static void StringBuilderToString(){

        //StringBuilder转换为String的方法  tostring

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("hello");

        String s = stringBuilder.toString();


        //String转StringBuilder

        String str ="hello world";

        StringBuilder sb = new StringBuilder(str);

        System.out.println(s);   //hello(字符串了)

        System.out.println(sb.append(11));   //hello world11(string转换为StringBuilder了)
    }




    public static void stringBuilder4(){

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("abcd");

        stringBuilder.setCharAt(2,'9');

        System.out.println(stringBuilder);   //ab9d
    }


    public static void stringBuilder5(){

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("abcd"); //4
        stringBuilder.reverse(); //
        System.out.println(stringBuilder);  //dcba

    }

    public static void stringBuilder6(){

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("aaaa");

        int length = stringBuilder.length();

        System.out.println(length); //4
    }


    public static void stringBuilder3(){

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("abcd");

        stringBuilder.insert(2,3);  //ab3cd

        stringBuilder.insert(3,"AA").insert(4,4);  //ab3A4Acd

        System.out.println(stringBuilder);
    }


    public static void stringBuilder2(){

        //方法调用链，stringBuilder返回值是stringBuilder对象
        //对象.方法（).方法（).方法（)....

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(100).append(true).append("ch");
        System.out.println(stringBuilder);

    }

    public static void stringBuilder(){

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(100);
        stringBuilder.append(true);

        System.out.println(stringBuilder);   //100true(字符串)
    }
}
