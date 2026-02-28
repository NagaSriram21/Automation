package Practice;

public class StringCharcaters {

	public static void main(String[] args) {
		String str = "I AM Learing Automation";   
	       int count = 0;   
	       System.out.println("The entered string is: "+str);   
	       //Count the characters in the string except space   
	       for(int i = 0; i < str.length(); i++)
	       {   
	           if(str.charAt(i) != ' ')   
	               count++;  // count=count+1; 
	       }               
	       //Displays the total number of characters in the string   
	       System.out.println("Total number of characters in the string: " + count);   
		}


}
