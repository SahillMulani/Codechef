def iterations(A):
        sum = 0
        count = 0
        for x in range(0,len(A)):
            if(sum < X):
                sum = sum + A[x]
                count = count + 1
                if(x == (len(A) -1) and sum < X):
                    return -1
            else:
                return count 

if __name__ == '__main__':
    T = int(input())
    while(T > 0):
        N , X = [int(x) for x in input().split()]
        A = list(map(int,input().strip().split()))[:N]
        A.sort(reverse=True)
        print(iterations(A))
        T = T - 1

        
        