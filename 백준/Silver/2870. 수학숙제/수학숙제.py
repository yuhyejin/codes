import re

n = int(input())
arr = [input() for _ in range(n)]

result = []

for i in arr:
    result.extend(re.findall(r'\d+', i))
    
new_result = []
for i in result:
    if len(i) > 1:
        for j in range(len(i)):
            if i[j] != '0':
                i = i[j:]
                break
        new_result.append(i)
    else:
        new_result.append(i)

new_result = sorted(map(int, new_result))

for i in new_result:
    print(i)