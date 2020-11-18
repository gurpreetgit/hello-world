list1 = ['a','b','c','d','e']
list2= [1,2,3,4,5]
#output= [(a,1),(b,2),(c,3),(d,4),(5,e)]

for x in list1 :
    for y in list2 :
        print (x,y)


for x,y in list1,list2 :
    t = tuple(list1[x],list2[y])
    print(t)
