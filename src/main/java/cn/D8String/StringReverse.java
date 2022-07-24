package cn.D8String;

/**
 * @author wq
 * @since 2022-06-15 下午9:02
 */

public class StringReverse {
    public static void main(String[] args) {

        String s = "abcdefg";

        char[] chars = s.toCharArray();

        String s1 = "";

        StringBuilder append = null;

        StringBuilder sb = new StringBuilder();

        for (int i = chars.length-1; i >= 0; i--) {
            append = sb.append(chars[i]);

        }
        s1 = append.toString();

        System.out.println(s1);

    }
}
