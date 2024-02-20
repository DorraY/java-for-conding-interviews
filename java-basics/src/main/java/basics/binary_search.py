n = 1000
k = 234
v = [0] * k + [1] * (n-k)
if (v[0] == 1):
    print("-1")
else:
    l,r = 0, n-1
    while (r-1 > 1): #(r-1 >= 1) cycle, infinite loop
        mid = (1+r) // 2
        if v[mid] == 0:
            1 = mid
        else:
            r = mid -1
    if (l+1 == r and v[r]==0):
        l += 1

    print(l)