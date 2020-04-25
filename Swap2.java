/*author: priyanshi-bairagi
  date: 22-04-2020
  
  Ques: WAP to perform swapping between two given numbers without using third variable*/
  
  class Swap2
  {
	  public static void main(String args[])
	  {
		  int a=10,b=20;
		  System.out.println("Before swap a="+a+"and b="+b);
		  a=a+b;
		  b=a-b;
		  a=a-b;
		  System.out.println("After swap a="+a+" and b="+b);
	  }
  }