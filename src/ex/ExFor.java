package ex;

public class ExFor {
    public static void main(String[] args) {
        int[] array = {20,30,10,50,40,45};//配列の宣言
        int sum = 0;//合計
        double ave = 0;//平均
        for (int i = 0; i < array.length; i++) {
            sum += array[i];//配列の値をsumに加える
        }
        System.out.println("合計:" + sum);
        ave = ((double)sum / array.length);//平均の計算
        System.out.println("平均:" + ave);
    }
}
