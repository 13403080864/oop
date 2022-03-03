package cn.D7oop;

/**
 * @author wq
 * @since 2022-03-03 下午10:05
 */

public class CircleExer {
    private int r;

    public void setR(int radius){
        //把外界传入的参数设置为半径
        r = radius;
    }
    public double area(){

        double area = 3.14 * r * r;
        return area;
    }
    
    public static void main(String[] args) {
        CircleExer circleExer = new CircleExer();
        circleExer.setR(3);
        double area = circleExer.area();
        System.out.println(area);
    }
}
