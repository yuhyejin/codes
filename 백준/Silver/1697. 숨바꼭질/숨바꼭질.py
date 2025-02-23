# 1차원에서의 BFS
import sys
from collections import deque
input = sys.stdin.readline

n, k = map(int, input().split())

dist = [0] * 100001

def bfs(x):
    queue = deque()
    queue.append(x)
    
    while queue:
        x = queue.popleft()
        if x == k:
            return dist[x]
        for i in (x+1, x-1, x*2):
            if 0 <= i <= 100000 and not dist[i]:
                dist[i] = dist[x] + 1
                queue.append(i)

print(bfs(n))