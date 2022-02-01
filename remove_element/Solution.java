class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (val == nums[i]) {
                for (int j = i+1; j < nums.length; j++) {
                    if (nums[j] != val) {
                        int tmp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = tmp;
                        count++;
                        break;
                    }
                }
            }
            else {
                count++;
            }
        }
        return count;               
    }

    public static void main(String args[]) {
        Solution solution = new Solution();
        // int[] arr = {1, 2, 3, 2, 5};
        // int[] arr = {3, 2, 2, 3};
        int[] arr = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int k = solution.removeElement(arr, val);
        
        // result
        System.out.println(k);
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}