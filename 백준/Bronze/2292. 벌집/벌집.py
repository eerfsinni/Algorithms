import sys
a=int(sys.stdin.readline())
max=sys.maxsize
sum=1
for i in range(1,max):
    if a>sum:
        sum = sum+6*i
    else:
        print(i)
        break