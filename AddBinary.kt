class AddBinary {
    fun addBinary(a: String, b: String): String {
        val sumBuilder = StringBuilder()
        var aIndex = a.length - 1
        var bIndex = b.length - 1
        var carry = 0
        while (aIndex >= 0 && bIndex >= 0) {
            val aDigit = a.get(aIndex).digitToInt()
            val bDigit = b.get(aIndex).digitToInt()
            
            aIndex--
            bIndex--
        }
    }
}