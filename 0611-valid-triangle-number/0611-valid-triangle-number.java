class Solution {
    public int triangleNumber(int[] nums) {
       int n=nums.length;
       Arrays.sort(nums);
       int count=0;

       for(int i=n-1;i>=2;i--){
        int right=i-1;
        int left=0;

        while(left<right){
            if(nums[left]+nums[right]>nums[i]){
                count+=right-left;
                right--;
            }
            else{
                left++;
            }
        }
       } 
       return count;
    }
}