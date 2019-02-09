class Solution {
    public double myPow(double x, int n) {
        double ans=x;
        int flag=0;
        if(n==0) {
            return 1;
        }
        if(n<0) {
            n=-n;
            flag=1;
        }
        for(int i=1;i<n;i++) {
            ans*=x;
        }
        if(flag==1) {
            return 1/ans;
        }
        return ans;
    }
}