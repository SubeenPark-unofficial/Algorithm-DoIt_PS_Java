import java.util.Arrays;
import java.util.Scanner;

public class pp6_insertionPoint {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수：");
        int num = stdIn.nextInt();
        int[] x = new int[num]; // 요솟수 num인 배열

        System.out.println("오름차순으로 입력하세요.");

        System.out.print("x[0]："); // 맨 앞 요소를 입력 받음
        x[0] = stdIn.nextInt();

        for (int i = 1; i < num; i++) {
            do {
                System.out.print("x[" + i + "]：");
                x[i] = stdIn.nextInt();
            } while (x[i] < x[i - 1]); // 하나 앞의 요소보다 작으면 다시 입력
        }

        System.out.print("찾는 값："); // 키 값을 입력 받음
        int ky = stdIn.nextInt();

        int idx = Arrays.binarySearch(x, ky); // 배열 x에서 값이 ky인 요소를 검색

        if (idx < 0) {
            int insPt = -idx - 1;
            System.out.println("insertion point: " + insPt);
        } else
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");
    }


}
