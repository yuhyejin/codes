import sys
from collections import deque
input = sys.stdin.readline

m,n = map(int, input().split())
graph = [list(map(int, input().split())) for _ in range(n)]

dx = [0, 0, -1, 1]
dy = [1, -1, 0, 0]

queue = deque()

# 시작점이 여러개인 경우엔 시작점을 모두 Queue에 넣어야 함!
# 익은 토마토들을 Queue에 다 넣기
for i in range(n):
    for j in range(m):
        if graph[i][j] == 1:
            queue.append([i, j])

def bfs():
    while queue:
        x, y = queue.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0 <= nx < n and 0<= ny < m and graph[nx][ny] == 0:
                queue.append([nx, ny])
                graph[nx][ny] = graph[x][y] + 1

bfs()

result = 0

# for문을 돌려서 안익은 토마토가 있으면 -1 출력하고 종료하고
# 다 익었으면 최대값 출력
for i in graph:
    for j in i:
        if j == 0:
            print(-1)
            exit(0)
    result = max(result, max(i))

print(result - 1) # 익은 토마토 1로 시작했으니 -1 해줘야함