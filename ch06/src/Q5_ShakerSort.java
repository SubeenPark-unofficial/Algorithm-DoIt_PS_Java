import java.util.Scanner;

public class Q5_ShakerSort {
    static void swap(int[] a, int idx1, int idx2) {
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }

    static void shakerSort(int[] a, int n) {
        int left = 0;
        int right = n - 1;
        int passCnt = 0;

        while (left < right) {
            passCnt++;
            if (left % 2 == 0) { // left -> right : biggest to right
                int last = left;
                for (int i = left; i < right; i++) {
                    if (a[i] > a[i+1]) {
                        swap(a, i, i+1);
                        last = i;
                    }
                }
                right = last;
            } else { // right -> left : smallest to left
                int last = right;
                for (int i = right; i > left; i--) {
                    if (a[i] < a[i-1]) {
                        swap(a, i, i-1);
                        last = i;
                    }
                }
                left = last;
            }
        }

    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("양방향 버블정렬(셰이커정렬)");
        System.out.print("요솟수：");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "]：");
            x[i] = stdIn.nextInt();
        }

        shakerSort(x, nx); // 배열 x를 양방향 버블정렬

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++)
            System.out.println("x[" + i + "]＝" + x[i]);
    }
}
