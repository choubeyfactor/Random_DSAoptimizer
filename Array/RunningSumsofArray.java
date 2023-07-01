public class RunningSumsofArray {
    public int[] runningSum(int[] nums) {
        int res = 0;
        int arr[] = new int[nums.length];
        for(int i=0; i<nums.length;i++){
            res+=nums[i];
            arr[i] = res;

        }
        return arr;
    }
}