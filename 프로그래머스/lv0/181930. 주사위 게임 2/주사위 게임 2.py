def solution(a, b, c):
    sum = a + b + c
    square_sum = a**2 + b**2 + c**2
    cube_sum = a**3 + b**3 + c**3

    if a == b == c:
        return sum * square_sum * cube_sum
    elif a == b or b == c or c == a:
        return sum * square_sum
    else: 
        return sum