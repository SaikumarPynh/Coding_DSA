# s = input()
# y = s[::-1]
# m = len(s) // 2
# t = s[:m]
# r = s[m:]
# if t == r:
#     print("symmetric")
# elif  s == y:
#     print("polindrome")
str = input("enter the string to be checked:")
rstr = str[::-1]
if str == rstr:
    print("palindrome")
else:
    print("not a palindrome")
    