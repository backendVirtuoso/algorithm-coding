def solution(ineq, eq, n, m):
    bo = False
    if '<' == ineq :
        if '=' == eq :
            bo = bool(n <= m)
        else :
            bo = bool(n < m)
    elif '>' == ineq :
        if '=' == eq :
            bo = bool(n >= m)
        else :
            bo = bool(n > m)
    return int(bo)

    # return int(eval(f"{n} {ineq}{eq.replace('!','')} {m}"))