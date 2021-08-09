class Solution {
	fun defangIPaddr(address: String): String {
		var newAds: String=""
		for(c in address) {
			if(c=='.')
				newAds+="[.]"
			else
				newAds+=c
		}
		return newAds
	}
}