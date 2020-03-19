'''
Given two strings str1 and str2 and below operations that can performed on str1. 
Find minimum number of edits (operations) required to convert ‘str1’ into ‘str2’.
'''
import sys
def EditDIstance(sourceString,destinationString):
    sizeOfSource = len(sourceString)
    sizeOfDestination = len(destinationString)
    hashTable = [[0 for j in range(0,sizeOfDestination + 1)] for i in range(0,sizeOfSource + 1)]
    i = 0
    while i <= sizeOfDestination:
        hashTable[0][i] = i
        i = i + 1
    i = 0
    while i <= sizeOfSource:
        hashTable[i][0] = i
        i = i + 1
    for row in range(1, sizeOfSource + 1):
        for col in range(1, sizeOfDestination + 1):
            if sourceString[row-1] == destinationString[col-1]:
                hashTable[row][col] = hashTable[row - 1][col - 1]
            else:
                hashTable[row][col] = min(hashTable[row][col - 1], hashTable[row - 1][col]) + 1
    return hashTable[sizeOfSource][sizeOfDestination]

print('Cost of converting source to dest is', EditDIstance("ball", "bat"))


