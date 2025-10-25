class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val sumMap: MutableMap<Int, Int> = mutableMapOf()
        for (index in nums.indices) {
            val number = nums[index]
            val complement = target - number
            if (sumMap.containsKey(number)) {
                val pairIndex = sumMap[number] ?: -1
                return intArrayOf(index, pairIndex)
            } else {
                sumMap[complement] = index
            }
        }
        return intArrayOf(-1, -1)
    }
}