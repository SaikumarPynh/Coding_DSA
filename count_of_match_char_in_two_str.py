str1 = input("enter str1 ")
str2 = input("enter the str 2:")
count = 0
for i in str1:
    if i in str2:
        count += 1
print(count)