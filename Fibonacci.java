/*
  author: priyanshi-bairagi
  date: 24-05-2020
  
  Looping Structures(Loops)
  While loop
  Ques: WAP to print first n values of Fibonacci Series. 


	0	1	1	2	3	5	8	13	21	34 _ _ _

*/


/* import java.util.Scanner; */
  
  class Fibonacci 
  {
	public static void main(String args[])
	{
		int a=0,b=1,c,n=7,i=1;
		
	    /*
			Scanner sc=new Scanner (System.in);
			System.out.println("Enter n:");
			n=sc.nextInt();
		*/
		
		while(i<=n)
		{	c=a+b;
			System.out.print(a+"\t");
			a=b;
			b=c;
			i++;
		}
	}
  }
  
  
/*

	OR
	
	int a=0,b=1,c,n=7,i=1;
	System.out.print(a+"\t"+b+"\t");
	while(i<=(n-2))
	{
		c=a+b;
		System.out.print(c+"\t");
		a=b;
		b=c;
		i++;
	}

	Replace i=1 with i=3 and while(i<=(n-2) with while(i<=n)) to reduce complexity of this program.
*/
  