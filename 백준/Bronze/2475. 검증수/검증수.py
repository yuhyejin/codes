import sys
input = sys.stdin.readline

list = map(int, input().strip().split())
sum = 0
for i in list:
    sum = sum + (i ** 2)
print(sum%10)