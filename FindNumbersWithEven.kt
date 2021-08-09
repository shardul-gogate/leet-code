class Solution {
    fun findNumbers(nums: IntArray): Int {
        var count=0
        var str=""
        for(i in nums) {
            if(("$i".length)%2==0)
                count++
        }
        return count
    }
}