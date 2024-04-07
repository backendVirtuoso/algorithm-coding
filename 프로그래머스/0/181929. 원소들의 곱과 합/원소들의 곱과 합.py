def solution(num_list):
    add, mul = 0, 1
    
    for i in num_list:
        mul *= i
        add += i
    add = add ** 2

    return 1 if mul <= add else 0