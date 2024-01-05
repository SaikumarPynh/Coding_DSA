strings = input("enter the string")
dic = {}
for i in string:
    if i in dic.keys():
        dic[i] += 1
    else:
        dic[i] = 1
resmax = max(dic,key = dic.get)
resmin = min(dic,key = dic.get)
print(resmax,resmin)
