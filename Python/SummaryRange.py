nums = [0,1,2,4,5,7]
newlist = []
for i in range(len(nums) - 1):
    if (nums[i+1] == (nums[i]+1) ):
        