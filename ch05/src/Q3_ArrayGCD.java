import java.util.Scanner;

public class Q3_ArrayGCD {

    public static int gcd(int x, int y){
        int bigger = (x > y) ? x : y;
        int smaller = (x > y) ? y : x;

        int r = smaller;
        while (bigger%smaller != 0) {
            r = bigger % smaller;
            bigger = smaller;
            smaller = r;
        }
        return r;
    }

    public static int gcdArray(int[] a, int start_idx, int num){

        if (num == 0) return 0;
        else if (num == 1) return a[0];
        else if (num == 2) return gcd(a[0], a[1]);
        else return gcd(gcdArray(a, start_idx+1, num-1), a[start_idx]);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("정수 몇 개의 최대 공약수를 구할까요?：");
        int num;
        do {
            num = stdIn.nextInt();
        } while (num <= 1);

        int[] x = new int[num]; // 길이 num인 배열

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]：");
            x[i] = stdIn.nextInt();
        }

        System.out.println("최대 공약수는 " + gcdArray(x, 0, num) + "입니다.");
    }

}
