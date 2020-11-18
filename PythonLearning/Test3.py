#art  rat

## Testing Anagram

a= "art"
b= "rat"
a1=list(a)
b1=list(b)
if len(a) == len (b) :
    a1.sort(reverse=True)
    b1.sort(reverse=True)
    if a1 == b1 :
        print ("PASS")
    else :
        print ("FAIL")
else :
    print ("Length of the strings do not match")

## Factorial of a number 

def calc_Factorial (num) :
    if num ==1 or num==0 :
        return 1
    else :
        return num * calc_Factorial(num-1)

print (calc_Factorial (3))

## Program to test prime number 

def checkForPrimeNumber(num) :
    if num > 1: 
        
        for i in range(2, num): 
                
            # If num is divisible by any number between 
            # 2 and n / 2, it is not prime 
            if (num % i) == 0: 
                print(num, "is not a prime number") 
                break
        else: 
            print(num, "is a prime number") 

    else: 
        print(num, "is not a prime number") 


checkForPrimeNumber (6) ## checking prime number 

# Function for nth Fibonacci number 

def Fibonacci(n): 
	if n<0: 
		print("Incorrect input") 
	# First Fibonacci number is 0 
	elif n==1: 
		return 0
	# Second Fibonacci number is 1 
	elif n==2: 
		return 1
	else: 
		return Fibonacci(n-1)+Fibonacci(n-2) 

# Driver Program 

print(Fibonacci(9)) 

### split array and add first 2 index values to last

#def SplitAndAddArrayToTheDesiredIndexPosition()  :
arr = [2,3,4,5,6,7]
arrayLength = len(arr)
arrtolist = list(arr)
print (arrayLength)
print (arrtolist)
print (arrtolist[0:2])
print (arrtolist[2:arrayLength])
print ((arrtolist[2:arrayLength])+(arrtolist[0:2]))
print (arr[::-1])


## swap position in a list

##Input : list1 = [1, 2, 3]
  ##      list2 = ['a', 'b', 'c']
##Output : [(1, 'a'), (2, 'b'), (3, 'c')]

list1 = [1,2,3,4,5,6]  # swap 3 and 4 
list1[2] , list1[3] = list1[3] , list1[2]
print (list1)
list2 = [11,22,33,44,55,66]
for x in range(0,len(list1)) :
   newlist= list1[x],list2[x]
   print (newlist)

