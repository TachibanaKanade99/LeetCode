class Solution {
	public Solution(){}

	public int secondLargest(int[] arr) {
		int largest = arr[0];
		int secondLargest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			// second < largest < curr
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			}
			// second < curr < largest
			else if (arr[i] > secondLargest && arr[i] < largest) {
				secondLargest = arr[i];
			}
		}
		return secondLargest;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();

		// solution: largest -> 25; secondLargest -> 10
		int[] arr = {1, 14, 9, 3, 25, 6, 10};
		System.out.println(solution.secondLargest(arr));
	}
}