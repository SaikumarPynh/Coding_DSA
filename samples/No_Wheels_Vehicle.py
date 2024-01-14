"""Problem Statement – An automobile company manufactures both a two wheeler (TW) and a four wheeler (FW). A company manager wants to make the production of both types of vehicle according to the given data below:

1st data, Total number of vehicle (two-wheeler + four-wheeler)=v
2nd data, Total number of wheels = W
The task is to find how many two-wheelers as well as four-wheelers need to manufacture as per the given data.
Example :

Input :
200  -> Value of V
540   -> Value of W

Output :
TW =130 FW=70

Explanation:
130+70 = 200 vehicles
(70*4)+(130*2)= 540 wheels"""

def find_vehicle(v,w):
     # Equation 1: V = TW + FW
    # Equation 2: W = 2 * TW + 4 * FW

    # Rearrange Equation 1 to get TW in terms of FW
    # TW = V - FW
    # Substitute TW in Equation 2
    # W = 2 * (V - FW) + 4 * FW

    # Simplify the equation to solve for FW
    # 2V - W = 2 * FW
    # FW = (2V - W) / 2

    fw = (w - (2 * v) ) // 2
    tw = v - fw
    return f"total two wheelers are{tw} and four wheelers are {fw}"






v = int(input("enter the number of vehicles:"))
w = int(input("enter the number of wheels:"))
print(find_vehicle(v,w))