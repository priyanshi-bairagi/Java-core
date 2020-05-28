/*author: priyanshi-bairagi
  date: 28-05-2020
  
Continue Statement 
WAP to print odd numbers between 1 to 10		 */
 
 class TestContinue
 {
	public static void main(String args[])
	{
			int i;
			for(i=1;i<=10;i++)
			{
				if(i%2==0)
					continue;
				System.out.print(i+"\t");
				
			}
			
	}
 }
 