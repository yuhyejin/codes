# 의혁님의 개념정리를 보고 파이썬은 연결리스트를 list랑 deque로 구현할 수 있다는 것을 알게됨
# list는 중간 삽입/삭제 시 데이터 이동으로 인해 시간 복잡도가 O(n)이라 현재의 문제에선 deque로 구현

import sys
from collections import deque

input = sys.stdin.readline

str = input().strip()
m = int(input())

left = deque(str)
right = deque()

for _ in range(m):
    command = input().strip()
    
    if command[0] == 'L' and left:
        right.append(left.pop())
    elif command[0] == 'D' and right:
        left.append(right.pop())
    elif command[0] == 'B' and left:
        left.pop()
    elif command[0] == 'P':
        left.append(command[2])
        
print(''.join(left) + ''.join(reversed(right)))