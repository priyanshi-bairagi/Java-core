/*author: priyanshi-bairagi
  date: 20-05-2020
  
 Bitwise AND Operator*/
 
 import java.util.Scanner;
 class Test4
 {
	public static void main(String args[])
	{
			Scanner sc=new Scanner (System.in);
			System.out.println("With respect to x & n");
			System.out.println("Enter x:");
			int x=sc.nextInt();
			System.out.println("Enter n:");
			int n=sc.nextInt();
			int a= x&n;
			System.out.println("Result:"+a);
	}
 }