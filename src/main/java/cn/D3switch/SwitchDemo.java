package cn.D3switch;

import java.util.Scanner;

/**
 * @author wq
 * @since 2022-02-26 下午3:20
 */

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入季节:");
        String season = scanner.nextLine();

        switch (season){
            case "spring":
                System.out.println("我喜欢春天");
                break;
            case "summer":
                System.out.println("我喜欢夏天");
                break;
            case "autumn":
                System.out.println("我喜欢秋天");
                break;
            case "winter":
                System.out.println("我喜欢冬天");
                break;
             //当前面几个都不匹配的时候
            default:
                System.out.println("我喜欢一年四季");
        }


    }
}
