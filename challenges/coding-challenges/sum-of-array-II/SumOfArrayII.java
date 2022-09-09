import java.util.Scanner;

public class SumOfArrayII{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the array size >");
        int x = sc.nextInt();
        int[] y = new int[x];
        int sum=0;
        for(int i = 0 ; i < x ; i++){
            System.out.print("Please enter values into the array >");
            y[i] = sc.nextInt();
            sum = sum + y[i];
        }
        System.out.println("The sum value = " +sum );
    }
}