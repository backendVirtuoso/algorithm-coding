def solution(a, b):
    test1 = int(f'{a}{b}')
    test2 = int(f'{b}{a}')
    
    return max(test1, test2)

    # if test1 > test2 or test1 == test2:
    #     return test1
    # elif test1 < test2:
    #     return test2
