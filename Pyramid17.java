/*author: priyanshi-bairagi
  date: 07-06-2020
  
Nested For Loop
Pyramid Pattern :
				
				EDCBA
				EDCB
				EDC
				ED 
				E
*/
 
 class Pyramid17
 {
	public static void main(String args[])
	{
			char i,j;
			for(i='A';i<='E';i++)
			{	for(j='E';j>=i;j--)
				{
					System.out.print(j);
				}
				System.out.println();
			}
	}
 }
 