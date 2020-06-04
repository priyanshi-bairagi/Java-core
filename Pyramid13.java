/*author: priyanshi-bairagi
  date: 04-06-2020
  
Nested For Loop
Pyramid Pattern :
				
				E
				ED
				EDC
				EDCB
				EDCBA
*/
 
 class Pyramid13
 {
	public static void main(String args[])
	{
			char i,j;
			for(i='E';i>='A';i--)
			{	for(j='E';j>=i;j--)
				{
					System.out.print(j);
				}
				System.out.println();
			}
	}
 }
 