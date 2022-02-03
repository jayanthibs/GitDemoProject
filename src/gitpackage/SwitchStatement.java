package gitpackage;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a=in.nextInt();
		int b=in.nextInt();
		System.out.println("Enter the string:");
		char ch=in.next().charAt(0);
		System.out.println("The Options are :\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
		System.out.println("Enter the Option:");
		int c=in.nextInt();
		switch(c)
		{
		case 1:
			System.out.println("Addition of a and b:"+(a+b));
			break;
		case 2:
			System.out.println("Subtraction of a and b:"+(a-b));
			break;
		case 3:
			System.out.println("Multiplication of a and b:"+(a*b));
			break;
		case 4:
			System.out.println("Division of a and b:"+(a/b));
			break;
		 default:
			   System.out.println("None of the above");
		}
		switch(ch)
		{
		case 'M':	
			System.out.println("Male");
			break;
		case 'F':	
			System.out.println("Female");
			break;
	   default:
		   System.out.println("None of the above");
			
		}
	}

	
}
