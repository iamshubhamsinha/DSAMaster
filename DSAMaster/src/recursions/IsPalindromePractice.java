package recursions;

public class IsPalindromePractice {
	
	protected boolean checkIsPalindrome(String s) {
		if(s.length()==0 || s.length()==1) {
			return true;
		}
        if(s.charAt(0) == s.charAt(s.length()-1)) {
        	return checkIsPalindrome(s.substring(1, s.length()-1));
        }
        return false;
	}

}
