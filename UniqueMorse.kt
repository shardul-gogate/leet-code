class Solution {
	fun uniqueMorseRepresentations(words: Array<String>): Int {
		val morseSigns: Array<String> = arrayOf(".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..")
		val uniqueMorse: ArrayList<String> = arrayListOf()
		for(word in words) {
			var thisMorse = ""
			for(char in word) {
				thisMorse+=morseSigns[char.toInt()-97]
			}
			if(thisMorse in uniqueMorse)
				continue
			uniqueMorse.add(thisMorse)
		}
		return uniqueMorse.size
	}
}