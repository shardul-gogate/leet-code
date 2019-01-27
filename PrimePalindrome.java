class Solution {
	private static boolean isPrime(int x) {
		int primeFlag=1;
		if(x==1) return false;
		for(int i=2;i<=(int)Math.sqrt(x);i++) {
			if(x%i==0) {
				primeFlag=0;
				break;
			}
		}
		if(primeFlag==0)
			return false;
		return true;
	}
	private static boolean isPalindrome(int x) {
		int reverse=0,backup=x;
		if(x<0 || x>Integer.MAX_VALUE || x<Integer.MIN_VALUE)
			return false;
		while(x!=0) {
			reverse*=10;
			reverse+=(x%10);
			x/=10;
		}
		if(backup==reverse)
			return true;
		return false;
	}
	/**
	* runtime 6212 ms
	* faster than 1%
	* submissions on Java
	*/
	public int primePalindrome(int N) {
		int x=N;
		while(true) {
			if(Solution.isPalindrome(x) && Solution.isPrime(x))
				break;
			x++;
		}
		return x;
	}
}