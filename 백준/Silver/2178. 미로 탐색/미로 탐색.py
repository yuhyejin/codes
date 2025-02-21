import sys
from collections import deque
input = sys.stdin.readline
n, m = map(int, input().split())
graph = [list(map(int, input().rstrip())) for _ in range(n)]
dist = [[-1] * m for _ in range(n)]

dx = [0, 0, -1, 1]
dy = [1, -1, 0, 0]

def bfs(x, y):
    queue = deque()
    queue.append((x, y))
    dist[x][y] = 0  # 시작점 거리 초기화
    
    while queue:
        x, y = queue.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0 <= nx < n and 0 <= ny < m:
                if graph[nx][ny] == 1 and dist[nx][ny] == -1:
                    queue.append((nx, ny))
                    dist[nx][ny] = dist[x][y] + 1
    return dist[n-1][m-1]+1

print(bfs(0, 0))