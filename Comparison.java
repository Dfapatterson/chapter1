package chapter1;
import java.util.Scanner;

public class Comparison 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.println("Enter First integer: ");
		num1 = input.nextInt();
		
		System.out.println("Enter second integer: ");
		num2 = input.nextInt();
		
		if (num1==num2)
			System.out.printf("%d==%d", num1, num2);
		
		System.out.println("\n*********        ***            *        *");
		System.out.println("*       *      *     *         ***      * *");
		System.out.println("*       *     *       *       *****    *   *");
		System.out.println("*       *     *       *         *     *      *");
 		
		
	}

}
