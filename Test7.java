/*author: priyanshi-bairagi
  date: 21-05-2020
  
 Nested Ternary Operator 
 Ques: WAP to findout greatest value in 3 given numbers */
 
 
 class Test7
 {
	public static void main(String args[])
	{
		int a=10,b=20,c=30;
		a=a>b?(a>c?a:c):(b>c?b:c);
		System.out.println(a);
	}
 }