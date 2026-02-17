public class dsa1 {

    public static int LinearSearch(int nums[],int tar){
        int n = nums.length;
        
        for(int i = 0;i<n;i++){
            if(nums[i] == tar){
                return i;

            }
        }
        return -1;
    }

    public static int binarySearch(int nums[],int tar){
        int left = 0;
        int right = nums.length - 1;

        while(left<=right){
            int mid = (left + right) / 2;
            if(nums[mid] <= tar){
                left = mid+1;
                return left;
            }
           else if(nums[mid] >= tar){
             right = mid-1;
             return right;
           }
           else{
            return mid;
           }
            
        }
        return -1;
    }

    public static void main(String[] args) {
        
        int nums[] = {5,7,9,12,17};
        int tar = 12;
        int res = LinearSearch(nums,tar);
       
        if(res!=-1){
            System.out.println("Element found at index: "+ res);
        }
        else{
            System.out.println("Element not found");
        }

        int res1 = binarySearch(nums, tar);

        if(res1!=-1){
            System.out.println("Element by binary search found at index: "+ res1);

        }
        else{
            System.out.println("element not found.");
        }
    }
    
}
