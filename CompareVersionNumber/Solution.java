class Solution {
	/**
	* runtime 1 ms
	* faster than 90%
	* submissions in Java
	*/
	public int compareVersion(String version1, String version2) {
		int vFlag=0;
		String comp1[];
		String comp2[];
		comp1=version1.split("\\.");
		comp2=version2.split("\\.");
		int i=0,flag;
		if(comp1.length>comp2.length) flag=1;
		else if(comp1.length<comp2.length) flag=2;
		else flag=0;
		while(i<comp1.length && i<comp2.length) {
			if(Integer.parseInt(comp1[i])==Integer.parseInt(comp2[i])) {
				i++;
			}
			else if(Integer.parseInt(comp1[i])>Integer.parseInt(comp2[i])) {
				return 1;
			}
			else if(Integer.parseInt(comp1[i])<Integer.parseInt(comp2[i])) {
				return -1;
			}
		}
		if(flag==0) return 0;
		if(flag==1) {
			while(i<comp1.length) {
				if(Integer.parseInt(comp1[i])==0) {
					i++;
				}
				else if(Integer.parseInt(comp1[i])>0) {
					return 1;
				}
			}
			return 0;
		}
		if(flag==2) {
			while(i<comp2.length) {
				if(Integer.parseInt(comp2[i])==0) {
					i++;
				}
				else if(Integer.parseInt(comp2[i])>0) {
					return -1;
				}
			}
			return 0;
		}
		return 0;
	}
}