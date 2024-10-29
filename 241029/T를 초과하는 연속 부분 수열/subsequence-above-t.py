arr = list(map(int, input().split()))

n=arr[0]
t=arr[1]

arr2 = list(map(int, input().split()))

cnt=0
m=0
for i in range(1,n):
    if(arr2[i-1] <arr2[i]) and arr2[i-1] >t:
        cnt +=1
    else:
        m=max(m,cnt)
        cnt=1

m=max(m,cnt)

if m == 0 :
    print(0)
else:
    print(m)