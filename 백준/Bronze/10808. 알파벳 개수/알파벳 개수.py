s = input()

# 알파벳 개수 0으로 초기화
arr = [0] * 26

# 해당 알파벳이 몇개 나왔는지
for i in s:
    arr[ord(i) - 97] += 1
    
for i in arr:
    print(i, end=' ')