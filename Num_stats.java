public class Num_stats {
     //method that returns maximum number of the array
     public static int findMax(int arr[]){  
        int max=arr[0];  
        for(int i=1;i<arr.length;i++){  
            if(max<arr[i])  
                max=arr[i];  
        }  
        return max;  
    }  
    //This is a test comment to show changes!
    //method that returns cube of the given number  
    public static int cube(int n){  
        return n*n*n;  
    } 
}


