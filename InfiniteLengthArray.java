import java.util.*;

public class InfiniteLengthArray {

    public static int BinarySearch(int[] arr, int target, int start, int end){

        int low = start;
        int high = end;
        int mid;

        while(high >= low){
            mid = low + (high - low)/2;

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }

    public static int getRange(int[] arr, int target){
        int start = 0;
        int end = 1;

        while( target > arr[end]){
            int temp = end + 1;

            if(2*end < arr.length-1)
               end = 2*end;            
            else
               end = arr.length-1;

            start = temp;
        }

        return BinarySearch(arr, target, start, end);
    }

    public static void main(String[] args) {
                        //    0  1  2  3  4   5   6    7    8    9    10   11   12   13   14    15   16  17
        int[] arr = new int[]{3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170, 210, 211, 256, 315, 500, 514, 789};
        int target = 500;

        System.out.println(getRange(arr, target));
    }
}