import sys
from collections import deque

input = sys.stdin.readline

t = int(input())

for i in range(t):
    fun = input()
    n = int(input())
    arr = input().strip()
    q = deque(arr[1:-1].split(','))    # [1,2,3,4]에서 []와 ,를 제거하고 넣기 위함
    
    flag = 0
    
    if n == 0:
        q = deque()
    
    for i in fun:
        if i == 'R':
            flag += 1
        elif i == 'D':
            if not q:
                print('error')
                break
            elif flag % 2 == 0:
                q.popleft()
            else:
                q.pop()
    
    else:
        if flag % 2 == 1:
            q.reverse()
        print('[' + ','.join(q) +']')