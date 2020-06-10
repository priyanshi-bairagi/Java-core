/*author: priyanshi-bairagi
  date: 10-06-2020
  
Nested For Loop
Pyramid Pattern :
				
				1
				2 3
				4 5 6
				7 8 9 10
*/
 
 class Pyramid19
 {
	public static void main(String args[])
	{
			int i,j,k=1;
			for(i=1;i<=4;i++)
			{	for(j=1;j<=i;j++)
				{
					System.out.print(k+" ");
					k++;
				}
				System.out.println();
			}
	}
 }
 