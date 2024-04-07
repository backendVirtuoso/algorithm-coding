function solution(str1, str2) {
    var answer = "";
    for (var i = 0; i < str1.length || i < str2.length; i++) {
        if (str1[i] !== undefined) answer += str1[i];
        if (str2[i] !== undefined) answer += str2[i];
    }
    return answer;
}
