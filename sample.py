arrMatch = []
sentence_1 = input()
sentence_2 = "hello world my love"

res = sentence_1.split()
res2 = sentence_2.split()

for i in res :
    for j in res2:
        if i == j :
            arrMatch.append(i)

print(arrMatch)