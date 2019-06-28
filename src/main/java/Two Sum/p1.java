class Solution {
    public int[] twoSum(int[] nums, int target) {
        int firstIndex = 0; int secondIndex = 0;
        for(int i = 0; i < nums.length; i++ ) {
            int num = nums[i];
            secondIndex = getAnotherNumOrNot(nums, i, target - num);

            if(secondIndex != -1) {
                firstIndex = i;
                break;
            }
        }
        
        return new int[]{firstIndex, secondIndex};
    }
    
    private int getAnotherNumOrNot(int[] nums, int firstIndex, int secondTarget) {
        for(int i = 0; i < nums.length; i++ ) {
            int num = nums[i];
            if((i != firstIndex) && (num == secondTarget)) return i;
        }
        
        return -1;
    }
}