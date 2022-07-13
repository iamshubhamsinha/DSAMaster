package recursions;

// Write a function int fib(int n) that returns Fn. For example, if n = 0, 
// then fib() should return 0. If n = 1, then it should return 1. For n > 1, it should return Fn-1 + Fn-2

public class FibonacciPractice {

	protected int fib(int n) {   
		if (n<0) {
			return -1;
		}
		if (n==0 || n==1) {
			return n;
		}
		return fib(n-1) + fib(n-2);
	}
}