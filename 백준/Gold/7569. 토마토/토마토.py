import sys
from collections import deque

input = sys.stdin.readline

m, n, h = map(int, input().split())
graph = [[list(map(int, input().split())) for _ in range(n)] for _ in range(h)]

dx = [0, 0, -1, 1, 0, 0]
dy = [1, -1, 0, 0, 0, 0]
dz = [0, 0, 0, 0, 1, -1]

queue = deque()

# 모든 익은 토마토(1) 위치 큐에 추가
for i in range(h):
    for j in range(n):
        for k in range(m):
            if graph[i][j][k] == 1:
                queue.append((i, j, k))

# BFS 실행
def bfs():
    while queue:
        x, y, z = queue.popleft()
        for i in range(6):
            nx = x + dx[i]
            ny = y + dy[i]
            nz = z + dz[i]
            if 0 <= nx < h and 0 <= ny < n and 0 <= nz < m and graph[nx][ny][nz] == 0:
                queue.append((nx, ny, nz))
                graph[nx][ny][nz] = graph[x][y][z] + 1  # 방문 체크

bfs()

# 최대 날짜 계산
result = 0
for i in range(h):
    for j in range(n):
        for k in range(m):
            if graph[i][j][k] == 0:  # 익지 않은 토마토가 있다면
                print(-1)
                exit(0)
            else:
                result = max(result, graph[i][j][k])

print(result - 1)  # 초기값이 1이므로 1을 빼줌