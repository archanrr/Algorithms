'''
Given an array of integers, return a new array 
such that each element at index i of the new array is the product of all the numbers in the original array 
except the one at i.

For example, if our input was [1, 2, 3, 4, 5],  the expected output would be [120, 60, 40, 30, 24]. 
If our input was [3, 2, 1], the expected output would be [2, 3, 6].

Follow-up: what if you can't use division?
'''
import sys

def findProductArray(inputArray):
    n = len(inputArray)
    productArray = [1 for i in range(n)]
    temp = 1
    i = 0
    for i in range(n):
        productArray[i] = temp
        temp = inputArray[i]*temp
    temp, i = 1, 1
    for i in range(n-1, -1, -1):
        productArray[i] = productArray[i] * temp
        temp = temp * inputArray[i]
    return productArray

print findProductArray([1, 2, 3, 4, 5])
print findProductArray([1, 1, 2, 6, 24])
print findProductArray([1, -1, -2, -6, -24])
