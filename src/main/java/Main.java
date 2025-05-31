import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("data_prog_contest_problem_1.txt"));
        int n = sc.nextInt();
        int[][] intervals = new int[n][2];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            intervals[i][0] = a;
            intervals[i][1] = b;
        }

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));

        List<Integer> points = new ArrayList<>();
        int lastPoint = -1;

        for (int[] interval : intervals) {
            if (lastPoint < interval[0]) {
                lastPoint = interval[1];
                points.add(lastPoint);
            }
        }

        System.out.println(points.size());
    }
}
