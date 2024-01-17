# test_str = input("entr the test string")
# new = ''
# l = test_str.split()
# for i in l:
#     if len(i) % 2 == 0:
#         new = new + i + ' '
# print(new)
# test_str  = input("entr the test string")
# new = []
# l = test_str.split()
# for i in l:
#     if len(i) % 2 == 0:
#         new.append(i)
# print(' '.join(new))
#another way
str = input("enter the string:")
l = str.split()
if len(l) % 2 == 0:
    print("string having even length:")
else:
    print("string having odd length:")
for i in l:
    str = "".join(i)
print(str)


