import sys
input = sys.stdin.readline

n = int(input())
count = 0

for _ in range(n):
    command = input().rstrip()
    stack = []
    
    for i in command:
        if len(stack) == 0:
            stack.append(i)
        elif len(stack) != 0 and stack[-1] == i:
            stack.pop()
        elif len(stack) != 0 and stack[-1] != i:
            stack.append(i)
    if len(stack) == 0:
        count += 1
print(count)