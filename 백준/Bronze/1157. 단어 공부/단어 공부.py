a = input()
Upa = a.upper()
q=set(Upa)
s=0
p=[]
for i in q:
    t = Upa.count(i)
    if s<t :
        s=t
        p=[]
        p.append(i)
    elif s==t :
        p.append(i)
if len(p) >= 2 :
    print("?")
else:
    print(*p)