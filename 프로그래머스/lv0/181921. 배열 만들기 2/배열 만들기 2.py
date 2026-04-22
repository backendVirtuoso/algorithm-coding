def solution(l, r):
    result = []
    for num in range(l, r+1):
        str_num = str(num)
        if all(char in '05' for char in str_num):
            result.append(num)
    if not result:
        result.append(-1)
    return result
