def solution(n):
    result = 0
    for i in range(2, n + 1, 2):
        result += i
    # num = n //2
    # result = (2+(num*2))*num//2
    return result

        