class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        int index = n - 1;
        while(left <= right){
            int right_square = nums[right] * nums[right];
            int left_square = nums[left] * nums[left];
            if(left_square > right_square){
                result[index] = left_square;
                left ++;
            }
            else{
                result[index] = right_square;
                right --;
            }
            index --;
        }
        return result;
    }
}
