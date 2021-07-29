'''
Sort the given array of numbers irrespective of float or integer
It returns the list of bubble sorted list.
'''
import sys

def BubbleSort(arrayOfNumbers):
    for i in range(0, len(arrayOfNumbers)):
        for j in range(i + 1, len(arrayOfNumbers)):
            if arrayOfNumbers[i] > arrayOfNumbers[j]:
                cacheVal = arrayOfNumbers[i]
                arrayOfNumbers[i] = arrayOfNumbers[j]
                arrayOfNumbers[j] = cacheVal
    
    return arrayOfNumbers;

#input list
arrayOfNumbers = [ 7, 5, 32, 2, 1, 34, 1 , 1.1, 10000 , 100, 10 , 1.112, 1.2, 1.02222]
print(arrayOfNumbers)
print(BubbleSort(arrayOfNumbers))