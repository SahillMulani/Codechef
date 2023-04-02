if __name__ == '__main__':
    T = int(input())
    while(T > 0):
        x , y , z = [int(x) for x in input().split()]
        if( x + y > z):
            print("TRAIN")
        elif(x + y < z):
            print("PLANEBUS")
        else:
            print("EQUAL")
        T = T - 1
