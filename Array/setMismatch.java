
class setMismatch {
    public int[] findErrorNums(int[] nums) {
// create an array in which the value of the cell with index n is equal to the number of repetitions n in the nums array
        var numsOfRepeat = new int[nums.length+1]; 
        var result = new int[2];
        int missNum = 0; 
        
        for (int i = 0; i < nums.length; i++){
            missNum = missNum + (i+1);  // sum all numbers from 1 to n            
            numsOfRepeat[nums[i]]+=1; // increase the number of repetitions n
            if (numsOfRepeat[nums[i]] == 2){  // check if n is a duplicate
                result[0] = nums[i]; 
            } else {
                missNum-=nums[i]; // subtract from the sum from 1 to n each non-repeating element
            }
        }
        
        result[1] = missNum;
        return result;
    }
}