

public class MinMax {
  
  public static void main(String[] args) { 
 
    
    int [] nums = {32,21,56,89,76,57,101};
    int currMax = nums[0];
    int currMin = nums[0];
    
    for(int i = 1; i < nums.length; i++){
      if(nums[i]>currMax){
        currMax= nums[i];
       }
      if(nums[i]<currMin){
        currMin = nums[i];
       }
    }
    System.out.println("Maximum: " + currMax);
    System.out.println("Minimum: " + currMin);
  }
      
}

