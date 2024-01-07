#We are given a string and we need to reverse words of a given string

# s = input()
# y = s.split()
# l = []
# for i in y:
#     l.append(i)
# t = l[::-1]
# print(' '.join(t))


# #s = input()
# # y = s.split()[::-1]
# #print(' '.join(y))
# str = input("enter the sentense to be reversed:")
# lis = []
# for i in str:
#     print(i)
str = input("enter the sentense:")
lis = list(str.split())
for i in range(len(lis)-1,-1,-1):
    print(lis[i],end = " ")
