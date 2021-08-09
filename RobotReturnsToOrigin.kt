class Solution {    
    fun judgeCircle(moves: String): Boolean {
        var x: Int=0
        var y: Int=0
        for(move in moves) {
            when(move) {
                'U' -> y++
				'D' -> y--
				'R' -> x++
				'L' -> x--
            }
        }
        if(x==0 && y==0)
            return true
        return false
    }
}