import sys
from collections import deque
input = sys.stdin.readline

t = int(input().rstrip())

dx = [0, 0, -1, 1]
dy = [1, -1, 0, 0]

def bfs(x, y, visited, graph):
    visited[x][y] = 1
    queue = deque()
    queue.append([x, y])
    
    while queue:
        x, y = queue.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0 <= nx < m and 0 <= ny < n and visited[nx][ny] == 0 and graph[nx][ny] == 1:
                queue.append([nx, ny])
                visited[nx][ny] = 1
    return

for _ in range(t):
    m, n, k = map(int, input().split())
    graph = [[0]*n for _ in range(m)]
    
    for _ in range(k):
        x, y = map(int, input().split())
        graph[x][y] = 1
    
    visited = [[0]*n for _ in range(m)]
    
    result = 0
    for i in range(m):
        for j in range(n):
            if graph[i][j] == 1 and visited[i][j] == 0:
                bfs(i, j, visited, graph)
                result += 1
    print(result)