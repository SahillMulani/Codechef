num = input()
values = input().split()
M = set(values)

num = input()
values = input().split()
N = set(values)

diff_1 = M.difference(N)
diff_2 = N.difference(M)

mylist = []
for i in diff_1:
    mylist.append(int(i))
for j in diff_2:
    mylist.append(int(j))

mylist.sort()
for i in mylist:
    print(i)