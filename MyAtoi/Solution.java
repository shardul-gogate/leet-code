class Solution {
	/**
	* runtime 33ms
	* faster than 64%
	* submission in Java
	*/
	public int myAtoi(String str) {
		char flag='+';
		int i=0;
		double result=0;

		//trim whitespaces
		str=str.trim();

		//return if string is null or empty
		if(str==null || str.isEmpty())
			return 0;

		if(str.charAt(0)=='-') {
			flag='-';
			i++;
		}
		else if(str.charAt(0)=='+') {
			flag='+';
			i++;
		}
		while(i!=str.length() && str.charAt(i)>='0' && str.charAt(i)<='9') {
			result=(result*10)+(str.charAt(i)-'0');
			i++;
		}
		if(result>Integer.MAX_VALUE && flag=='-')
			return Integer.MIN_VALUE;
		if(result>Integer.MAX_VALUE)
			return Integer.MAX_VALUE;
		if(flag=='-')
			return (int)-result;
		return (int)result;
	}
}