/*author: priyanshi-bairagi
  date: 25-05-2020
  
  Looping Structures(Loops)
  While loop
  Ques: WAP to print following series: 1 4 9 16 25 36 49 64 81 100*/
  class Series3
  {
	public static void main(String args[])
	{
		int i=1;
		while(i<=10)
		{
			System.out.print((i*i)+"\t");
			i++;
		}
	}
  }
  
  /*
	OR	without using *
	
	int i=1,j=3;
	while(i<=100)
	{
		System.out.print(i+"\t");
		i=i+j;
		j=j+2;
	}
	
	OR
	
	int i=1,j=1,k=0;
	while(i<=10)
	{
		k=j+k;
		System.out.print(k+"\t");
		j=j+2;
		i++;	
	}
	
	
  */