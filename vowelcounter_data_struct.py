
str = input("Enter the strng here: ")
lowercase = str.lower()


vowel_counts = {}

for vowel in "aeiou":
    count = lowercase.count(vowel)
    vowel_counts[vowel] = count
    counts = vowel_counts.values()

total_vowels = sum(counts)
print(total_vowels)
