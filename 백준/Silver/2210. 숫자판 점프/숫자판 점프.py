def dfs(x, y, num):
    if len(num) == 6:
        result.append(num)
        return
    
    dx = [1, -1, 0, 0]
    dy = [0, 0, 1, -1]
    
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        if nx < 0 or nx >=5 or ny < 0 or ny >= 5:
            continue
        else:
            dfs(nx, ny, num + grap[nx][ny])

grap = [list(map(str, input().split())) for _ in range(5)]

result = []

for i in range(5):
    for j in range(5):
        dfs(i, j, grap[i][j])
            
print(len(set(result)))