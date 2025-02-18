/*
Time Complexity: O(rows*cols)
Space Complexity: O(rows*cols)
Run on leetcode: yes
Any difficulties: no

Approach:
1. Dynamic programming solution, as we know the robot can move right and down on the given grid and every step counts to 1
2. Attached the media with the repo to make solution more understandable
 */
public class UniquePaths {
    public static int uniquePaths(int rows, int cols){
        int [][] dp = new int[rows][cols];

        // initializing first row and first column by one, that is initial state of the DP
        // Initializing row
        for(int i = 0; i<rows; i++){
            dp[i][0] = 1;
        }
        // initialization col

        for(int j = 0; j<cols; j++){
            dp[0][j] = 1;
        }

        // now let's try to reach at the bottom corner of the matrix using down and right movement

        for(int i = 1; i<rows; i++){
            for(int j = 1; j<cols; j++){
                dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
        }

        return dp[rows-1][cols-1];
    }

    public static void main(String[] args){
        System.out.println(uniquePaths(3,7));
    }
}
