def solution(num_list):
    odd = []
    even = []
    for i in num_list:
        if i % 2 == 0:
            even.append(str(i))
        else:
            odd.append(str(i))
    return int(''.join(even)) + int(''.join(odd))