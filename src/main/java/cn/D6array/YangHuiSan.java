package cn.D6array;

/**
 * @author wq
 * @since 2022-03-03 下午8:06
 */

public class YangHuiSan {
    public static void main(String[] args) {
        //创建二维数组
        int[][] yanghuiArr = new int[10][];
        for (int i = 0; i < yanghuiArr.length; i++) {
            //创建一维数组 初始化
            yanghuiArr[i] = new int[i+1];

            //遍历一维数组，并进行填充数据
            //yanghuiArr[i] 就是 下标刚好是外层循环为i的值，可以直接换i
            for (int j = 0; j <= i; j++) {
                //一头（一维数组下标为0的元素）一尾（为一维数组长度-1）是1
                if(j == 0 || j == i){
                    yanghuiArr[i][j] = 1;
                }else {
                    //中间的元素，是由上一行的两个元素相加 第一个值是[i-1][j-1],第二个值是[i-1][j]
                    yanghuiArr[i][j] = yanghuiArr[i-1][j-1] + yanghuiArr[i-1][j];
                }

            }
        }
        //遍历填充的二位数组
        for (int i = 0; i < yanghuiArr.length; i++) {
            int[] value = yanghuiArr[i];
            for (int j = 0; j < value.length; j++) {
                System.out.print(value[j] + "\t");
            }
            System.out.println();
        }
    }
}
