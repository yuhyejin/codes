import sys
input = sys.stdin.readline

iron_bar = input().strip()
stack = []
result = 0

for i in range(len(iron_bar)):
    if iron_bar[i] == "(":
        stack.append('(')
    else:
        stack.pop()
        if iron_bar[i-1] == "(":
            result += len(stack)
        else:
            result += 1
            
print(result)