package javachallenges;

public class JavaChallenge1 {

	public static void main(String[] args) {

		//Example 1: 
		String s = "Hello World";
		String[] wordlist = s.trim().split("\\s+");
		int lastword = wordlist[wordlist.length-1].length();

		System.out.println(" The last word is \"World\" with length :  " + lastword);

		//Example 2:
		String input = "   fly me   to   the moon  ";
		String[] wordnew = input.trim().split("\\s+");
		int  lastwords= wordnew[wordnew.length-1].length();
		System.out.println(" The last word is \"moon\" with length : " + lastwords);
		
		//Example 3:
		
		String inputs = "luffy is still joyboy";
		String[] wordnews = inputs.trim().split("\\s+");
		int  lastwordss= wordnews[wordnews.length-1].length();
		System.out.println(" The last word is \"joyboy\" with length : " + lastwordss);
		
	}

}
