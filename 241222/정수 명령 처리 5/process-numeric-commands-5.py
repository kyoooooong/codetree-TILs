n = int(input())
l=[]
for i in range(n) :
    s = input()

    if s.startswith("push_back"):
        _,a=tuple(s.split())
        l.append(int(a))
    elif s.startswith("pop_back"):
        l.pop()

    elif s.startswith("size"):
        print(len(l))
    else:
        _,a=tuple(s.split())
        print(l[int(a)-1])