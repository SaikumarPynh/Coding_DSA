def comparing(arr):
    count = 1
    for i in range(1,n):
        if arr[i] > arr[0-i]:
            count += 1
    return count





arr = []
n = int(input("enter the number of elements:"))
for i in range(n):
    arr.append(int(input("enter the array element:")))

print(comparing(arr))