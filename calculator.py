mport math

print("Select the operator\n")
print("1.addition.\n")
print("2.subtraction.\n")
print("3.multiplication.\n")
print("4.sin.\n")
print("5.cos.\n")
print("6.tan\n")
print("7.exp\n")
inp = int(input("Enter: "))

if inp == 1:
    a = int(input("Enter the first number: "))
    b = int(input("Enter the second number: "))
    add = a + b
    print("The addition of ", a, " and ", b, " is ", add, ".")

elif inp == 2:
    c = int(input("Enter the first number: "))
    d = int(input("Enter the second number: "))
    sub = c - d
    print("Subtracting ", d, " from ", c, " gives ", sub, ".")

elif inp == 3:
    e = int(input("Enter the first number: "))
    f = int(input("Enter the second number: "))
    multiplication = e * f
    print("The multiplication of ", e, " and ", f, " is ", multiplication, ".")

elif inp == 4:
    dg1 = float(input("angle in degrees"))
    rad1 = float(math.radians(dg1))
    print("The sin of ", dg1, " is ", float(math.sin(rad1)), ".")

elif inp == 5:
    dg2 = float(input("angle in degrees"))
    rad2 = float(math.radians(dg2))
    print("The cos of ", dg2, " is ", float(math.cos(rad2)), ".")

elif inp == 6:
    dg3 = float(input("angle in degrees"))
    rad3 = float(math.radians(dg3))
    print("The tan of ", dg3, " is ", float(math.tan(rad3)), ".")

elif inp == 7:
    g = int(input("Enter the first number: "))
    h = int(input("Enter the second number: "))
    exp = g ** h
    print(g, " to the power of ", h, " equals ", exp, ".")

else:
    print("invalid")
