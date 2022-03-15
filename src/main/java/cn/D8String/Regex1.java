package cn.D8String;

/**
 * @author wq
 * @since 2022-03-14 下午9:29
 */
//字符串 正则表达式分割
public class Regex1 {
    public static void main(String[] args) {

        String str = "ahffj234fhjj5jj5j0";
        String[] split = str.split("[0-9]+");

        for (int i = 0; i < split.length; i++) {

            System.out.println(split[i]);   //ahffj      fhjj     jj    j

        }
    }
}