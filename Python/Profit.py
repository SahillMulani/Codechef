def test(prices: list ) ->int :
    maxSP = 0
    minSP = 0
    for i in range(len(prices)):
        minSP = min(minSP,prices[i])
        if prices[i] >= minSP:
            maxSP = max(maxSP, prices[i] - minSP)

    return maxSP - minSP


prices = [7,1,5,3,6,4]
print(test(prices))