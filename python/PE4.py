#A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
#Find the largest palindrome made from the product of two 3-digit numbers.

def isItAPalindrome(n):
    if str(n) == str(n)[::-1]:
        return True
    else:
        return False
            
maxValue = 0
for i in range(100, 1000):
    for j in range(100, 1000):
        if isItAPalindrome(i*j) == True:
            if i*j > maxValue:
                maxValue = i*j
        
print(maxValue)

    
