'''
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
@author: Matt
'''
def isPrime(n):
    if n == 2:
        return True
    for i in range (2, int((n)**(.5) + 1)):
        if n % i == 0:
            return False
    else:
        return True
    
runningSum = 0

for i in range (2, 2000000):
    if isPrime(i):
        runningSum += i
        
print(runningSum)