/*  题目的描述是给一个数组和一个target值，如果数组中的两个元素起来来等于target值则返回两个元素的index值。
    如：[1,2,3,4,5] target = 6 -> [0,4]
*/

//  Method1: 利用HashMap来进行对数组元素和index值的存储，并且只需要进行1次遍历，在往HashMap里添加元素前进行对是否存在另外一个数是否存在的判断。
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> hash = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < nums.length; i++) {
            int anothernum = target - nums[i];
            
            if (hash.containsKey(anothernum)) {
                return new int[] {hash.get(anothernum), i};
            }
            
            hash.put(nums[i], i);
        }
        
        throw new IllegalArgumentException("No two sums at all!");
    }
}

//  Method2
