def solution(code):
    # ai 풀이
    mode = 0  
    ret = '' 
    for idx, char in enumerate(code):  
        if char == '1': 
            mode = 1 - mode  
        else: 
            if mode == 0 and idx % 2 == 0: 
                ret += char 
            elif mode == 1 and idx % 2 == 1: 
                ret += char 
    return ret if ret else 'EMPTY'  

    # 내가 시도해본 코드(실패)
    # ret, mode = '', 0
    # for i in range(0, len(code)-1) :
    #     if mode == 0 and code[i] != '1' :
    #         if i % 2 == 0 :
    #             ret += code[i]
    #         else :
    #             mode = 1
    #     elif mode == 1 and code[i] != '1' :
    #         if i % 2 == 1 :
    #             ret += code[i]
    #         else :
    #             mode = 0
    # return ret
    
    # 대단한 숏코딩
    # return "".join(code.split("1"))[::2] or "EMPTY"
    
