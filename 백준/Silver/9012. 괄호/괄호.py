import sys
input = sys.stdin.readline

t = int(input())

for _ in range(t):
    command = input().rstrip()
    stack = []
    
    for i in command:
        if len(stack) == 0 and i == '(':
            stack.append(i)
        elif len(stack) == 0 and i == ')':
            stack.append(i)
        elif stack[-1] == '(' and i == ')':
            stack.pop()
        else:
            stack.append(i)
    
    if len(stack) == 0:
        print('YES')
    else:
        print('NO')