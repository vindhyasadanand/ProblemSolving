T = int(input())
for i in range(T):
    N = int(input())
    arr = list(map(int,input().strip().split()))
    arr.sort()
    for i in arr:
        print(i,end=" ")
    print()
