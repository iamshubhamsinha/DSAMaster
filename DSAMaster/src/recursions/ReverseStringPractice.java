package recursions;

public class ReverseStringPractice {
	
	protected String getReversed(String str) {
		if (str.isEmpty()) {
            return str;
		}
        return getReversed(str.substring(1)) + str.charAt(0);
	}

}
