package arrays;

public class countNegativeNumbersInASortedMatrix1351 {
    public int countNegatives(int[][] grid) {
        int count = 0;  
        for (int i = 0; i < grid.length; i++) {  
            for (int j = 0; j < grid[i].length; j++) {  
                if (grid[i][j] < 0) {  
                    count++; 
                }
            }
        }
        return count;  
    }

    public static void main(String[] args) {
        countNegativeNumbersInASortedMatrix1351 solution = new countNegativeNumbersInASortedMatrix1351();
        
        int[][] grid = {
            {4, 3, 2, 1},
            {3, 2, 1, 0},
            {1, 1, 0, -1},
            {-1, -1, -1, -1}
        };
        
        System.out.println("Number of negative numbers: " + solution.countNegatives(grid));
    }
}

