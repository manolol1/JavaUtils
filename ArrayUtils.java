package JavaUtils;

public class ArrayUtils {
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
   
   // return total sum of an array
   public static int getSum(int[] ar) {
      int sum = 0;
      
      for (int n : ar) {
         sum += n;
      }
      
      return sum;
   }
}