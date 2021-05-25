def bubblesort(arr):

    for i in range(0,len(arr)):
        for j in range(1,len(arr)):
            if(arr[j] > arr[j-1]):
                arr[j],arr[j-1] = arr[j-1], arr[j]
    return arr
arr = []
n = int(input("enter length of num: "))
for i in range(0,n):
    x = int(input('enter the numbers: '))
    arr.append(x)
print("unsorted array is:",arr)
print("the sorted arr: ", bubblesort(arr))
