import sys
input = sys.stdin.readline

while True:
    command = input().rstrip()
    stack = []

    if command == '.':
        break
    
    for i in command:
        if i == '(' or i == '[':
            stack.append(i)
        elif i == ')':
            if len(stack) != 0 and stack[-1] == '(':
                stack.pop()
            else:
                stack.append(i)
        elif i == ']':
            if len(stack) != 0 and stack[-1] == '[':
                stack.pop()
            else:
                stack.append(i)
                
    if len(stack) == 0:
        print('yes')
    else:
        print('no')