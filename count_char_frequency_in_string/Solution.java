import java.util.HashMap;

class Solution {
	public Solution(){}

	// Brute-force solution
	public void simpleCountCharFrequency(String str) {
		for (char i = 'a'; i <= 'z'; i++) {
			int frequency = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == i) {
					frequency++;
				}
			}
		}
	}
	// Use hash table to solve problem
	public void hashmapCountCharFrequency(String str) {
		HashMap<Character, Integer> charFrequencyTable = new HashMap<Character, Integer>();
		for (int j = 0; j < str.length(); j++) {
			if (!charFrequencyTable.containsKey(str.charAt(j))) {
				charFrequencyTable.put(str.charAt(j), 1);
			}
			else {
				int val = charFrequencyTable.get(str.charAt(j));
				charFrequencyTable.put(str.charAt(j), val+1);
			}
		}

		// print values in HashMap
		for (Character i: charFrequencyTable.keySet()) {
			System.out.println(i + " " + charFrequencyTable.get(i));
		}
	}

	// Main
	public static void main(String args[]) {
		Solution solution = new Solution();

		String str = "aabbcc";
		// solution.simpleCountCharFrequency(str);
		solution.hashmapCountCharFrequency(str);
	}
}