to remove a perticular charecter in a string using replace built in method


test_str = input("entr the test string")
rem_char = input("enter the charecter to be removed")
new_str = test_str.replace(rem_char,"")
print(new_str)

to replace a charecter in a perticular position in a string

test_str = input("entr the test string")
rem_pos = input("enter the charecter  pos to be removed")
pos = test_str.find(rem_pos)
new_str = test_str.replace(test_str[pos],"")
print(new_str)

removing an char in a perticular position using native method 
test_str = input("entr the test string")
rem_pos = int(input("enter the charecter  pos to be removed"))
new_str = ''
for  i in test_str:
    if i != test_str[rem_pos]:
        new_str = new_str + i
print(new_str)
simple alternative 
str = input("enter the string:")
letter = input("enter the letter to be removed:")
new = ''
for i in str:
    if i != letter:
        new += i
print(new)
