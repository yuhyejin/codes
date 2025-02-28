import sys
from collections import deque
input = sys.stdin.readline

f, s, g, u , d = map(int, input().split())

visited = [0] * (f+1)

def bfs():
    queue = deque()
    queue.append(s)
    visited[s] = 1
    
    while queue:
        x = queue.popleft()
        
        if x == g:
            break
        for i in (x+u, x-d):
            if 0 < i <= f and visited[i] == 0:
                queue.append(i)
                visited[i] = visited[x] + 1

bfs()

# 지금 있는 층이 도착해야하는 층이면 엘베 0번
if s == g:
    print(0)
else:
    if visited[g] == 0:              # g층에 가지 않았으면 
        print('use the stairs')
    else:
        print(visited[g]-1) # 1층 부터 시작해서 -1 해줘야함