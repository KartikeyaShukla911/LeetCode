// Sort Array with Squares

public int[] sortedSquares(int[] nums) {
        
        int n = nums.length,i;
        for(i=0;i<n;i++)
        {
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
