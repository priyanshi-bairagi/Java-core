/*author: priyanshi-bairagi
  date: 03-06-2020
  
Nested For Loop
Pyramid Pattern :
							54321
							5432
							543
							54
							5
*/
 
 class Pyramid09
 {
	public static void main(String args[])
	{
			int i,j;
			for(i=1;i<=5;i++)
			{	for(j=5;j>=i;j--)
				{
					System.out.print(j);
				}
				System.out.println();
			}
	}
 }
 