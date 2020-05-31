/*author: priyanshi-bairagi
  date: 31-05-2020
  
For loop and use of boolean data type.
WAP to  check given number is prime or not .		 */
 
 class Test15
 {
	public static void main(String args[])
	{
			int i,n=7;
			boolean f=false;	// f for flagbit
			int a;
			a=n/2;
			for(i=2;i<=a;i++)
			{
				if(n%i==0)
				{	f=true;
				    break;
				}
			}
			if(f)
			{
				System.out.println("Non-Prime");
			}
			else
			{
				System.out.print("Prime");
			}
	}
 }
 