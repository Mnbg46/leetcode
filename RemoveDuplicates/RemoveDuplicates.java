package RemoveDuplicates;
import java.util.Arrays;


public class RemoveDuplicates 
{
    public static void main (String[] args)
    {
        RemoveDuplicates solution = new RemoveDuplicates();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int length = solution.removeDuplicates(nums);

        System.out.println("Length after removing duplicates: " + length);
        System.out.println("Array after removing duplicates: ");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

    }
        public int removeDuplicates(int[] nums) 
        {
            if (nums.length == 0) {
                return 0;
            }

        int uniqueIndex = 1;

 
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i - 1]){
                nums[uniqueIndex] = nums[i];
                uniqueIndex++;
            }
        }
        return uniqueIndex;
        
        
    }
}

