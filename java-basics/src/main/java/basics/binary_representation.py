
v= [0]*k + [1]*(n-k)
ans = 0
step = 1<<int(math.log2(n+1))

while (step>0):
    if ((ans+step)<n and (v[ans+step]==0):
        ans += step
    step >>1