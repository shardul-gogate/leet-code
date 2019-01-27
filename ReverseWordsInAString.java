class Solution {
	/**
	* runtime 39 ms
	* faster than 15%
	* of submission in Java
	*/
	public String reverseWords(String s) {
		String ans="";
		String temp[];
		if(s.isEmpty())
			return "";
		temp=s.split(" ");
		for(int i=temp.length-1;i>=0;i--) {
			if(!temp[i].isEmpty()) {
				ans+=temp[i]+" ";
			}
		}
		return ans.trim();
	}
}