/*
22/03/2022 : 1663. Smallest String With A Given Numeric Value [First visit to bur dubai temple after 7 years]

The numeric value of a lowercase character is defined as its position (1-indexed) in the alphabet, so the numeric value of a is 1, the numeric value of b is 2, the numeric value of c is 3, and so on.

The numeric value of a string consisting of lowercase characters is defined as the sum of its characters' numeric values. For example, the numeric value of the string "abe" is equal to 1 + 2 + 5 = 8.

You are given two integers n and k. Return the lexicographically smallest string with length equal to n and numeric value equal to k.

*/
class getSmallestStringFromConstraints {
    public String getSmallestString(int n, int k) {
        char[] result = new char[n];
        for (int i = 0; i < n; i++) {
            result[i] = 'a';//initialize all array element with 'a'
            k--;
        }
        int numValue;
        while (k > 0) {
            numValue = Math.min(25, k);//building the string from the end to the beginning, it will always be optimal.
            result[--n] += numValue;
            k -= numValue;
        }
        return String.valueOf(result);
    }
}
