package recursions;

public class PowerPractice {

	protected int getPower(int base, int exp) {
		if(exp<0) {
			return -1;
		}
		if(exp == 0) {
			return 1;
		}
		return base * getPower(base, exp-1);
	}
}