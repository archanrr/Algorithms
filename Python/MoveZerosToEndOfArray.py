'''
Given a array of numbers including '0', move all zeros to end on a array.
only using inplace method.

'''
import sys

def MoveZeroToEnd(inputArray):
    i, j = 0, 1
    for index, num in enumerate(inputArray):
        if num == 0:
            i = index
            j = index + 1
            break
    while i >= 0 and j < len(inputArray):
        if inputArray[i] == 0 and inputArray[j] != 0:
            inputArray[i], inputArray[j] = inputArray[j], inputArray[i]
        if inputArray[i] != 0:
            i += 1
        if inputArray[j] == 0:
            j += 1
    return inputArray

print MoveZeroToEnd([0, 0, 0, 0, 0, 1])