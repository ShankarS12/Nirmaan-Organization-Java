package day24;

public class PalindromeEx {
	public static void main(String[] args) {
		
		//for string palindrome
		//1st method
		String name = " S Shankar ";
		
		String removedSpace = "";
		for(char value : name.toCharArray()) {
			if((value == ' ')||(value == 'a')||(value == 'e')||(value == 'i')||(value == 'o')||(value == 'u')) //for removing a vowels
			{
				
			}
			else {
				removedSpace += value;
			}
		}
		
		System.out.println(removedSpace);
		
		
		//2nd method
		String removedSpace1 = name.replace(" " , "");
		
		System.out.println(removedSpace1);
		
		String reverse = "";
		for(int j = removedSpace1.length()-1; j>=0; j--) {
			 reverse += removedSpace1.charAt(j);
		}
		
		System.out.println(reverse);
	
		
		
		
	}

}
