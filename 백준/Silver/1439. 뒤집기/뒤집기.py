S = input().strip()

count0 = 0  # 0 덩어리 수
count1 = 0  # 1 덩어리 수

prev = S[0]
if prev == '0':
    count0 += 1
else:
    count1 += 1

for i in range(1, len(S)):
    if S[i] != prev:  # 숫자가 바뀔 때마다 덩어리 수 증가
        if S[i] == '0':
            count0 += 1
        else:
            count1 += 1
        prev = S[i]

print(min(count0, count1))
