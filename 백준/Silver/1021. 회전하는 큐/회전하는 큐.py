import sys
from collections import deque

input = sys.stdin.readline

n, m = map(int, input().split())
pos = list(map(int, input().split()))
q = deque([i for i in range(1, n+1)])
cnt = 0

for i in pos:
    while True:
        if q[0] == i:
            q.popleft()
            break
        else:
            if q.index(i) < len(q)/2:
                while q[0] != i:
                    q.append(q.popleft())
                    cnt += 1
            else:
                while q[0] != i:
                    q.appendleft(q.pop())
                    cnt += 1

print(cnt)