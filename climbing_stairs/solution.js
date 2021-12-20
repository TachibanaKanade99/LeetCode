// Recursive Fibonacci number implementation:
// var climbStairs = function(n) {
//     if (n <= 0) {
//         return 0;
//     }
//     if (n == 1) {
//         return 1;
//     }
//     if (n == 2) {
//         return 2;
//     }
//     return climbStairs(n - 1) + climbStairs(n - 2);
// };

// Dynamic programming Fibonacci number implementation:
var climbStairs = function(n) {
    if (n <= 0) {
        return 0;
    }
    if (n == 1) {
        return 1;
    }
    if (n == 2) {
        return 2;
    }
    counts = [0, 1, 2];
    for (let i = 3; i <=n; i++) {
        counts[i] = counts[i-1] + counts[i-2];
    }
    return counts[n];
}

console.log(climbStairs(45));
