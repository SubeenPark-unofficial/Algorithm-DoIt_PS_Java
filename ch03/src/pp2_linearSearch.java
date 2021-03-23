import java.util.Scanner;

public class pp2_linearSearch {
    static int seqSearchEx(int[] a, int n, int key){
        // first line
        System.out.printf("   ");
        for (int i = 0; i < n; i++){
            System.out.printf(" " + a[i] + " ");
        }
        System.out.println();

        // section bar
        System.out.println("---+------------------------------");

        // search detail: use sentinel search
        int idx;
        for (idx = 0; idx < n; idx++){

            // top
            System.out.printf("   " + "|");
            for (int i = 0; i < idx; i++){
                System.out.printf("   ");
            }
            System.out.printf(" * ");
            for (int i = idx; i < n; i++){
                System.out.printf("   ");
            }
            System.out.println();

            // middle
            System.out.printf(" " + idx + " |");
            for (int i = 0; i < n; i++) {
                System.out.printf(" " + a[i] + " ");
            }
            System.out.println();

            // bottom
            System.out.println("   |                              ");

            if (a[idx] == key) return key;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수：");
        int num = stdIn.nextInt();
        int[] x = new int[num]; // 요솟수 num인 배열

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]：");
            x[i] = stdIn.nextInt();
        }

        System.out.print("찾는 값："); // 키 값을 입력 받음
        int ky = stdIn.nextInt();

        int idx = seqSearchEx(x, num, ky); // 배열 x에서 값이 ky인 요소를 검색

        if (idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println(ky + "은 " + "x[" + idx + "]에 있습니다.");
    }
}
