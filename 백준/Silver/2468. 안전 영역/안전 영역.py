import sys
from collections import deque
input = sys.stdin.readline

n = int(input().strip())

graph = []
maxNum = 0
result = 0

dx = [0, 0, -1, 1]
dy = [1, -1, 0, 0]

for _ in range(n):
    arr = list(map(int, input().split()))
    if max(arr) > maxNum:
        maxNum = max(arr)
    graph.append(arr)

def bfs(x, y, z):
    queue = deque()
    queue.append((x, y))
    visited[x][y] = 1
    
    while queue:
        x, y = queue.popleft()
        
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0 <= nx < n and 0 <= ny < n and visited[nx][ny] == 0 and graph[nx][ny] > z:
                queue.append((nx, ny))
                visited[nx][ny] = 1
        
for h in range(0, maxNum+1):
    visited = [[0] * n for _ in range(n)]
    num = 0
    for i in range(n):
        for j in range(n):
            if visited[i][j] == 0 and graph[i][j] > h:
                bfs(i, j, h)
                num += 1
    result = max(result, num)

print(result)