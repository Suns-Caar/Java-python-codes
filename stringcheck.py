# (8th and 13th)Take two string inputs from the user and check if they are the same (both with and without case-sensitivity)

string1 = input("Enter the first string: ")
print(string1, end="\n")
string2 = input("Enter the second string: ")
print(string2, end="\n")


if (string1.lower() == string2.lower()):
    print("The strings are same(case insensitive)")
else:
    print("No(case insensitive)")

if(string1 == string2):
    print("string is completely same(case sensitive)")
else:
    print("not same(case sensitive)")
