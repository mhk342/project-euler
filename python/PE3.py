#The prime factors of 13195 are 5, 7, 13 and 29.
#What is the largest prime factor of the number 600851475143 ?

def isPrime(n):
    if n == 2:
        return True
    for i in range (2, int((n)**(.5) + 1)):
        if n % i == 0:
            return False
    else:
        return True
    
#maxPrimeValue = 0
def findLargestPrimeFactor(n):
    for i in range (2,int((n)**(.5) + 1)):
        
            
        if isPrime(i) == True:
            if n % i == 0:
                maxPrimeValue = i
    return maxPrimeValue
print(findLargestPrimeFactor(600851475143))
