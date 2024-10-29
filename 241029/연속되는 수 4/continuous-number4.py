n = int(input())

arr = [int(input()) for _ in range(n)]
cnt =0
m = 0
for i in range(1,n) :
    if arr[i-1] < arr[i]:
        cnt +=1
    else:
        m = max(cnt,m)

print(m)