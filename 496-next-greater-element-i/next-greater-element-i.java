class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for(int num: nums2)
        {
            while(!stack.isEmpty() && num>stack.peek())
            {
                hm.put(stack.pop(), num);
            }
            stack.push(num);
        }
        int[] res = new int[nums1.length];
        for(int i =0; i<nums1.length;i++)
        {
            res[i] = hm.getOrDefault(nums1[i], -1);
        }
        return res;
    }
}