def bitwise_and(x,y):


def get_max(A,K):
    a = []
    for i in range(0, len(A), K): 
        x = A[i:i + K]
        a.append(max(x))
    for j in range(1,len(a) - 1):
        bitwise_and(a[i],a[i+1])

T = int(input())

while(T > 0):
    N , K = [int(x) for x in input().split()]
    A = list(map(int,input().strip().split()))[:N]
    Length = int(len(A)/K)
    get_max(A,Length)
    T = T - 1
    
