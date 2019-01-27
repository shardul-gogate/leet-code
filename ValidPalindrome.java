class Solution {
	/**
	* runtime 803 ms
	* faster than 4%
	* solutions in Java
	*/
	public boolean isPalindrome(String s) {
		if(s.isEmpty()) {
            return true;
        }
		String ans="";
		String rev="";
		int i=0;
		while(i<s.length()) {
			char c=s.charAt(i);
			if((c>='a' && c<='z') || (c>='A' && c<='Z') || (c>='0' && c<='9')) {
				ans+=c;
			}
			i++;
		}
		i=0;
		int j=ans.length()-1;
		int flag=1;
		ans=ans.toLowerCase();
		while(i<j) {
			if(ans.charAt(i)!=ans.charAt(j)) {
				flag=0;
				break;
			}
			i++;
			j--;
		}
		if(flag==0)
			return false;
		return true;
	}
}