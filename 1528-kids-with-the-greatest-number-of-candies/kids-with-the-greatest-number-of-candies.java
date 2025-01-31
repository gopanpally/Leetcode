class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int maxCandy=0;
        for(int candy:candies)
        {
            if(candy>maxCandy)
                maxCandy=candy;
        }
        List<Boolean> result = new ArrayList<>();
        for(int candy:candies)
        {
            int a = candy+extraCandies;
            result.add(a>=maxCandy);
        }
        return result;
    }
}