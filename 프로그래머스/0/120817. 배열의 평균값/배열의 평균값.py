def solution(numbers):
    s = 0
    for i in numbers:
        s += i
    answer = s / len(numbers)
    return answer