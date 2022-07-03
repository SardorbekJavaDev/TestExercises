public class Task_1 {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}
        };

        int[] location = getRobotLocation(matrix);
        if (location == null) {
            System.out.println("Robot location not found !");
            return;
        }
        System.out.println("Total steps count: " + calculateSteps(matrix, location[0], location[1]));
    }


    public static int[] getRobotLocation(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }


    public static int calculateSteps(int[][] matrix, int x, int y) {
        int center = matrix.length / 2;
        int a = Math.abs(center - x);
        int b = Math.abs(center - y);
        return a + b;
    }

}
