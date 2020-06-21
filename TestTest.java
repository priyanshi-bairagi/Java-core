/*author: priyanshi-bairagi
  date: 08-06-2020
  
 */
  
  public class TestTest
  {
	  public static void main(String args[])
	  {
		 Super s= new Subclass();
		 s.foo();
		}
	}
	class Super {
		void foo() {
		  System.out.println("Super");
		  }
	}
	class Subclass extends Super {
		static void foo() {
		  System.out.println("Subclass");
	  }
  }