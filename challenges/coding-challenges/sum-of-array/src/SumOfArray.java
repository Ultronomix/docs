public class SumOfArray {
public static void main(String[] args) {
        System.out.println(solution(new int[] {1, 2, 3, 4}));

        }

public static int solution(int[] array) {
    int total = 0;

    for(int x: array) {
        total += x;
    }

    return total;
    }
}