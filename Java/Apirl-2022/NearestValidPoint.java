/*
12/4/2022 : 1779. Find Nearest Point That Has the Same X or Y Coordinate

You are given two integers, x and y, which represent your current location on a Cartesian grid: (x, y). You are also given an array points where each points[i] = [ai, bi] represents that a point exists at (ai, bi). A point is valid if it shares the same x-coordinate or the same y-coordinate as your location.

Return the index (0-indexed) of the valid point with the smallest Manhattan distance from your current location. If there are multiple, return the valid point with the smallest index. If there are no valid points, return -1.

The Manhattan distance between two points (x1, y1) and (x2, y2) is abs(x1 - x2) + abs(y1 - y2).
*/
class NearestValidPoint {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int minDistance = Integer.MAX_VALUE, count = 0, res = -1;
        for(int i=0; i<points.length; i++) {
            if(points[i][0] == x || points[i][1] == y) {
                int dis = Math.abs(points[i][0] - x)+ Math.abs(points[i][1] -y);
                if(dis < minDistance) {
                    minDistance =  dis;
                    res = i;
                }     
            }
        }
        return res;
    }
}
