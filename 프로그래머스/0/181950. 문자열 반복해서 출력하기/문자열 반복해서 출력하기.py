a, b = input().strip().split(' ')
b = int(b)

if 1 <= len(a) and len(a) <= 10 and 1 <= b and b <= 5:
    print(a * b)