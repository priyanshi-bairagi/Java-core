/*author: priyanshi-bairagi
  date: 04-06-2020
  
Nested For Loop
Pyramid Pattern :
				
				A
				BB
				CCC
				DDDD
				EEEEE
*/
 
 class Pyramid12
 {
	public static void main(String args[])
	{
			char i,j;
			for(i='A';i<='E';i++)
			{	for(j='A';j<=i;j++)
				{
					System.out.print(i);
				}
				System.out.println();
			}
	}
 }
 