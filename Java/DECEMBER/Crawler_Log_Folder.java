/*
Crawler Log Folder

The Leetcode file system keeps a log each time some user performs a change folder operation.

The operations are described below:

"../" : Move to the parent folder of the current folder. (If you are already in the main folder, remain in the same folder).
"./" : Remain in the same folder.
"x/" : Move to the child folder named x (This folder is guaranteed to always exist).
You are given a list of strings logs where logs[i] is the operation performed by the user at the ith step.

The file system starts in the main folder, then the operations in logs are performed.

Return the minimum number of operations needed to go back to the main folder after the change folder operations.

Input: logs = ["d1/","d2/","./","d3/","../","d31/"]
Output: 3

Input: logs = ["d1/","../","../","../"]
Output: 0

*/
class Solution {
    public int minOperations(String[] logs) {
        int minOps = 0;
        for(int i=0;i<logs.length;i++){
            switch(logs[i]){
                case "../":
                    minOps = minOps==0?0:minOps-1;
                    break;
                case "./":
                    break;
                default:
                    minOps++;
            }
        }
        return minOps;
    }
}
