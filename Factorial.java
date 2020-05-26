/*author: priyanshi-bairagi
  date: 26-05-2020
  
 WAP to calculate factorial of given number*/
 
 import java.util.Scanner;
 class Factorial
 {
	public static void main(String args[])
	{
			int n=5,f=1;
			while(n>1)
			{
				f=f*n;
				n--;
			}
			System.out.println("Factorial:"+f);
	}
 }
 
 /*
 
 This will calculate upto 13! but in C, we have to use long int for 13! because in C this will calculate upto 7! only.
 (Range for int is small in C)
 
 */