# str = input("enter the string")
# uniq = ''
# for i in str:
#     if i not in uniq:
#         uniq = uniq + i
# print(uniq)
str = input("enter the string:")
lis = []
for i in str:
    lis.append(i)
for i in lis:
    if lis.count(i) > 1:
        print(i)
