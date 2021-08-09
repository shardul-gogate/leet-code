class Solution {
    fun toLowerCase(str: String): String {
        var newStr: String=""
        for(i in 0..str.length-1) {
            var c=str[i]
            if(c>='A' && c<='Z') {
                newStr+=(c+32)
            }
            else {
                newStr+=c
            }
        }
        return newStr
    }
}