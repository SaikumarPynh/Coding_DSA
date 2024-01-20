
"""to convert a first and last charecter of a string or word to lower upper case

test_str = input("entr the test string")
new = test_str.title()[::-1]
newer = new[0].upper()+new[1:]
print(newer[::-1])"""


test_str = input("entr the test string")
a = test_str.split()
new = []
for i in a:
    n = i[0].upper() + i[1:-1] + i[-1].upper()
    new.append(n)
print(' '.join(new))
print(test_str[0].upper()+test_str[1:-1]+test_str[-1].upper())
