package a1;

/* Do not remove any code that is here.
 You may add new code if you wish to
 new data fields or helper methods. 
 Also note that this skeleton will not compile as is,
 since the methods that return things do not contain
 return statements... so you need to add them.
*/

public class Summer {
   private int[] nums;
   int count;
   // Any other data fields you decide you need can go here.

   public Summer(int n) {
      /* In this constructor, first allocate an array that hold n ints and put that in nums.
      Hint: If you add an extra field to store the index of the next open slot in the array,
      you would need to do something with that field here.
      */
      /*Your code here */
      nums = new int[n];
      count = 0;
   }

   public void add( int num ) {
     // In this method, take the parameter num and put that value into the Summer.
      /*Your code here */
      nums[count] = num;
      count++;
   }

   public int sum ( ) {
     /* In this method, go through the array and add up all the ints
      that have been stored in it so far.
      Note that the sum of ints is of type int, so return the int sum you get.  */
      /*Your code here*/
      int sumvals = 0;
      for(int i = 0; i < count; i++){
         sumvals += nums[i];
      }
      return sumvals;
   }
   
   public int high ( ) { 
     /* Find the largest number stored in the array so far
      and return it. */
      int highval = Integer.MIN_VALUE;
      for(int i = 0; i < count; i++){
         if(nums[i] >= highval){
            highval = nums[i];
         }
      }
      return highval;
   }
   
   public int low ( ) { 
     /* Find the smallest number stored in the array so far
      and return it. */
      int lowval = 0;
      for(int i = 0; i < count; i++){
         for(int j = i + 1; j < count; j++){
            if(nums[i] > nums[j]){
               lowval = nums[i];
               nums[i] = nums[j];
               nums[j] = lowval;
            }
         }

      }
      return nums[0];
   }
   
   public double average( ) {
     /* Find the average of all the numbers stored in the array
      so far, and return it.
      Note that the average of ints might produce a double, so
      we are returning a double.

      HEADS UP
      This method might get called before there are any 
      ints stored in the array, so you need to guard
      against divide by zero.
      We will simply define the `average of no numbers
      to be 0.0 so return that if the array has no numbers in it.
       */
      double average_val = 0.0;
      if(count == 0){
         return 0.0;
      }
      else{
         double sum = 0.0;
         for(int i = 0; i < count; i++){
            sum += nums[i];
         }
         average_val = sum/count;
         return average_val;
      }

      /*Your code here */

   }
   
   public double avgOver( int thresh ) {

   /* Similar to average() except we want to only average up
      stored numbers that are ABOVE ( > ) the threshold
      parameter "thresh".
      
      Hint: Look at examples 1 and 2 in the readme make sure you 
      understand how to calculate avgOver.
     
      HEADS UP
      We have the same divide by zero issue here as in average()
      so again if you are trying to take an average on no numbers
      simply return 0.0
   */
      double average_val_over = 0.0;
      if(count == 0){
         return 0.0;
      }
      else{
         double sum = 0.0;
         int above_vals = 0;
         int no_val = 0;
         for(int i = 0; i < count; i++){
            if(nums[i] > thresh){
               sum += nums[i];
               above_vals += 1;
            }
         average_val_over = sum/above_vals;
         }
         if(sum == 0){
            return no_val;
         }
      }
      return average_val_over;
      /*Your code here */
   }
   
   public int count ( ) {  
     //Return the number of ints thLat have been stored in the array.
      return count;
     /*Your code here */

   }
}
