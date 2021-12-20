// var mySqrt = function(x) {
//     let lo = 0;
//     let hi = x;
//     let mid = null;

//     for (let i = 0; i < 1000; i++) {
//         mid = (hi + lo) / 2;
//         console.log(lo, " ", hi, " ", mid);

//         if (mid * mid > x) {
//             hi = mid - 1;
//         }
//         else {
//             lo = mid + 1;
//         }
//     }
//     return Math.trunc(mid);
// }

var mySqrt = function(x) {
    return mySqrt_helper(x, 1, x);
}

function mySqrt_helper(x, lo, hi) {
    let mid = Math.floor((lo + hi) / 2);

    if (mid * mid > x) {
        return mySqrt_helper(x, lo, mid - 1);    
    }
    else if (mid + 1 > x / (mid + 1)) {
        return mid;
    }
    else {
        return mySqrt_helper(x, mid + 1, hi);
    }
}

// console.log(mySqrt(2147483647));
console.log('result = ', mySqrt(1));
