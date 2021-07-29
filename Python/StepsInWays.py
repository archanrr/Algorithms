'''
Number of ways to reach top of steps in given number of jumps
For Example : no of steps = 2 and jumps = 1 then total no of ways is 1
For Example : no of steps = 2 and jumps = 1 and 2  then total no of ways is 2
'''
import sys

def findNumOfWaysOneOrTwoJump(totalNumSteps):
    previousNum = 1
    currNum = 1
    newNum = 0
    if totalNumSteps == 0 or totalNumSteps == 1:
        return 1
    else:
        for i in range(2, totalNumSteps+1):
            newNum = previousNum + currNum
            previousNum = currNum
            currNum = newNum

    return currNum

##Dynamic Programming
def findNumOfWays(totalNumSteps, listOfJumps):
    totalStepList = []
    totalStepList.append(1)
    totalStepList.append(1)
    if totalNumSteps == 0 or totalNumSteps == 1:
        return 1
        
    for i in range(2, totalNumSteps + 1):
        total = 0
        for stepSize in listOfJumps:
            #print stepSize
            if i - stepSize >= 0:
                #print(totalStepList[i - stepSize])
                total = total + totalStepList[i - stepSize]
        totalStepList.append(total)
    
    return totalStepList[totalNumSteps]
    
for i in range(0, 10):
    print("No of ways for n = ",i," is ",findNumOfWaysOneOrTwoJump(i))
print("------------------------------------------------------------------------")
for i in range(0, 10):
    print("No of ways for n = ",i," is ",findNumOfWays(i, [1,2]))