import math

n, k = map(int, input().split())
arr = [[0] * 7 for _ in range(2)]   # 성별과 학년을 담는 2차원 배열 생성

for _ in range(n):
    s, g = map(int, input().split())
    arr[s][g] += 1      # 성별에 해당하는 학년 인덱스 값을 +1
    
result = 0

for i in range(2):
    for j in range(7):
        result += math.ceil(arr[i][j] / k)
        
print(result)