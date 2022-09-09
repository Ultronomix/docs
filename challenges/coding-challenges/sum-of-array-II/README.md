# Problem: Sum of Array II Solution

**Tasks**
1. create the class SumOfArrayII
2. Get user input for array size
3. Let the user enter in their own values
4. print out the sum of the array

public class SumOfArrayII {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8};
        //index numbers 0  1  2  3  4  5  6  7

        int sum = 0;

        for (int j : array1) {
            sum = sum + j;
        }
        System.out.println("Sum of all the elements of an array: " + sum);
    }
    
}
