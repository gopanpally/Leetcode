class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> row = new HashSet<Integer>();
        Set<Integer> column = new HashSet<Integer>();

        for(int i =0; i<matrix.length; i++)
        {
            for(int j =0; j<matrix[0].length; j++)
            {
                if(matrix[i][j]==0)
                {
                    row.add(i);
                    column.add(j);
                }
            }
        }
        for(int i =0; i<matrix.length;i++)
        {
            for(int j =0; j<matrix[0].length;j++)
            {
                if(row.contains(i)|| column.contains(j))
                {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}