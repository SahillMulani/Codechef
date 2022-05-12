if __name__ == "__main__":
    T = int(input())

    def compare(a ,b):
        if(a >= b):
            return b
        else:
            return a

    while(T > 0):
        a , b , c , d = [int(x) for x in input().split(' ')]
        X = compare(a , b) + c
        print(X)
        Y = compare(a , b) + d
        print(Y)
        if( a >= b):
            print("N")
        else:
            print("S")
        T = T - 1