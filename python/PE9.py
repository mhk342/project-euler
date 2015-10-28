'''
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
a2 + b2 = c2

For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.

@author: Matt
'''


# c must be the max
def isTriplet(a,b,c):
    if a**2 + b**2 == c**2:
        return True
    return False

def sum1000(a,b,c):
    if a + b + c == 1000:
        return True
    return False

def greaterThan1000(a,b,c):
    if a + b + c > 1000:
        return True
    return False



for i in range(998,333,-1):
    for j in range(1,333):
        for k in range (1, 333):
            if sum1000(i, j, k):
                if isTriplet(k, j, i):
                    print(i*j*k)
            if greaterThan1000(i, j, k):
                break
        
print("nope")