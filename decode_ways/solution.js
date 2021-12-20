var numDecodings = function(s) {
    if (s[0] == '0') {
        return 0;
    }

    let dp = [1, 1];
    for (let i = 2; i < s.length+1; i++) {
        dp[i] = 0;
    }

    for (let i = 2; i < s.length+1; i++) {
        if (s[i-1] != '0') {
            dp[i] = dp[i-1];
        }
        if (parseInt(s.slice(i-2, i)) >= 10 && parseInt(s.slice(i-2, i)) <= 26) {
            dp[i] += dp[i-2];
        }
        console.log(dp);
    }

    return dp[dp.length-1];
};

console.log(numDecodings('230'))