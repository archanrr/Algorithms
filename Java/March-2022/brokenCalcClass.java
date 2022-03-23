/*
23/3/2022 : 991. Broken Calculator [First metro train travel and dubai mall visit ]
There is a broken calculator that has the integer startValue on its display initially. In one operation, you can:

multiply the number on display by 2, or
subtract 1 from the number on display.
Given two integers startValue and target, return the minimum number of operations needed to display target on the calculator.
*/
class brokenCalcClass {
    public int brokenCalc(int startValue, int target) {
        if(startValue >= target) return startValue - target;
        if(target % 2 == 0){
            return 1 + brokenCalc(startValue, target / 2);
        }
        return 1 + brokenCalc(startValue, target + 1);
    }
}
