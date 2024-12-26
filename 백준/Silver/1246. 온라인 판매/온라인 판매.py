n, m = input().split()
n = int(n); m = int(m)

max = 0         # 최대 수익
best_price = 0  # 최적 가격

p = [int(input()) for _ in range(m)]

p.sort()

for i in range(m):
    buyers_cnt = m - i  # i 번째 이후의 구매자는 모두 p[i] 이상 낼 수 있음
    sell_cnt = min(n, buyers_cnt)   # 실제 판매 개수는 n과 구매 가능한 구매자 수 중 최소값임
    profit = p[i] * sell_cnt    # 수익 = 판매가격 * 구매 가능한 구매자 수
    
    # 최대 수익 갱신
    if profit > max:
        max = profit
        best_price = p[i]

print(best_price, max)