'''
Find a Pair of numbers from list whose sum should be equal to given number
Example : list is [1, 2, 3, 4, 5] sum = 6
Output : [2,4]
sorted variable will decide input is sorted or not
'''
import sys

def findPairInSort(list_of_number, sum_of_pair) :
    list_size = len(list_of_number)
    firstPtr = 0
    lastPtr = list_size - 1
    pairList = []
    while firstPtr < lastPtr:
        tempSum = list_of_number[firstPtr] + list_of_number[lastPtr]
        if tempSum == sum_of_pair:
            pairList.append([list_of_number[firstPtr], list_of_number[lastPtr]])
            return pairList
        elif tempSum > sum_of_pair:
            lastPtr = lastPtr - 1
        elif tempSum < sum_of_pair:
            firstPtr = firstPtr + 1
    return "No pair found"

def FindPair(list_of_number, sum_of_pair):
    lookupTable = {}
    for numbers in list_of_number:
        if numbers in list(lookupTable) :
            return [lookupTable[numbers], numbers]
        else :
            if sum_of_pair - numbers >= 0:
                lookupTable[sum_of_pair - numbers] = numbers
    return "No Pair found"

#input list
list_of_number = [31, 41, 51, 6]
#sum of pair
sum_of_pair = 37
#if check the list is sorted or not
isListSorted = "false"
if isListSorted == "true":
    res = findPairInSort(list_of_number, sum_of_pair)
    print 'The Sum Pair is',res
else:
    res = FindPair(list_of_number, sum_of_pair)
    print 'The Sum Pair is',res
