"""At a fun fair, a street vendor is selling different colours of balloons. He sells N number of different colours of balloons (B[]). The task is to find the colour (odd) of the balloon which is present odd number of times in the bunch of balloons.

Note: If there is more than one colour which is odd in number, then the first colour in the array which is present odd number of times is displayed. The colours of the balloons can all be either upper case or lower case in the array. If all the inputs are even in number, display the message “All are even”.

Example 1:

7  -> Value of N
[r,g,b,b,g,y,y]  -> B[] Elements B[0] to B[N-1], where each input element is sepārated by ṉew line.
Output :

r -> [r,g,b,b,g,y,y]  -> “r” colour balloon is present odd number of times in the bunch.
Explanation:
From the input array above:

r: 1 balloon 
g: 2 balloons
b:  2 balloons
y : 2 balloons
Hence , r is only the balloon which is odd in number."""

def oddballoons(arr):
    count = 0
    s = set(arr)
    for i in s:
        if (arr.count(i) % 2) != 0:
            print(i,"is odd times appeared in the list")
            count += 1
    if count < 1:
        print("no color repeated odd times")



arr = []
for i in range(int(input("enter the number of elements:"))):
    arr.append(input("enter the color:"))
oddballoons(arr)