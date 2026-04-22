def solution(n):
    result = []
    for i in range(n):
        result.append("수" if i % 2 == 0 else "박")
    return "".join(result)