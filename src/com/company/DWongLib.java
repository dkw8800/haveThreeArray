package com.company;

public class DWongLib {
    public static boolean haveThree(int[] nums)
    {
        int threecount = 0;
        for(int i = 0;i < nums.length;i++)
        {
            if(nums[i] == 3)
            {
                if(i < nums.length - 1 && nums[i+1] == 3)
                    return false;
                else
                    threecount++;
            }
        }
        if(threecount == 3)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
