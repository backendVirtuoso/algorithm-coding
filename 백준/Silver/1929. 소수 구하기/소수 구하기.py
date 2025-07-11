import sys
input = sys.stdin.readline

M, N = map(int, input().split())

# 소수 여부를 저장할 리스트 (True는 소수로 간주)
is_prime = [True] * (N + 1)
is_prime[0] = is_prime[1] = False  # 0과 1은 소수가 아님

# 에라토스테네스의 체
for i in range(2, int(N ** 0.5) + 1):
    if is_prime[i]:
        for j in range(i*i, N + 1, i):
            is_prime[j] = False

# M부터 N까지 소수만 출력
for i in range(M, N + 1):
    if is_prime[i]:
        print(i)
