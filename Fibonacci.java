class Solution {
    /*
    runtime 2 ms
    faster than 100% submissions in Java
    memory usage 24MB
    less than 99% submission in Java
    */
    public int fib(int N) {
        int f,s,x,i;
        if(N==0) return 0;
        if(N==1) return 1;
        f=0;
        s=1;
        x=f+s;
        i=2;
        while(i<N) {
            f=s;
            s=x;
            x=f+s;
            i++;
        }
        return x;
    }
}