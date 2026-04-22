def solution(nums):
    unique_pokemon = set(nums)
    n = len(nums) // 2
    return min(len(unique_pokemon), n)
