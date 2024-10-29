arr = list(map(int, input().split()))

n=arr[0]
t=arr[1]

arr2 = list(map(int, input().split()))

cnt=0
m=0
for i in range(n):
    if arr2[i]>t:
        cnt +=1
        m=max(m,cnt)
    else:
        cnt=0

m=max(m,cnt)


print(m)