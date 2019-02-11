class Solution {
    /*
    runtime 2 ms
    faster than 99%
    submission in Java
    */
    public int[] plusOne(int[] digits) {
        int ansArr[]=new int[digits.length+1];
        digits[digits.length-1]++;
        for(int i=digits.length-1;i>=0;i--) {
            if(digits[i]==10) {
                digits[i]=0;
                if(i==0) {
                    ansArr[0]=1;
                    for(int j=1;j<ansArr.length;j++) {
                        ansArr[j]=0;
                    }
                    return ansArr;
                }
                else {
                    digits[i-1]++;
                }
            }
        }    
        return digits;
    }
}