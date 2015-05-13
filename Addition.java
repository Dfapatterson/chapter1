package chapter1;
import java.util.Scanner;

public class Addition 
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int num1;
		int num2;
		int sum;
		
		System.out.print("Enter first num: ");
		num1 = input.nextInt();
		
		System.out.print("Enter second num: ");
		num2 = input.nextInt();
		
		sum = num1+num2;
		System.out.printf("The sume is: %d", sum);
	}

}
