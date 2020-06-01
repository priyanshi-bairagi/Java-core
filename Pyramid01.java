/*author: priyanshi-bairagi
  date: 01-06-2020
  
Nested For Loop
Pyramid Pattern :
								*
								**
								***
								****
								*****		 
*/
 
 class Pyramid01
 {
	public static void main(String args[])
	{
			int i,j;
			for(i=1;i<=5;i++)
			{	for(j=1;j<=i;j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
	}
 }
 