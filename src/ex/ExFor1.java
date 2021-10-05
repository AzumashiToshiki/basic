package ex;

public class ExFor1 {
    public static void main(String[] args) {
        int[] array = {20,30,10,50,40,45};//配列の宣言
        int sum = 0;//合計

        for (int num:array) {
            sum += num;
        }
        System.out.println("合計:" + sum);
    }
}
