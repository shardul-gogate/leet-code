class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var high: Int = nums.size-1
    var low: Int = 0
    var mid = (low+high)/2
    if(nums[low] == target) return low
    if(nums[high] == target) return high
    while(low<=high) {
        if(nums[mid]>target) {
            high = mid-1
            mid = (low+high)/2
        }
        else if(nums[mid]<target) {
            low = mid+1
            mid = (low+high)/2
        }
        else return mid
    }
    return -1
    }
}