
def func(nums):
    new_nums = []
    count = 0
    for i in range(len(nums)):
        if nums[i] == 0:
            count = count + 1
        else:
            new_nums.append(nums[i])

    for i in range(count):
        new_nums.append(0)

    return new_nums

nums = [0,1,0,3,12]
print(func(nums))
