// Syntax of Array
// datatype[] variable_name = new datatype[size] 
// 1. datatype[] , is represents what is the type of data stored inside the array.
// 2. All the type of the data in the array should be the same.
// 
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class Array_Basic{

    // public static void main(String[] args) {
    //     int[] nums = {3,4,8,1,2};
    //     System.out.println(Arrays.toString(nums));
    //     change(nums);
    //     System.out.println(Arrays.toString(nums));

    // }
    // static void change(int[] arr){
    //     arr[0] = 99;
    // }

    // public static void main(String[] args) {
        // int[][] arr = new int[3][3];
        // System.out.println(arr.length);
        // Scanner in = new Scanner(System.in);

        // // Input
        // for(int row = 0; row<arr.length; row++){
        //     for(int col=0; col < arr[row].length; col++){
        //         arr[row][col] = in.nextInt();
        //     }
        // }
// Output Method 1
    //     for(int row = 0; row<arr.length; row++){
    //         for(int col=0; col < arr[row].length; col++){
    //             System.out.print(arr[row][col]+" ");
    //         }
    //         System.out.println();
    
// Output Method 2
    //  for(int row = 0; row<arr.length; row++){
    //      System.out.println(Arrays.toString(arr[row]));
    
// // Output Method 3    
//     for(int[] a : arr){
//             System.out.println(Arrays.toString(a));
//         }
//  }

// ArrayList Syntax
    // ArrayList<Integer> list = new ArrayList<>(10);

    // list.add(45);
    // list.add(79);
    // list.add(23);
    // list.add(5);
    // list.add(923);
    // list.add(67);
    // System.out.println(list.contains(5));
    // list.set(0, 222);
    // list.remove(2); 

    // Input
    // for( int i=0; i<5; i++){
    //     list.add(in.nextInt());
    // }

    // // get item at any index
    // for(int i=0; i<5; i++){
    //     System.out.println(list.get(i));
    // }
    // System.out.println(list);
    
    // ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    
    // Initialisation
//     for ( int i =0; i<3; i++){
//         list.add(new ArrayList<>());
//     }
//    // add Element
//     for( int i=0; i<3; i++){
//         for(int j=0; j<3; j++){
//             list.get(i).add(in.nextInt());
//         }
//     }
// System.out.println(list);    
// }
    //Q1 Swapping Values in Array
    // public static void main(String[] args) {
    //     int[] arr ={4,5,8,9,6,3}; 
    //     swap(arr, 1, 3);
    //     System.out.println(Arrays.toString(arr));

    // }
    // static void swap(int[] arr, int start, int end){
    //     int temp = arr[start];
    //     arr[start] = arr[end];
    //     arr[end] = temp;
    // }

    //Q2Maximum value of an array
    // public static void main(String[] args) {
    //     int[] arr = {1,5,4,9,2};
    //     System.out.println(max(arr));
    // }
    // static int max(int[] arr){
    //     int maxval = arr[0];
    //     for( int i=0; i<arr.length; i++){
    //         if(arr[i] > maxval){
    //             maxval = arr[i];
    //         }
    //      } 
    //     return maxval;
    // }
    //Q3 Reversing of an Array
    // public static void main(String[] args) {
    //         int[] arr = {1,2,3,4,5};
    //         reverse(arr);
    //         System.out.println(Arrays.toString(arr));
    //     }
    //     static void reverse(int[] arr) {
    //         int start =0;
    //         int end = arr.length-1;

    //     while(start < end){
    //         swap(arr, start, end);
    //         start++;
    //         end--;
    //     }
    // }
    //     static void swap(int[] arr, int start, int end){
    //             int temp = arr[start];
    //             arr[start] = arr[end];
    //             arr[end] = temp;
            
    //     }
}