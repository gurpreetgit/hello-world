string1, string2 = "My Country name is" , "India is great"
print (string1[2:(len(string1)+1)]+ " " + string2[0:5])
#output  : "Country name is India"


Mylist = ['a','b','c','d',['e','f']]
##Mylist = {'a','b','c','d',{'e','f'}}   ###TypeError: unhashable type: 'set'
##Mylist = ('a','b','c','d',('e','f'))   ###TypeError: 'tuple' object does not support item assignment
#output : Change value of f to g
print (Mylist[4][1])
Mylist[4][1] = 'g'
print(Mylist)
      
NewList = ['a','b','c','d',['e','f',['g','h']]]
print (NewList[4][2][1])
## output :: getting element h
       
# check if value is int ==> Gurpreet1234
# val1 =1.1 val2 =2.3 output = 3

val1 , val2 = 1.1 , 3.4
print(int(val1)+int(val2))
val2 = "Gurpreet1234"
if val2.isdigit :
    print ("is digit")
else :
    print ("alphanumeric")



