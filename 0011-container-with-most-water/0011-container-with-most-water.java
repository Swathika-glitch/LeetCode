class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length -1;
        int mw=0;
        
        int l=0;
        int w=0;
        

        while(i<j){
            int h=Math.min(height[i],height[j]);
            l=j-i;
            w=h*l;
            mw=Math.max(mw,w);

            if(height[i]>height[j]){
                j--;
            }
            else{
                i++;
            }


        }
        return mw;
    }
}