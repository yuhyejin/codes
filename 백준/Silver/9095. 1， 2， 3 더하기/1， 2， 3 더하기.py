import sys
input = sys.stdin.readline

t = int(input())

for _ in range(t):
    n = int(input())
    D = [0] * (max(4, n+1))
    D[1] = 1
    D[2] = 2
    D[3] = 4
    for i in range(4, n+1):
        D[i] = D[i-1] + D[i-2] + D[i-3]
    print(D[n])