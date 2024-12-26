n = int(input())

arr = [ 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 ]
for i in range(10):
    for j in range(10):
        for k in range(10):
            for l in range(10):
                for m in range(10):
                    for o in range(10):
                        if(arr[i] + arr[j] + arr[k] +arr[l] + arr[m] + arr[o] == n-4 and i*10 + j + k*10 + l == m*10 + o):
                            print(str(i)+str(j)+'+'+str(k)+str(l)+'='+str(m)+str(o))
                            exit()
print('impossible')