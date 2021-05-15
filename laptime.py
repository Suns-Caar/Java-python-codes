#Take three string inputs representing lap times in minute:seconds:milliseconds format and print which lap was the fastest
import datetime
print("enter time in min:sec:millisec without the : and space in between ")
timestr1 = input("enter 1st time: ")
timestr2 = input("enter 2nd time: ")
timestr3 = input("enter 3rd time: ")
time1 = datetime.datetime.strptime(timestr1,'%M %S %f')
time2 = datetime.datetime.strptime(timestr2,'%M %S %f')
time3 = datetime.datetime.strptime(timestr3,'%M %S %f')

if(time1 < time2 and time1 < time3):
    print("time 1 is the fastest: ", time1)
elif(time2 < time1 and time3 > time2):
    print("time2 is the fastest", time2)
else:
    print("time3 is the fastest: ", time3)
