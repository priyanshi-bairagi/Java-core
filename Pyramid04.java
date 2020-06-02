/*author: priyanshi-bairagi
  date: 02-06-2020
  
Nested For Loop
Pyramid Pattern :
								1
								2	2
								3	3	3
								4	4	4	4
								5	5	5	5	5
*/
 
 class Pyramid04
 {
	public static void main(String args[])
	{
			int i,j;
			for(i=1;i<=5;i++)
			{	for(j=1;j<=i;j++)
				{
					System.out.print(i+"\t");
				}
				System.out.println();
			}
	}
 }
 