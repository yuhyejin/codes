def solution(n):
    answer = 0
    n_str = str(n)
    for i in n_str:
        answer = answer + int(i)
    return answer