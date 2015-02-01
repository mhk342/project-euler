'''
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10001st prime number?

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

counter = 0
for i in range(2, 99999999999999):
    if isPrime(i):
        counter += 1
        if counter == 10001:
            print(i)
            break