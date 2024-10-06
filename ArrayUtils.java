package JavaUtils;

public class ArrayUtils {
   /** 
      return a new integer array, filled with random numbers 
      @param lb lowerBound (inclusive)
      @param ub upperBound (inclusive)
   */
   public static int[] randomArray(int length, int lb, int ub) {
      int[] ar = new int[length];
      
      for (int i = 0; i < ar.length; i++) {
         ar[i] = JavaUtils.random(lb, ub);
      }
      
      return ar;
   }
   
   /** print an array, with the values seperated by a delimiter */
   public static void printArray(int[] ar, String delimiter) {
      System.out.println(toString(ar, delimiter));
   }
   
   /** print an array, with the values seperated by a space */
   public static void printArray(int[] ar) {
      System.out.println(toString(ar));
   }
   
   /** format an array as a String, with the values seperated by a space */
   public static String toString(int[] ar) {
      return toString(ar, " ");
   }
   
   /** format an array as a String, with the values seperated by a delimiter */
   public static String toString(int[] ar, String delimiter) {
      StringBuilder sb = new StringBuilder(ar.length + ar.length * delimiter.length());
      
      sb.append(ar[0]);
      
      for (int i = 1; i < ar.length; i++) {
         sb.append(delimiter).append(ar[i]);
      }
      
      return sb.toString();
   }
   
   /** Sort and Array in ascending order */
   public static void sort(int[] ar) {
      selectionSort(ar);
   }
   
   /** Sort an Array in ascending order using SelectionSort */
   public static void selectionSort(int[] ar) {
      int minIndex, temp;
      
      for (int i = 0; i < ar.length - 1; i++) {
         minIndex = i;
         
         // find minIndex
         for (int j = i + 1; j < ar.length; j++) {
            if (ar[j] < ar[minIndex]) {
               minIndex = j;
            }
         }
         
         // swap
         temp = ar[i];
         ar[i] = ar[minIndex];
         ar[minIndex] = temp;
      }
   }
   
   /** return total sum of an array */
   public static int getSum(int[] ar) {
      int sum = 0;
      
      for (int n : ar) {
         sum += n;
      }
      
      return sum;
   }
}