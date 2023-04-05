from functools import reduce
from operator import xor
nums = [1,1,1,3,3,4,3,2,4,2,5]

print(reduce(xor,nums))