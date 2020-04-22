/*author: priyanshi-bairagi
  date: 22-04-2020
  
  Ques: WAP to perform swapping between two given numbers with using third variable*/
  
  class Swap1
  {
	  public static void main(String args[])
	  {
		  int a=10,b=20,c;
		  System.out.println("Before swap a="+a+"and b="+b);
		  c=a;
		  a=b;
		  b=c;
		  System.out.println("After swap a="+a+" and b="+b);
	  }
  }