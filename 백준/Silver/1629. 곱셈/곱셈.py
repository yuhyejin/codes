import sys
input = sys.stdin.readline

a, b, c = map(int, input().split())

def func(a, b, c):
    if b == 1:
        return a % c
    val = func(a, b // 2, c)
    if b % 2 == 0:
        return val * val % c
    else :
        return val * val * a % c
    
print(func(a, b, c))