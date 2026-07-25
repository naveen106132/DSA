class Solution {
    public int subtractProductAndSum(int n) {
      int  temp=1;
      int sum =0;
      while(0<n){
       int d=n%10;
       temp=temp*d;
       sum=sum+d;
       n=n/10;
      }
      return temp-sum;
    }
}