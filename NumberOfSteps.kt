class Solution {
    fun numberOfSteps (num: Int): Int {
        var steps: Int=0
        var n=num
        while(n>0) {
            if(n%2==0) n/=2
            else n-=1
            steps+=1
        }
        return steps
    }
}