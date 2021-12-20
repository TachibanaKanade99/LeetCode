var merge = function(nums1, m, nums2, n) {
    let i = m - 1;
    let j = n - 1;
    let k = m + n - 1;
    while (i >= 0 && j >= 0) {
        if (nums2[j] > nums1[i]) {
            nums1[k--] = nums2[j--];
        }
        else {
            nums1[k--] = nums1[i--];
        }
    }

    while(j >= 0) {
        nums1[k--] = nums2[j--];
    }

    console.log(nums1);
};

console.log(merge([1, 2, 5, 0, 0, 0], 3, [4, 5, 6], 3));