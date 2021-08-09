class Solution {
	fun oddCells(n: Int, m: Int, indices: Array<IntArray>): Int {
		var matrix=Array(n,{IntArray(m)})
		var oddVals:Int=0
		for(eachInd in indices) {
			for(i in 0..m-1) {
				matrix[eachInd[0]][i]+=1
			}
			for(i in 0..n-1) {
				matrix[i][eachInd[1]]+=1
			}
		}
		for(i in 0..n-1)
			for(j in 0..m-1)
				if((matrix[i][j]%2)!=0)
					oddVals+=1
		return oddVals
	}
}