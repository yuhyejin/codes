a = int(input())
b = int(input())
c = int(input())

arr = [0] * 10

s = str(a * b * c)

for i in s:
    arr[int(i)] += 1
    
for i in arr:
    print(i)