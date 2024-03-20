print("Hello")
print(eval("2+3"))
a=[1,2,3,4]
for i in a:
    if i%2==0:
        print(i)

b=[(1,"abc"),(2,"cd"),(3,"er")]
for (i,j) in b:
    print(i," ",j)

import random
while(int(input("Enter 1 to continue or 0 to end: "))):
    print(random.choice(["Eepssa","Pragnya","Ananya"]))


d=dict()
d['1']="Hey"
d['2']="Bye"     #can be overridden
print(d['1'])
for i in d:
    print(d[i])


di={1:"abc",2:"cdw",3:"iu"}
print(di)


mixed_tuple = (1, "hello", 3.14, True)
nested_tuple = ((1, 2), ("a", "b"), (True, False))
print(mixed_tuple[1])
print(mixed_tuple[1:3])
print(nested_tuple[1][1])
print(nested_tuple[1][0])


