/*author: priyanshi-bairagi
  date: 22-05-2020
  
  Switch Case
  Ques: WAP to check given alphabet is consonant or vowel. */
 
 class Test13
 {
	public static void main(String args[])
	{
			char ch='i';
			switch(ch)
			{	case 'a':
					System.out.println("Vowel"); 
					break;
				case 'e':
					System.out.println("Vowel");
					break;
				case 'i':
					System.out.println("Vowel");
					break;
				case 'o':
					System.out.println("Vowel");
					break;
				case 'u':
					System.out.println("Vowel");
					break;
				default:
					System.out.println("Consonant");
			}
	}
 }
 
 
 
 /*
		or
		
		switch(ch)
			{	case 'a':					
				case 'e':					
				case 'i':					
				case 'o':
				case 'u':
					System.out.println("Vowel");
					break;
				default:
					System.out.println("Consonant");
			}
			
*/