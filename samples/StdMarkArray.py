"""At the next level is the process of re-evaluation, which is performed by another department. The re-evaluation can impact marks of K students. The re-evaluation will update their marks and then again, the 3 final merit list will be declared.

The re-evaluation will be in the format of XY, Here X is the index of the student whose marks needs to be changed from the original value to V. Each re-evaluation is independent, and the merit list is updated after each re-evaluation

After each re-evaluation the merit list is updated, where the cheater is filtered out if there Is any. Your task is to find the maximum number of students that were part of the merit list after each re-evaluation. Only the final merit list is visible to all students"""
"""Input:

Number of Students N=5

Respective marks M=[1,1,2,5,2]

After re-evaluation there were 2 (K=2) students whose marks are updated.

X[1]=3(Y)

X[4]=2(Y)

Output:

For first re-evaluations answer is 5

For second re-evaluations answer is 3"""

def revaluation(p,e,n):
    ans = 1
    arr[p] = e
    for i in range(1,n):
        if arr[i - 1] != arr[i]:
            ans += 1
    return f"the total number of elements is",ans
n = int(input("enter the number of elements;"))
arr = []
i = 0
for i in range(n):
    arr.append(int(input(f"enter the {i+1}element:")))

re = int(input("enter the number of revauations:"))
for i in range(re):
    pos = int(input("enter the position of an element:"))
    ele = int(input("enter the element"))
    print(revaluation(pos,ele,n))

