"""string = input("enter the string")
dic = {}
for i in string:
    if i in dic.keys():
        dic[i] += 1
    else:
        dic[i] = 1
resmax = max(dic,key = dic.get)
resmin = min(dic,key = dic.get)
print(resmax,resmin)
"""
str = input("enter the string:")
lis = {}
count = 0
for i in str:
    if i in lis:
        lis[i] += 1
    else:
        lis[i] = 1
print(lis)
max_key = max(lis, key = lis.get)
print(max_key)
min_key = min(lis, key = lis.get)
print(min_key)