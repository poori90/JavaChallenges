package javachallenges;

public class JavaChallenge3 {

	public void checkPalindrome(String s) {
		String givenText = s;
		//String s = "A man, a plan, a canal: Panama";
		
		s.trim();
		s=s.replaceAll("\\s", "");
		s=s.replaceAll("[^a-zA-Z]", "");
		s=s.toLowerCase();
		String s_rev = new StringBuilder(s).reverse().toString();
		
		if(s.equals(s_rev)) {
			System.out.println("True : " +  givenText + " is Palindrome ");
		}
		else
		{
			System.out.println("False : " + givenText + " is not a Palindrome ");
		}
	}
	public static void main(String[] args ) {
		JavaChallenge3 obj = new JavaChallenge3();
		obj.checkPalindrome("A man, a plan, a canal: Panama");
		obj.checkPalindrome("raceacar\" is not a palindrome");
	}

}
