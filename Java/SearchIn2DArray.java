public class SearchIn2DArray {

    static boolean search(int[][] arr, int target){
        int rows = arr.length;
        int cols = arr[0].length;

        int row = 0;
        int col = cols - 1;

        while(row<rows && col>=0){
            if(arr[row][col] == target){
                return true;
            }
            if(arr[row][col] < target){
                row++;
            }else{
                col--;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        
        int target = 17;
        
        boolean found = search(matrix, target);
        System.out.println("Target found: " + found);
    }
}