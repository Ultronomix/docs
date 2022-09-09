//By: Max Gabel
import java.util.InputMismatchException;
import java.util.Scanner;

public class GitHubCodeChallange 
{

	public static void main (String [] args)
	{
		
		SumOfArrayII obj1 = new SumOfArrayII();
		
		Scanner keyboard = new Scanner(System.in);
		boolean loopbreaker = true;
		
		do
		{
			System.out.println("How big would you like the array? Enter an integer value:");
			try
			{
				obj1.setArraySize(keyboard.nextInt());
				loopbreaker = false;
			}
			catch(InputMismatchException i)
			{
				System.out.print("Must be an integer value. Continue? Enter yes or no: ");
				if(!keyboard.nextLine().toLowerCase().contains("y"))
				{
					loopbreaker = false;
				}
			}
		}while(loopbreaker);
		
		
		for(int b = 0 ; b< obj1.getArrayS(); b++)
		{
			System.out.println("Enter next double value to enter in the array:");
			try 
			{
				obj1.addToArray(keyboard.nextDouble());
				
			}
			catch(InputMismatchException i)
			{
				System.out.println("Must be an double value.");
				keyboard.nextLine();
				b--;
			}
		}
		
		System.out.print("The total of the array is: " + obj1);
		
	}
	
}
