def solution(arr):
    stk = []

    for num in arr:
        while stk and stk[-1] >= num:
            stk.pop()
        stk.append(num)

    return stk