package cn.D7oop;

/**
 * @author wq
 * @since 2022-03-03 下午10:05
 */

public class CircleExer {
    private int r;
    public double mainji(int i){

        double area = 3.14 * i * i;
        return area;
    }
    
    public static void main(String[] args) {
        CircleExer circleExer = new CircleExer();
        double mainji = circleExer.mainji(3);
        System.out.println(mainji);
    }
}
