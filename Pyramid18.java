/*author: priyanshi-bairagi
  date: 09-06-2020
  
Nested For Loop
Pyramid Pattern :
				
				AAAAA
				BBBB
				CCC
				DD
				E
*/
 
 class Pyramid18
 {
	public static void main(String args[])
	{
			char i,j;
			for(i='A';i<='E';i++)
			{	for(j='E';j>=i;j--)
				{
					System.out.print(i);
				}
				System.out.println();
			}
	}
 }
 