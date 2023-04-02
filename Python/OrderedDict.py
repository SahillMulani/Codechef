from collections import OrderedDict
import re

N = int(input())

mydict = OrderedDict()
for i in range(N):
    key , value = input().rsplit(maxsplit=1)
    mydict[key] = mydict.get(key,0) + int(value)

print(mydict.get("CANDY",1))