/*author: priyanshi-bairagi
  date: 03-06-2020
  
Nested For Loop
Pyramid Pattern :
							55555
							4444
							333
							22
							1
*/
 
 class Pyramid10
 {
	public static void main(String args[])
	{
			int i,j;
			for(i=5;i>=1;i--)
			{	for(j=1;j<=i;j++)
				{
					System.out.print(i);
				}
				System.out.println();
			}
	}
 }
 