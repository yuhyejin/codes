import sys
from collections import deque
input = sys.stdin.readline

n, m, k = map(int, input().split())

graph = [[0] * m for _ in range(n)]

result = []

dx = [0, 0, -1, 1]
dy = [1, -1, 0, 0]

for _ in range(k):
    x1, y1, x2, y2 = map(int, input().split())
    for i in range(y1, y2):
        for j in range(x1, x2):
            graph[i][j] = 2

def bfs(x, y):
    graph[x][y] = 1
    queue = deque()
    queue.append([x, y])
    num = 1
    
    while queue:
        x, y = queue.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0 <= nx < n and 0 <= ny < m and graph[nx][ny] == 0:
                graph[nx][ny] = 1
                queue.append([nx, ny])
                num += 1
    return num

count = 0

for i in range(n):
    for j in range(m):
        if graph[i][j] == 0:
            result.append(bfs(i, j))
            count += 1
print(count)
print(*sorted(result))