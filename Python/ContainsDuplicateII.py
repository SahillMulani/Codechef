def containsNearbyDuplicate(nums: list[int], k: int) -> bool:
    newlist = []
    for i in range(len(nums)):
        newlist.append([nums[i],i])
    
    for i in range(len(newlist) - 1):
        if newlist[i][0] == newlist[i+1][0]:
            if abs(newlist[i][1] - newlist[i+1][1]) <= k:
                    return True
    return False

nums = [1,2,3,1]
containsNearbyDuplicate(nums,3)