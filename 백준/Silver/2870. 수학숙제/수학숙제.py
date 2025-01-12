import re

n = int(input())
arr = [input() for _ in range(n)]

result = []

for i in arr:
    result.extend(re.findall(r'\d+', i))

new_result = sorted(map(int, result))

for i in new_result:
    print(i)