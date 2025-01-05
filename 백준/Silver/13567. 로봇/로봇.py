M, n = map(int, input().split())
commands = [input().split() for _ in range(n)]

x, y, dir = 0, 0, 0

dx = [1, 0, -1, 0]
dy = [0, 1, 0, -1]

for command in commands:
    if command[0] == "MOVE":
        a = int(command[1])
        nx = x + dx[dir] * a
        ny = y + dy[dir] * a

        if 0 <= nx <= M and 0 <= ny <= M:
            x, y = nx, ny
        else:
            print(-1)
            break
    
    elif command[0] == "TURN":
        d = int(command[1])
        if d == 0:
            dir = (dir + 1) % 4
        elif d == 1:
            dir = (dir - 1) % 4

else:
    print(x, y)