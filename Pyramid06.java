/*author: priyanshi-bairagi
  date: 02-06-2020
  
Nested For Loop
Pyramid Pattern :
								5
								4	4	
								3	3	3
								2	2	2	2
								1	1	1	1	1
*/
 
 class Pyramid06
 {
	public static void main(String args[])
	{
			int i,j;
			for(i=5;i>=1;i--)
			{	for(j=5;j>=i;j--)
				{
					System.out.print(i+"\t");
				}
				System.out.println();
			}
	}
 }
 