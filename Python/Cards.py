def locateCards(cards,query):
    for i in range(0,len(cards)):
        if cards[i] == query:
            return i
    return -1

if __name__ == '__main__':
    cards = [2,3,5,6,7,8,9]
    query = 81
    print(locateCards(cards,query))