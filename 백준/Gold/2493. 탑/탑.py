import sys
input = sys.stdin.readline

n = int(input())

tower = list(map(int, input().strip().split()))
pos = [0] * n
stack = []

for i in range(n):
    while stack:
        if tower[i] > tower[stack[-1]]:
            stack.pop()
        else:
            pos[i] = stack[-1] + 1
            break
    stack.append(i)
    
print(*pos)