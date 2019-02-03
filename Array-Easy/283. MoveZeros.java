
/*  题目要求是将数组中的0全部移动到数组的最后且不可改变数组的数字顺序
    如[1,2,0,3,0] -> [1,2,3,0,0]
*/

//  Method1 Starts. 第一个方法是用双指针来确定数组中零的个数并将数组所有元素移到前零的个数里。
class Solution {
    public void moveZeroes(int[] nums) {
        int g = 0;  
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] != 0) {
                nums[g] = nums[k];
                g++;
            }
        }
        
        for (int i = g; i < nums.length; i++) {
            nums[i] = 0;
        }
        
    }
}
//  Method1 Ends.




