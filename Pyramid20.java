/*author: priyanshi-bairagi
  date: 19-06-2020
  
Nested For Loop
Pyramid Pattern :
						*
					   **
					  ***
					 ****
					*****
*/
 
 class Pyramid20
 {
	public static void main(String args[])
	{
			int i,j,k;
			for(i=1;i<=5;i++)
			{	for(j=4;j>=i;j--)
				{
					System.out.print(" ");
				}
				for(k=1;k<=i;j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
	}
 }
 