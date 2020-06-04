/*author: priyanshi-bairagi
  date: 04-06-2020
  
Nested For Loop
Pyramid Pattern :
				
				A
				AB
				ABC
				ABCD
				ABCDE
*/
 
 class Pyramid11
 {
	public static void main(String args[])
	{
			char i,j;
			for(i='A';i<='E';i++)
			{	for(j='A';j<=i;j++)
				{
					System.out.print(j);
				}
				System.out.println();
			}
	}
 }
 