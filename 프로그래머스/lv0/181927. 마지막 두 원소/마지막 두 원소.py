def solution(num):
    if num[-1] > num[-2] :
        num.append(num[-1] - num[-2])
    else :
        num.append(num[-1] * 2)
    return num