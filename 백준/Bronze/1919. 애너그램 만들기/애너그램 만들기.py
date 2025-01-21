s1, s2 = input(), input()

arr = [0] * 26
result = 0

for i in s1:
    arr[ord(i)-97] += 1

for i in s2:
    arr[ord(i)-97] -= 1
    
for i in arr:
    result += abs(i)
    
print(result)