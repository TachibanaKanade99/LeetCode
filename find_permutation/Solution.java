class Solution {
	public Solution(){}

	public boolean checkPermutation(String str1, String str2) {
		char str1Chars[] = str1.toCharArray();
		char str2Chars[] = str2.toCharArray();
		
		// sort two strings and return if two strings are equal
		String sortedStr1 = bubbleSort(str1Chars);
		String sortedStr2 = bubbleSort(str2Chars);

		return sortedStr1.equals(sortedStr2);
	}

	public String bubbleSort(char[] strChars) {
		for (int i = 0; i < strChars.length; i++) {
			for (int j = i+1; j < strChars.length; j++) {
				if (strChars[i] > strChars[j]) {
					char tmp = strChars[i];
					strChars[i] = strChars[j];
					strChars[j] = tmp;
				}
			}
		}
		return new String(strChars);
	}

	public int findPermutation(String subStr, String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (i+subStr.length() <= str.length()) {
				String sub = str.substring(i, i+subStr.length());
				
				// check permutation of sub and subStr
				boolean isPermutated = checkPermutation(sub, subStr);
				if (isPermutated) {
					System.out.println(subStr + " " + sub);
					count++;
				}
			}
			else {
				break;
			}
		}
		return count;
	}

	// Main
	public static void main(String args[]) {
		Solution solution = new Solution();
		System.out.println(solution.findPermutation("abbc", "cbabadcbbabbcbabaabccbabc"));
	}
}