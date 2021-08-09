class Solution {
	fun isValid(s: String): Boolean {
        if(s.isEmpty()) return true
		var paraStack: ArrayList<Char> = arrayListOf(' ')
		for(c in s) {
			when(c) {
				'(','{','[' -> paraStack.add(c)
				')' -> {
					if(paraStack.last()=='(')
						paraStack.removeAt(paraStack.lastIndex)
					else
						return false
				}
				'}' -> {
					if(paraStack.last()=='{')
						paraStack.removeAt(paraStack.lastIndex)
					else
						return false
				}
				']' -> {
					if(paraStack.last()=='[')
						paraStack.removeAt(paraStack.lastIndex)
					else
						return false
				}
			}
		}
		if(paraStack.last()==' ') return true
        return false
	}
}