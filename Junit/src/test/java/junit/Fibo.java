package junit;

public class Fibo {

	/**
	 * fib(n) = fib(n-1) + fib(n-2)
	 * Special cases:
	 *  - fib(0) = 0
	 *  - fib(1) = 1
	 *  - fib(2) = 1
	 * Computes the Fibonnacci sequence numbers.
	 * @param n, 0 or positive integer
	 * @return int, the n-th number in the fibonnaci sequence
	 * @throws IllegalArgumentException if n < 0
	 */
	public static int fib(int n) {
		
		//if(n==0){ return 0;}
		//if(n<=2){ return 1;}
		//if(n>2){return fib(n-1)+fib(n-2);};
		
		//return fib(n);
		if(n<0) { throw new IllegalArgumentException("n must be zero or a positive integer");};
		if(n>46) { throw new IllegalArgumentException("n is too big number");};
		if(n==0){ return 0;}
		if(n<=2){ return 1;}
		return fib(n-1)+fib(n-2);
		
	}

}
// faire les test avant de coder
// faire la doc avant de penser 
// faire la conception avant de coder (UML)
