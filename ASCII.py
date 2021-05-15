# ascii to text and text to ascii
text = int(input("press 1 or 2 for ascii to text or text to ascii"))

if text == 1:
    arr = list()
    arrlength = input("Enter string length ")
    print("Enter string: ")
    for i in range(int(arrlength)):
        arrlength = input()
        arr.append(int(arrlength))

    res = ''.join(chr(val) for val in arr)
    print("The string is: ", str(res))

elif text == 2:
    string = input("Enter a string of text: ")
    list_of_characters = list(string)
    list_of_ord_values = [ord(character) for character in list_of_characters]
    print(list_of_ord_values)
