package basic;

import java.util.Scanner;
 
public class fibonaci {

	public static void main(String[] args) {
		{
		int n, a=0,b=1,c=2,d;
		Scanner sc=new Scanner(System .in);
		System.out.println("enter the limit of series");
		n=sc.nextInt();
		System.out.println(+a +"\n" +b +"\n" +c );
		for(int i=1;i<=n-3;i++)
		{
			d=a+b+c;
			System.out.println(+d);
			a=b;
			b=c;
			c=d;
		}
		
		}

	}

}
