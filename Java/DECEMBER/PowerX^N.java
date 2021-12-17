/*
Pow(x, n)
Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

*/
class PowerX^N {
    public double myPow(double x, int n) {
        int i=1;
        double res=0;
        if(x<0) {
            x = -x;
            if(n%2!=0) i=-1;
        }
        res = (Math.log(x))*n;
        return Math.exp(res)*i;
    }
}
