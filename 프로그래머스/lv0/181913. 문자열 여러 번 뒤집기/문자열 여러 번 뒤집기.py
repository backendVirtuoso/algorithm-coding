def solution(my_string, queries):
    my_list = list(my_string)
    for query in queries:
        s, e = query
        my_list[s:e+1] = reversed(my_list[s:e+1])
    return ''.join(my_list)
