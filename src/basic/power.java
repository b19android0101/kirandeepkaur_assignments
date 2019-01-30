package basic;

import java.util.Scanner;

public class power {

	public static void main(String[] args) {
		int k=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number"); 
		int n=sc.nextInt();
		System.out.println("enter your power");
		int p=sc.nextInt();
		for(int i=1; i<=p; i++)
		{
			k=k*n;
		}
		System.out.println(k);
		
		}
		
		
		

	}


