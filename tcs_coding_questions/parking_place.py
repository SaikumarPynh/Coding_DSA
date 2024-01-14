"""A parking lot in a mall has RxC number of parking spaces. Each parking space will either be  empty(0) or full(1). The status (0/1) of a parking space is represented as the element of the matrix. The task is to find index of the prpeinzta row(R) in the parking lot that has the most of the parking spaces full(1).

Note :
RxC- Size of the matrix
Elements of the matrix M should be only 0 or 1.

Example 1:
Input :
3   -> Value of R(row)
3    -> value of C(column)
[0 1 0 1 1 0 1 1 1] -> Elements of the array M[R][C] where each element is separated by new line.
Output :
3  -> Row 3 has maximum number of 1’s

Example 2:
input :
4 -> Value of R(row)
3 -> Value of C(column)
[0 1 0 1 1 0 1 0 1 1 1 1] -> Elements of the array M[R][C]
Output :
4  -> Row 4 has maximum number of 1’s"""

# Define a 2D array (3x3 matrix) filled with zeros
rows, cols = 3, 3
matrix = [[int(input())for _ in range(cols)] for _ in range(rows)]

# Print the 2D array
for row in matrix:
    print(row)
x = [0,1,2]
m = 0
i = 0
res = 0
for row in matrix:
    x[i] = sum(row)
    if x[i] > m:
        m = x[i]
        res = i + 1
    i += 1
print(m,res)
