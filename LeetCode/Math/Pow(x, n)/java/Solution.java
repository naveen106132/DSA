class Solution {
    public double myPow(double x, int n) {
        double a=0;
        long b=n;
        if(a<b){
            a=Math.pow(x,b);
        }
        else if(a>b){
            a=(1/Math.pow(x,-b));
        }
        else{
            a=1;
        }
        return a;
    }
}