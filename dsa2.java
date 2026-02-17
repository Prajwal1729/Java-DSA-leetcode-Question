public class dsa2 {

    public static void bubbleSort(int nums[]){
        int n = nums.length - 1;
        int temp;

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                if(nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }

        }
        
    }

    public static void selectionSort(int nums[]){
        int n = nums.length - 1;
        int temp;
        int minIdx = -1;

        for(int i = 0;i<n;i++){
            minIdx = i;
           for(int j = i+1;j<n;j++){
              if(nums[minIdx] > nums[j]){
                 minIdx = j;
              }
           }

           temp = nums[minIdx];
           nums[minIdx] = nums[i];
           nums[i] = temp;
        }

    }

    public static void insertionSort(int nums[]){
        int n = nums.length - 1;

        for(int i = 1;i<n;i++){
            int key = nums[i];
            int j = i - 1;
            while(nums[j] > key && j>=0){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1] = key;
        }

    }

    private static int partition(int[] nums, int low, int high) {


       int pi = nums[high];
       int i = low - 1;

        for(int j = low;j<high;j++){
            if(nums[j] < pi){
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

            int temp = nums[i+1];
            nums[i+1] = nums[high];
            nums[high] = temp;

            return i+1;


    }

    public static void quickSort(int nums[],int low,int high){
        // int n = nums.length - 1; 

        if(low < high){
            int pi = partition(nums,low, high);
            quickSort(nums, low, pi-1);
            quickSort(nums, pi+1, high);
        }

    }

     private static void merge(int[] nums, int l, int mid, int r) {

        int n1 = mid - l+1;
        int n2 = r - mid;

        int larr[] = new int[n1];
        int rarr[] = new int[n2];

        for(int i = 0;i<n1;i++){
            larr[i] = nums[l+i];
        }

        for(int j = 0;j<n2;j++){
            rarr[j] = nums[mid+j+1];
        }

        int i =0;
        int j = 0;
        int k = l;
    
        while(i<n1 && j<n2){
            if(larr[i] <= rarr[j]){
                nums[k] = larr[i];
                i++;
            }
            else{
                nums[k] = rarr[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            nums[k] = larr[i];
            i++;
            k++;
        }

        while(j<n2){
            nums[k] = rarr[j];
            j++;
            k++;
        }

        
    }

    public static void mergeSort(int nums[],int l,int r){
        
        if(l < r){
          int mid = (l + r)/2;
          mergeSort(nums, l, mid);
          mergeSort(nums, mid+1, r);
          merge(nums,l,mid,r);
        }
    }
    

   

    public static void main(String[] args) {
        // Sorting //

        int nums[] = {8,6,9,2,4,5};
        bubbleSort(nums);
        for(int num: nums){
           System.out.print(num+" ");
        }

        System.out.println();
        System.out.println("Sorting according to selection sort.");
        selectionSort(nums);
        for(int num: nums){
            System.out.print(num+" ");
        }

        System.out.println();
        System.out.println("Sorting according to insertion sort.");
        insertionSort(nums);
        for(int num: nums){
            System.out.print(num+" ");
        }

        System.out.println();
        int low = 0;
        int high = nums.length - 1;
        quickSort(nums,low,high);
        System.out.println("Sorting according to quick sort.");
        for(int num: nums){
            System.out.print(num+" ");
        }

        System.out.println();
        int l = 0;
        int r = nums.length - 1;
        mergeSort(nums,l,r);
        System.out.println("Sorting according to merge sort.");
        for(int num:nums){
            System.out.print(num+" ");
        }

      
    }
    
}
