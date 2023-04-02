def generate(self, numRows: int) -> List[List[int]]:
        arr = []
        mylist = []

        arr.append(1)
        mylist.append(arr)

        for i in range(1,numRows):
            temp = []
            temp.append(1)
            prev = mylist[i-1]
            for i in range(len(prev) - 1):
                temp.append(prev[i]+prev[i+1])
            temp.append(1)
            mylist.append(temp)
        
        return mylist