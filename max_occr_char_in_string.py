strings = input("enter the string")
# dic = {}
# for i in string:
#     if i in dic.keys():
#         dic[i] += 1
#     else:
#         dic[i] = 1
# resmax = max(dic,key = dic.get)
# resmin = min(dic,key = dic.get)
# print(resmax,resmin)
dic = {}
for i in strings:
    if i in dic:
        dic[i] += 1
    else:
        dic[i] = 1
print(dic)
max_letter  =  max(dic, key = dic.get)
min_letter = min(dic, key = dic.get)
print("maximun is",max_letter, "minimun is",min_letter)
