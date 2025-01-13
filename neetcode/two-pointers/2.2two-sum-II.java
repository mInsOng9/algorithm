class Solution {
    public int[] twoSum(int[] numbers, int target) {

        for(int i=0;i<numbers.length;i++){
            int pointer=numbers.length-1;
            while(pointer>i){
                if(target==numbers[i]+numbers[pointer]){
                    return new int[]{i+1,pointer+1};
                }
                pointer--;
            }
        }
        return new int[2];
    }
}
