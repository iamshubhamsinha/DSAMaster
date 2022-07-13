package recursions;

// Write a function called recursiveRange which accepts a number and adds
// up all the numbers from 0 to the number passed to the function.

public class RecursiveRangePractice {

	protected int getRecursiveRange(int n) {
		if(n<0) {
			return -1;
		}
		if(n==0) {
			return 0;
		}
		return n + getRecursiveRange(n-1);
	}
}