import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class pp7_customSearch {
    static class PhyscData {
        private String name;
        private int height;
        private double vision;

        public PhyscData(String name, int height, double vision){
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        @Override
        public String toString() {
            return name + " " + height + " " + vision;
        }

        public static final Comparator<PhyscData> VISION_ORDER = new VisionOrderComparator();

        public static class VisionOrderComparator implements Comparator<PhyscData> {
            @Override
            public int compare(PhyscData o1, PhyscData o2) {
                return Double.compare(o1.vision, o2.vision);
            }
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        PhyscData[] x = { // 배열의 요소는 시력순이지 않으면 안됩니다.
                new PhyscData("이나령", 162, 0.3), new PhyscData("유지훈", 168, 0.4), new PhyscData("전서현", 173, 0.7),
                new PhyscData("김한결", 169, 0.8), new PhyscData("이호연", 174, 1.2), new PhyscData("홍준기", 171, 1.5),
                new PhyscData("이수민", 175, 2.0), };
        System.out.print("찾는 시력은：");
        double vision = stdIn.nextDouble(); // 키 값을 입력 받음
        int idx = Arrays.binarySearch(x, // 배열 x에서
                new PhyscData("", 0, vision), // 키가 vision인 요소를
                PhyscData.VISION_ORDER // VISION_ORDER를 사용하여 검색
        );

        if (idx < 0)
            System.out.println("그 값의 요소가 없습니다.");
        else {
            System.out.println("그 값은 " + "x[" + idx + "]에 있습니다.");
            System.out.println("데이터：" + x[idx]);
        }
    }
}


