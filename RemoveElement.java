class Solution {
    /**
    * runtime 4 ms
    * faster than 100%
    * submissions in Java
    * Memory usage 26MB
    * less than 5%
    * submissions in Java
    **/
    public int removeElement(int[] nums, int val) {
        int nl=0,i=0,j=nums.length-1,temp;
        while(i<=j) {
            if(nums[j]==val) {
                j--;
                continue;
            }
            if(nums[i]==val) {
                temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j--;
            }
            i++;
            nl++;
        }
        return nl;
    }
}