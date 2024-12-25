n = int(input())
arr = list(map(int, input().split()))
stack = []
num = 1

for i in arr:
    if i > num:
        stack.append(i)
    elif i == num:
        num += 1
    
    while stack:
        if stack[-1] == num:
            stack.pop()
            num += 1
        else:
            break
        
if not stack:
    print("Nice")
else:
    print("Sad")