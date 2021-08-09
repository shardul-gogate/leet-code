class Solution {
    fun lengthOfLastWord(s: String): Int {
        val split = s.trim().split(" ")
        if(split.isEmpty()) return 0
        return split.last().length;
    }
}