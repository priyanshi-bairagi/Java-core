/*author: priyanshi-bairagi
  date: 27-05-2020
  
 Break Statement 
WAP to print 1 to 10		 */
 
 class TestBreak
 {
	public static void main(String args[])
	{
			int i=1;
			for(;;)
			{
				if(i>10)
					break;
				System.out.print(i+"\t");
				i++;
			}
			
	}
 }
 