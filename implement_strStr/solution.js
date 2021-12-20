var strStr = function(haystack, needle) {
    if (needle.length == 0) {
        return 0;
    }
    let idx = null;
    for (let i = 0; i < haystack.length - needle.length + 1; i++) {
        let ptr = 0;
        for (let j = i; j < i + needle.length; j++) {
            // console.log('haystack = ', haystack[j]);
            // console.log('needle = ', needle[ptr], ", ptr = ", ptr);
            if (haystack[j] == needle[ptr]) {
                if (ptr == 0) {
                    idx = j;
                }
                ptr++;
                if (ptr == needle.length) {
                    return idx;
                }
            }
            else {
                idx = null;
                break;
            }
        }
    }
    return -1;
};

// console.log(strStr('mississippi', 'issip'));
// console.log(strStr("aabaabbbaabbbbabaaab", "abaa"));
// console.log(strStr("aaaaa", "bba"));
// console.log(strStr("aaa", "aaaa"));
// console.log(strStr('hello', 'lo'));
// console.log(strStr('hello', 'll'));
console.log(strStr('', 'h2'))