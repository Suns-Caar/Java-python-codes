def binarypa(num):

    print(num)
    num = num[0:]
    if num == num[-1::-1]:
        print("it is a palindrome ")
    else:
        print("no it is not a palindrome")
num = input("enter the integer here: ")
binarypa(num)
