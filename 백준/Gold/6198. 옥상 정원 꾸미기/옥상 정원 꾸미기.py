import sys
input = sys.stdin.readline

n = int(input().strip())

h = [int(input().strip()) for _ in range(n)]
stack = []
result = 0

for i in range(n):
    while stack and stack[-1] <= h[i]:
        stack.pop()
    
    result += len(stack)
    stack.append(h[i])

print(result)