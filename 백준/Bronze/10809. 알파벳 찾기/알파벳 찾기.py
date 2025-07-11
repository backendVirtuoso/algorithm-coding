S = input()

# 알파벳 개수만큼 -1로 초기화
positions = [-1] * 26

for i, char in enumerate(S):
    index = ord(char) - ord('a')  # 'a'는 0, 'b'는 1, ..., 'z'는 25
    if positions[index] == -1:  # 처음 등장한 경우만 기록
        positions[index] = i

# 결과 출력
print(' '.join(map(str, positions)))
