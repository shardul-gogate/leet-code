class Solution {
	/**
	* runtime 113 ms
	* faster than 4%
	* submissions in Java
	*/
	 public int threeSumClosest(int[] nums, int target) {
		int i,j,k,currClose,currSum,maxClose,maxSum;
		maxClose=nums[0]+nums[1]+nums[2]-target;
		if(maxClose<0) {
			maxClose=-maxClose;
		}
		maxSum=nums[0]+nums[1]+nums[2];
		for(i=0;i<nums.length-2;i++) {
			for(j=i+1;j<nums.length-1;j++) {
				for(k=j+1;k<nums.length;k++) {
					currSum=nums[i]+nums[j]+nums[k];
					currClose=currSum-target;
					if(currClose<0) {
						currClose=-currClose;
					}
					if(currClose<maxClose) {
						maxClose=currClose;
						maxSum=currSum;
					}
				}
			}
		}
		return maxSum;
	}
}