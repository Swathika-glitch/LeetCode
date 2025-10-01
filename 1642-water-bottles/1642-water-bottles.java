class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int num=0;
        int empty=0;

        while(numBottles>0){
            num+=numBottles;
            empty+=numBottles;

            numBottles=empty/numExchange;
            empty=empty%numExchange;
        }
        return num;
    }
}