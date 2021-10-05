package intro.operator;

//関係演算子による条件の書き方
public class RelationalOperatorSample {
    public static void main(String[] args) {
        int num = 100;

        //numが0以上である
        System.out.println(num + " >= 0:" + (num >= 0));


        //numが100以下である
        System.out.println(num + " <= 0:" + (num <= 100));

        //numが奇数である
        System.out.println(num + " % 2 == 1:" + (num % 2 == 1));

        //numが3の倍数である
        System.out.println(num + " % 3 == 0:" + (num % 3 == 0));

        //numが0以上かつ100以下である
        System.out.println(num >= 0 && num <= 100);
        System.out.println(!(num < 0 || num > 100));

    }
}
