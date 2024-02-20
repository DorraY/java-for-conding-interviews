n, k = 6,3
v = [7,3,2,3,1,4]

def can_do(c,k):
    #if we rent a trucj with capacity c can we do at most k visits
    for (_ in range(k)):
        rem = k
        while (i<n and rem>= v[i]):
            rem -= v[i]
            i += 1
    return i>=1

print(can_do(c,k) for c in range(max(v),sum(v)+1))

l,r = max(v),sum(v)
step = l<< 30
while (step):
    if (r-step >= 1 and can_do(r-step)):
            r-= step
    step>>=1