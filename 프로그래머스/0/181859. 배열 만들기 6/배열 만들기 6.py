def solution(arr):
    stk = []

    for x in arr:
        if stk and stk[-1] == x:
            stk.pop()
        else:
            stk.append(x)

    return stk if stk else [-1]