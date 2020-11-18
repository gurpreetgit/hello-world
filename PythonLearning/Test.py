print("Hello, World!")

# Testing If clause
if 5>2 :
    print ("5 is greater than 2")
else:
        pass

#Testing Variables 
x = 4 # x is of type int
x = "Sally" # x is now of type str
print (x)

#assigning multiple values
x, y, z = "Orange", "Banana", "Cherry"
print (x,y,z)

#Testing global and locAL VARIABLE 
x = "awesome"

def myfunc():
    # global x  : If you use the global keyword, the variable belongs to the global scope:
  x = "fantastic"      
  print ("Inside Function myfunc() :" +" Python is " + x)  #local : Life inside function

myfunc()

print ("Python is " + x) # global

##################### LIST ####################################

x = ["apple", "banana", "cherry"] ; print (type(x)) 
y = ("apple", "banana", "cherry") ; print (type(y)) 
z = range(6) ; print (type(z)) 
a = {"name" : "John", "age" : 36} ; print (type(a)) 
b = {"apple", "banana", "cherry"} ; print (type(b)) 
#display x,y,z,a,b
print (x,y,z,a,b)

##### concatenating String and Int ############
#We can combine strings and numbers by using the format() method! The format() method takes the passed 
#arguments,formats them, and places them in the string where the placeholders {} are:
age = 36
txt = "My name is John, and I am {}"
print(txt.format(age))

##### dictionary #######

dict = {
    "name" : "gurpreet",
    "age" : "secret"
    }
for x, y in dict.items():
  print(x, y)

###### Nested Dictionary ######

myfamily = {
  "child1" : {
    "name" : "Emil",
    "year" : 2004
  },
  "child2" : {
    "name" : "Tobias",
    "year" : 2007
  },
  "child3" : {
    "name" : "Linus",
    "year" : 2011
  }
}
for x,y in myfamily.items() :
    print (x,y)

##### Lambda Expression ######

x = lambda a, b, c : a + b + c
print(x(5, 6, 2))


### Impementing Inheritance 

class Person:
    def __init__(self,fname,lname):
        self.fname=fname
        self.lname=lname

    def printnames(self):
        print("Name is :"+self.fname +" LastName is :" +self.lname)
    
#p = Person("Mike","Doe")
#p.printnames()

class Student(Person): ## Inheritance
    def __init__(self,fname,lname):     ## Method Overloading 
        Person.__init__(self,fname,lname)

stu = Student ("ABC", "YZ")
stu.printnames()

