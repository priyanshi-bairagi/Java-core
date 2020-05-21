/*author: priyanshi-bairagi
  date: 21-05-2020
  
 Conditional Statements
 if-else if-else clause
 Ques: Check if given year is a leap year or not. */
 
 
 class Test9
 {
	public static void main(String args[])
	{
		int a=2019;
		if(a%400==0)
		{
			System.out.println("Leap Year");
		}
		else if(a%100==0)
		{
			System.out.println("Not leap year");
		}
		else if(a%4==0)
		{
			System.out.println("Leap Year");
		}
		else
		{	
			System.out.println("Not Leap year");
		}
	}
 }