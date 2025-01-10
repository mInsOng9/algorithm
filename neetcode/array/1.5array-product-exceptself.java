class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        int totalProd=1;
        int zeroCnt=0;
        for(int num: nums){
            if(num==0) 
                zeroCnt++;
            else 
                totalProd*=num;
        }
        if(zeroCnt>1)return ans;
        
        for(int i=0;i<ans.length;i++){
            if(nums[i]==0) ans[i]=totalProd;
            else if(zeroCnt==0)
                ans[i]=totalProd/nums[i];
        }
        return ans;
    }
}
