package cn.D8String;

/**
 * @author wq
 * @since 2022-03-13 下午8:28
 */

public class RegexDemo {

    public static void main(String[] args) {

        //校验手机号码
        //第一位必须是1
        //第二位3-9
        //3-11位是0-9

        //定义手机号
        String num = "13409098900";
        String num2= "13p09098900";

        //定义表达式
        String regex = "1[3-9][0-9]{9}";

        //校验号码是否对 matches
        boolean matches = num.matches(regex);
        boolean matches2 = num2.matches(regex);

        System.out.println(matches); //true
        System.out.println(matches2); //false

        System.out.println("========");

        //根据数字分割,多个一起的按一起切
        String str = "ahffj234fhjj5jj5j0";
        String[] split = str.split("[0-9]+");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }

    }
}
