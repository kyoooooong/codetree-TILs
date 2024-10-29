arr = list(map(int, input().split()))

n=arr[0]
t=arr[1]

arr2 = list(map(int, input().split()))

cnt=1
m=1
for i in range(1,n):
    if(arr2[i-1] <arr2[i]):
        cnt +=1
    else:
        if (t<m) :
            m=max(m,cnt)
        cnt=1

m=max(m,cnt)
print(m)