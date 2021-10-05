package ex;

import java.util.Scanner;

public class CalcBmi {
    /**
     * 実数の入力メソッド
     * @param message String 表示メッセージ
     * @return double 入力された値
     */
    static double inputDouble(String message) {
        Scanner scanner = new Scanner(System.in);//キーボード入力をするインスタンスを作成
        System.out.println(message);
        return scanner.nextDouble();//入力された値をdouble型で返す
    }
    public static void main(String[] args) {
        //身長体重
        double h = inputDouble("身長を入力してください（単位 m）");
        double w = inputDouble("体重を入力してください（単位 kg）");
        //BMI計算
        double BMI = Math.round((w / (h * h) * 10.0) / 10.0);
//        double BMI = 41;
//        Scanner scan = new Scanner(System.in);
//        double BMI = scan.nextDouble();

        //適正体重計算
        double bw = Math.round(h * h * 22 * 10.0) / 10.0;

        //誤差
        double diff = Math.round(((w - bw) * 10.0) / 10.0);

        //表示
        System.out.println("身長:" + (h * 100) + "cm");
        System.out.println("体重:" + w + "kg");
        System.out.println("BMI:" + BMI);
        System.out.println("適正体重:" + bw + "kg");
        System.out.println("誤差:" + diff + "kg");

        //BMI判定基準
        if (BMI >= 40) {
            System.out.println("判定：肥満(4度)");
        }else if (BMI >= 35){
            System.out.println("判定：肥満(3度)");
        }else if (BMI >= 30){
            System.out.println("判定：肥満(2度)");
        }else if (BMI >= 25){
            System.out.println("判定：肥満(1度)");
        }else if (BMI >= 18.5){
            System.out.println("判定：普通体重");
        }else{
            System.out.println("判定：低体重（瘦せ型）");
        }
    }
}