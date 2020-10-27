def reverse(ele):
    reversed = " "
    for char in ele:
        reversed = char + reversed
    print(reversed)
        
tc = int(input())
for i in range(tc):
    ele = input()
    reverse(ele)
