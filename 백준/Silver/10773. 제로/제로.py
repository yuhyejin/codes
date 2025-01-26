k = int(input())
arr = []

for _ in range(k):
    n = int(input())
    if arr and n == 0:
        arr.pop()
    else:
        arr.append(n)

sum = 0    
for i in arr:
    sum += i
print(sum)