//* Sum of array */

public class SumOfArray {
    public static void main(String[] args) {
        
        int[] numbers = {1, 2, 3, 4, 5};

        int total = 0;

        for (int i : numbers) {
            total += numbers[i-1];
        }

        System.out.print("Numbers in array: ");

        for (int i : numbers) {
            System.out.print(numbers[i-1] + " ");
        }

        System.out.println("\nTotal is: " + total);
    }
    
}