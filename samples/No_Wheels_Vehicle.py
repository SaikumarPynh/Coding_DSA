def find_number_of_vehicles(V, W):
    # Equation 1: V = TW + FW
    # Equation 2: W = 2 * TW + 4 * FW

    # Rearrange Equation 1 to get TW in terms of FW
    # TW = V - FW
    # Substitute TW in Equation 2
    # W = 2 * (V - FW) + 4 * FW

    # Simplify the equation to solve for FW
    # 2V - W = 2 * FW
    # FW = (2V - W) / 2

    FW = (2 * V - W) // 2
    TW = V - FW

    return TW, FW

# Example usage with the provided input
V = 200  # Total number of vehicles
W = 540  # Total number of wheels

TW, FW = find_number_of_vehicles(V, W)

# Output the results
print(f"TW = {TW}, FW = {FW}")
