class Solution {
	fun subtractProductAndSum(n: Int): Int {
		val numStr="$n"
		val numArr=IntArray(numStr.length)
		var i=0;
		var sum=0
		var product=1
		for(c in numStr) {
			numArr[i]=Integer.parseInt("$c")
			i+=1
		}
		for(k in numArr) {
			sum+=k
			product*=k
		}
		return product-sum
	}
}