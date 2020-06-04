/*author: priyanshi-bairagi
  date: 04-06-2020
  
Nested For Loop
Pyramid Pattern :
				
				E
				DD
				CCC
				BBBB
				AAAAA
*/
 
 class Pyramid14
 {
	public static void main(String args[])
	{
			char i,j;
			for(i='E';i>='A';i--)
			{	for(j='E';j>=i;j--)
				{
					System.out.print(i);
				}
				System.out.println();
			}
	}
 }
 