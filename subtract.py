#Take two integer inputs from the user and subtract one from the other without using minus operator 
num1=int(input("Enter 1stt number:"))
num2=int(input("Enter 2nd number:"))
subtract = num1 + (~num2 + 1)
print("Subtraction of two number is ",subtract)

