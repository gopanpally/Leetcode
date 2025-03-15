class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();

        for(int num:nums1)
        {
            hs1.add(num);
        }
         for(int num:nums2)
        {
            hs2.add(num);
        }
        
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        HashSet<Integer> temp1 = new HashSet<>(hs1);
        temp1.removeAll(hs2);
        l1.addAll(temp1);

        HashSet<Integer> temp2 = new HashSet<>(hs2);
        temp2.removeAll(hs1);
        l2.addAll(temp2);

        List<List<Integer>> ls1 = new ArrayList<>();
        ls1.add(l1);
        ls1.add(l2);

        return ls1;
    }
}