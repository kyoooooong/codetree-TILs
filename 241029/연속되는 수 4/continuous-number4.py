n = int(input())

arr = [int(input()) for _ in range(n)]
cnt =1
m = 1
for i in range(1,n) :
    if arr[i-1] < arr[i]:
        cnt +=1
    else:
        m = max(cnt,m)
        cnt = 1

print(m)