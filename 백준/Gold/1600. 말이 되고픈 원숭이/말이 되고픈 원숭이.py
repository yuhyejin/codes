import sys
from collections import deque
input = sys.stdin.readline

k = int(input().rstrip())
w, h = map(int, input().split())
graph = [list(map(int, input().split())) for _ in range(h)]

dx = [0, 0, -1, 1]
dy = [1, -1, 0, 0]

hx = [-2, -1, 1, 2, 2, 1, -1, -2]
hy = [1, 2, 2, 1, -1, -2, -2, -1]

def bfs(n):
    queue = deque()
    queue.append((0, 0, n))
    visited = [[[0] * (n+1) for _ in range(w)] for _ in range(h)]
    
    while queue:
        x, y, n = queue.popleft()
        
        if x == h-1 and y == w-1:
            return visited[x][y][n]
        
        if n > 0:
            for i in range(8):
                nx = x + hx[i]
                ny = y + hy[i]
                if 0 <= nx < h and 0 <= ny < w:
                    if graph[nx][ny] == 0 and visited[nx][ny][n-1] == 0:
                        queue.append((nx, ny, n-1))
                        visited[nx][ny][n-1] = visited[x][y][n] + 1
        
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0 <= nx < h and 0 <= ny < w:
                if graph[nx][ny] == 0 and visited[nx][ny][n] == 0:
                    queue.append((nx, ny, n))
                    visited[nx][ny][n] = visited[x][y][n] + 1
    return -1
result = bfs(k)
print(result)