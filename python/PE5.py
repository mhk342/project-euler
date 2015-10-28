'''

2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

@author: Matt
'''

def multiples(n):
    for i in range(2,20): # increment by 20, so no need to check for 20. Could count backwards to imrpove response time
        if n % (i+1) != 0:
            return False
    return True

start = 19 # 2nd highest multiple to check
while (True):
    if multiples(20*start): # increment by 20
        print(20*start)
        break
    else:
        start += 1
