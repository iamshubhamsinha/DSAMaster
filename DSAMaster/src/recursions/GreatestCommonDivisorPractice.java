package recursions;

public class GreatestCommonDivisorPractice {

	protected int getGCD(int a, int b) {		
		if(a<0 || b<0) {
			return -1;
		}
		if(a==0) {
			return b;
		} else if (b==0) {
			return a;
		}		
		if(a<b) {
			return getGCD(a, b%a);
		} else {
			return getGCD(b, a%b);
		}
	}
}