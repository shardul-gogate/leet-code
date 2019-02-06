class Solution {
	/**
	* runtime 3 ms
	* faster than 100%
	* of submission in Java
	*/
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()) {
            return 0;
        }
        int index=haystack.indexOf(needle);
        return index;
    }
}