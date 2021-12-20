var maxSubArray = function(nums) {
    let max_sum = -Math.pow(10, 4);
    let sum = 0;
    
    let lo = 0;
    let hi = 0;
    
    for (let i = 0; i < nums.length; i++) {
        sum += nums[i];
        
        // sub_array will start here:         
        if (sum == nums[i]) {
            lo = i;
        }
        if (sum > max_sum) {
            max_sum = sum;
            hi = i;
        }
        
        // reset sum to 0 and remove sub_arr:      
        if (sum < 0) {
            sum = 0;
            lo = 0;
            hi = 0;
        }
    }
    console.log("Sub arr = ", nums.slice(lo, hi+1));
    return max_sum;
}

console.log("Sum = ", maxSubArray([-2, 1, -3, 4, -1, 2, 1, -5, 4]));
// console.log(maxSubArray([1, 2, 3, 4]));