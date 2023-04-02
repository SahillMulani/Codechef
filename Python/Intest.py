n = int(input())
k = int(input())
count = 0
while(n != 0):
    t = int(input())
    if(k != 0 and t%k == 0):
        count += 1
    n = n - 1
print(count)