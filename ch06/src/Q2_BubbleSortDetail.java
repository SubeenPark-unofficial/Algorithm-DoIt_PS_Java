import java.util.Scanner;

public class Q2_BubbleSortDetail {

    static void swap(int[] a, int idx1, int idx2) {
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }

    static void printDetail(int[] a, int n, int j, boolean swap) {
        String swapString = swap ? "+" : "-";
        for (int i = 0; i < j; i++) {
            System.out.printf(a[i] + " ");
        }

        System.out.printf(a[j] + swapString + a[j+1] + " ");

        for (int i = j+2; i < n; i++){
            System.out.printf(a[i] + " ");
        }

        System.out.println();
    }

    static void bubbleSort(int[] a, int n){
        int compareCnt = 0;
        int swapCnt = 0;

        for (int i = 0; i < n - 1; i++) {
            System.out.println("패스" + (i + 1));
            for (int j = n-1; j > i; j--) {
                compareCnt++;
                if (a[j-1] > a[j]) {
                    printDetail(a, n, j-1, true);
                    swap(a, j-1, j);
                    swapCnt++;
                } else {
                    printDetail(a, n, j-1, false);
                }
            }
            for (int num:a) {
                System.out.printf(num + " ");
            }
            System.out.println();
        }

        System.out.println("비교를 " + compareCnt +"회 했습니다.");
        System.out.println("교환을 " + swapCnt +"회 했습니다.");
    }


    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("단순교환정렬  (버블정렬)");
        System.out.print("요솟수：");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "]：");
            x[i] = stdIn.nextInt();
        }

        bubbleSort(x, nx); // 배열 x를 단순교환정렬
    }

}
