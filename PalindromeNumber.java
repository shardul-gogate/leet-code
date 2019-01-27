class Solution {
	/**
	* runtime 144ms
	* faster than 93%
	* of submission in Java
	*/
	public boolean isPalindrome(int x) {
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
}