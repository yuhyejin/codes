def solution(my_string):
    result = [ int(i) for i in my_string if i.isdigit() ]
    return sum(result)