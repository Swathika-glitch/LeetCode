class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int e) {
        ArrayList<Boolean> f=new ArrayList<>();
        int max=0;
        for(int i=0;i<candies.length;i++){
            max=Math.max(max,candies[i]);
        }
        for(int i=0;i<candies.length;i++){
            f.add((candies[i]+e)>=max);
        }
        return f;
    }
}