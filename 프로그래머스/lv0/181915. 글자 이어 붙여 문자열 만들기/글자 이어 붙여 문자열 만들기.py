# def solution(my_string, index_list):
#     result = []
#     for i in range(len(index_list)):
#         s = my_string[i]
#     result.append(s)
#     return result

def solution(my_string, index_list):
    return ''.join(my_string[i] for i in index_list)
