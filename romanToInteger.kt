/*
* Runtime: 196 ms, faster than 84.81% of submissions
* Memory Usage: 35.4 MB, less than 87.52% of submissions
*/

class Solution {
    fun romanToInt(s: String): Int {
        var sum = 0
        var loopSum = 0
        for(i in s.indices) {
            val prevCharVal = if(i > 0) getValueOfRoman(s[i-1]) else 0
            val currCharVar = getValueOfRoman(s[i])
            val nextCharVal = if(i < (s.length - 1)) getValueOfRoman(s[i+1]) else 0
            if(currCharVar > nextCharVal) {
                if(currCharVar > prevCharVal) {
                    sum += (currCharVar - loopSum)
                } else if(currCharVar == prevCharVal) {
                    sum += (currCharVar + loopSum)
                } else {
                    sum += currCharVar
                }
                loopSum = 0
            } else {
                loopSum += currCharVar
            }
        }
        return sum
    }

    private fun getValueOfRoman(c: Char): Int {
        return when(c) {
            'I' -> 1
            'V' -> 5
            'X' -> 10
            'L' -> 50
            'C' -> 100
            'D' -> 500
            'M' -> 1000
            else -> 0
        }
    }
}