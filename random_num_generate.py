import random
#random number in a given range 
random_num = random.randint(1,100)
print(random_num)
# random float number in a given range
rand_bin = random.uniform(1,6)
print(rand_bin)
#choosing any random element in a sequence data type
lis = ['hi','hello','namasthe']
rand_ele = random.choice(lis)
print(rand_ele)