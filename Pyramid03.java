/*author: priyanshi-bairagi
  date: 02-06-2020
  
Nested For Loop
Pyramid Pattern :
								1
								1	2
								1	2	3
								1	2	3	4
								1	2	3	4	5	
*/
 
 class Pyramid03
 {
	public static void main(String args[])
	{
			int i,j;
			for(i=1;i<=5;i++)
			{	for(j=1;j<=i;j++)
				{
					System.out.print(j+"\t ");
				}
				System.out.println();
			}
	}
 }
 