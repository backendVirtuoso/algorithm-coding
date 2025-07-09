nums = [int(input()) for _ in range(9)]

max_num = max(nums)
max_idx = nums.index(max_num) + 1  # 인덱스는 0부터 시작하므로 +1

print(max_num)
print(max_idx)
