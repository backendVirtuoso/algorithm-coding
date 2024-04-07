def solution(a, b):
    result = 0
    if a % 2 == 1 and b % 2 == 1 :
        result = (a * a) + (b * b)
    elif (a % 2 == 1 and b % 2 == 0) or (a % 2 == 0 and b % 2 == 1):
        result = 2 * (a + b)
    else :
        result = abs(a - b)
    return result

    # if a % 2 and b % 2: return a * a + b * b
    # elif a % 2 or b %2 : return 2 * (a + b)
    # return abs(a - b)