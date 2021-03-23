import java.util.Scanner;

public class pp1_seqSearchSen {
    static int seqSearchSen(int[] a, int n, int key){
        a[n] = key;
        int idx;
        for (idx = 0; a[idx] != key; idx++){
            ;
        }
        return idx == n ? -1 : idx;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수：");
        int num = stdIn.nextInt();
        int[] x = new int[num + 1]; // 요솟수 num + 1인 배열

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]：");
            x[i] = stdIn.nextInt();
        }

        System.out.print("찾는 값："); // 키 값을 입력 받음
        int ky = stdIn.nextInt();

        int idx = seqSearchSen(x, num, ky); // 배열 x에서 값이 ky인 요소를 검색

        if (idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");
    }

}
