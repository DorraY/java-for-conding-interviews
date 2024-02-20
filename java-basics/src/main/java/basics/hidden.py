def ask(x): #is hidden at least >=k
    return hidden>=k

ans = 0
step = (1<<32)
while (step>0):
    if (ans+step < (1<<32) and ask(ans+step)):
        ans +=step
    step >>1

print(ans)