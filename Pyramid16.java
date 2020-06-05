/*author: priyanshi-bairagi
  date: 05-06-2020
  
Nested For Loop
Pyramid Pattern :
				
				EEEEE
				DDDD
				CCC
				BB
				A
*/
 
 class Pyramid16
 {
	public static void main(String args[])
	{
			char i,j;
			for(i='E';i>='A';i--)
			{	for(j='A';j<=i;j++)
				{
					System.out.print(i);
				}
				System.out.println();
			}
	}
 }
 