import sys
input = sys.stdin.readline

n, m = map(int, input().split())

arr = []
visited = [False] * (n+1)

def dfs():
    if len(arr) == m:
        print(' '.join(map(str, arr)))
        return
    
    for i in range(1, n+1):
        if visited[i]:
            continue
        
        visited[i] = True
        arr.append(i)
        dfs()
        arr.pop()
        visited[i] = False
        
dfs()