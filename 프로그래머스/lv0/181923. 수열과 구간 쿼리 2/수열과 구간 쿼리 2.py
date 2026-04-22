def solution(arr, queries):
    result = []
    for query in queries:
        s, e, k = query
        temp = [num for num in arr[s : e + 1] if num > k]
        result.append(min(temp)) if temp else result.append(-1)
    return result