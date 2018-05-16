package packageChallenge;

public class Series {
	public static long nSum(int n) {
		return (n * (n + 1)) /2;
	}
	
	public static long factorial(int n) {
		if (n == 0) {
			return 1;
		} 
		return factorial(n-1) * n;
	}
	
	public static long fibonacci(int n) {
		if (n <= 1) return n;
        else return fibonacci(n-1) + fibonacci(n-2);
	}
}
