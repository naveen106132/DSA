class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalFuel=0;
        int requiredCost=0;
        for(int i=0;i<gas.length;i++)
        {
            totalFuel+=gas[i];
            requiredCost+=cost[i];
        }
        if(totalFuel<requiredCost) return -1;
        int resultIdx=0;
        int filled=0;
        for(int i=0;i<gas.length;i++)
        {
            filled=filled+gas[i]-cost[i];
            if(filled<0)
            {
                filled=0;
                resultIdx=i+1;
            }
        }
        return resultIdx;
    }
}