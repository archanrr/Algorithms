/*
10/4/2022 : 682. Baseball Game [yesterday bought my first cray fish]

You are keeping score for a baseball game with strange rules. The game consists of several rounds, where the scores of past rounds may affect future rounds' scores.

At the beginning of the game, you start with an empty record. You are given a list of strings ops, where ops[i] is the ith operation you must apply to the record and is one of the following:

An integer x - Record a new score of x.
"+" - Record a new score that is the sum of the previous two scores. It is guaranteed there will always be two previous scores.
"D" - Record a new score that is double the previous score. It is guaranteed there will always be a previous score.
"C" - Invalidate the previous score, removing it from the record. It is guaranteed there will always be a previous score.
Return the sum of all the scores on the record.
*/
class BaseBallGame {
    public int calPoints(String[] ops) {
        Deque<Integer> stack = new LinkedList<>();
        for(String val:ops) {
            if("+".equals(val)) {
                int op1 = stack.pop();
                int op2 = op1 + stack.peek();
                stack.push(op1);
                stack.push(op2);
            } else if("C".equals(val)) {
                stack.pop();
            } else if("D".equals(val)) {
                stack.push(2*stack.peek());
            } else {
                stack.push(Integer.parseInt(val));
            }
        }
        int res=0;
        while(!stack.isEmpty()) {
            res+=stack.pop();
        }
        return res;
    }
}
