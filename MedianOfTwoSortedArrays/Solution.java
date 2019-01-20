class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int solnArray[]=new int[nums1.length+nums2.length];
		int i=0,j=0,k=0;
		double median=0;
		while(i<nums1.length && j<nums2.length) {
			if(nums1[i]<nums2[j]) {
				solnArray[k]=nums1[i];
				i++;
				k++;
			}
			else {
				solnArray[k]=nums2[j];
				j++;
				k++;
			}
		}
		if(i==nums1.length)
			while(j<nums2.length) {
				solnArray[k]=nums2[j];
				j++;
				k++;
			}
		else
			while(i<nums1.length) {
				solnArray[k]=nums1[i];
				i++;
				k++;
			}
		k=solnArray.length;
		if(k%2==1)
			median=solnArray[k/2];
		else if(k%2==0)
			median=(solnArray[(k/2)-1]+solnArray[k/2])/(double)2;
		return median;
    }
	public static void main(String args[]) {
		Solution s=new Solution();
		int arr1[]=new int[1]; arr1[0]=3;
		int arr2[]=new int[2]; arr2[0]=-2; arr2[1]=-1;
		System.out.println(s.findMedianSortedArrays(arr1,arr2));
	}
}