import datetime
import time
a = int(input("enter one here- "))

if(a == 1):
    now = datetime.datetime.now()
    print("%s %s %s" %(now.minute,  now.second, now.microsecond))
else:
    print("0")
b = int(input())
if(b == 1):
    now2 = datetime.datetime.now()
    print("%s %s %s" % (now2.minute, now2.second, now2.microsecond))
    delta = now2 - now
    print(delta)
else:
    print("invalid")
