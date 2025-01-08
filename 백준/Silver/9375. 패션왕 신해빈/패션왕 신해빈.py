T = int(input())

for _ in range(T):
    result = 1
    n = int(input())
    clothes = dict()
    
    for _ in range(n):
        name, type = input().split()
        
        if not type in clothes:
            clothes[type] = 1
        else:
            clothes[type] += 1
    
    for i in clothes:
        result *= (clothes[i] + 1)
    
    print(result - 1)