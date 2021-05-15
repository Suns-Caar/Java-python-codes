#Take string input from user and count no of  vowels in it
str = input("Enter string:")
count = 0
stri = str.lower()
for i in stri:
     if (i == 'a' or i == 'i' or i == 'e' or i == 'o' or i == 'u'):
            count = count + 1
print("Number of vowels are:")
print(count)
