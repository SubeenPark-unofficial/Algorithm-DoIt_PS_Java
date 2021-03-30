import java.util.Scanner;

public class Q1_FactorialNoRecurrence {

    public static int factorial(int x){
        int fac = 1;
        for (int i = 1; i <= x; i++){
            fac = fac*i;
        }
        return fac;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요.：");
        int x = stdIn.nextInt();

        System.out.println(x + "의 팩토리얼은 " + factorial(x) + "입니다.");
    }
}
