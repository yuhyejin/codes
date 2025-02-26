import sys
from collections import deque
input = sys.stdin.readline

n = int(input().rstrip())
graph = [list(map(int, input().rstrip())) for _ in range(n)]

dx = [0, 0, -1, 1]
dy = [1, -1, 0, 0]

result = []
count = 0

def bfs(x, y):
    graph[x][y] = 0
    queue = deque()
    queue.append([x, y])
    num = 1
    
    while queue:
        x, y = queue.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0 <= nx < n and 0 <= ny < n and graph[nx][ny] == 1:
                graph[nx][ny] = 0
                queue.append([nx, ny])
                num += 1
    return num

for i in range(n):
    for j in range(n):
        if graph[i][j] == 1:
            result.append(bfs(i, j))
            count += 1
result.sort()
print(count)
for i in result:
    print(i)