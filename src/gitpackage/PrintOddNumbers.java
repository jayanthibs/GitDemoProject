package gitpackage;

import java.util.Scanner;

public class PrintOddNumbers {
//Adding this comment to check pull option
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the Limit:");
		int n=in.nextInt();
		System.out.println("The Odd Numbers are:");
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}

}
