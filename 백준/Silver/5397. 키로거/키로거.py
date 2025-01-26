import sys
from collections import deque
input = sys.stdin.readline

t = int(input())

for _ in range(t):
    password = input().strip()
    left = deque()
    right = deque()
    
    for i in password:
        if i == '<' and left:
            right.appendleft(left.pop())
        elif i == '>' and right:
            left.append(right.popleft())
        elif i == '-' and left:
            left.pop()
        elif i not in '<>-':
            left.append(i)
    print(''.join(left) + ''.join(right))