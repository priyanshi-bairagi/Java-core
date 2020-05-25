/*
  author: priyanshi-bairagi
  date: 25-05-2020
  
  Looping Structures(Loops)
  While loop
  Ques: WAP to print following series: 1/1 + 2/4 + 3/9 + 4/16 + 5/25 + 6/36 + 7/49 + 8/64 + 9/81 + 10/100    

*/
  class Series5
  {
	public static void main(String args[])
	{
		int i=1;
		while(i<=9)
		{
			System.out.print(i+"/"+(i*i)+" + ");
			i++;
		}
		System.out.println(i+"/"+(i*i));
	}
  }
  