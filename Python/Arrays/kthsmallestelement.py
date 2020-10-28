tc = int(input())
while tc!=0:
    n = int(input())
    arr = list(map(int,input().split()))
    k = int(input())
    arr = sorted(arr)
    print(arr[k-1])
    tc = tc - 1
