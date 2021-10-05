package ex;

import java.util.Arrays;

public class MaxSample {
    public static void main(String[] args) {
        int[] array = {20,30,10,50,40,45,60};//配列の宣言
        int max = array[0];//仮の最大値
        int min = array[0];//仮の最小値
        for (int num : array) {
            if (max < num){//最大値の処理
                max = num;
            }
            if (min > num){//最小値の処理
                min = num;
            }
        }
        //表示部分
        System.out.println(Arrays.toString(array));
        System.out.println("最大値:" + max);
        System.out.println("最小値:" + min);
    }
}
