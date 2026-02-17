public class dsa7 {

    public static int binarySearch(int arr[],int tar){
        int l=0, r = arr.length - 1;

        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid] == tar){
                return mid;
            }
            else if(arr[mid] < tar){
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }

        return -1;
    }

    // Merge Sort Algorithm Start //

    private static void merge(int arr[],int left,int mid,int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int larr[] = new int[n1];
        int rarr[] = new int[n2];

        for(int i = 0;i<n1;i++){
            larr[i] = arr[left+i];
        }

        for(int j = 0;j<n2;j++){
            rarr[j] = arr[mid+1+j];
        }

        int i =0,j=0,k=left;

        while(i<n1 && j<n2){
            if(larr[i] <=rarr[j]){
                arr[k++] = larr[i++];
            }
            else{
                arr[k++] = rarr[j++];
            }
        }

        while(i<n1){
            arr[k++] = larr[i++];
        }
        while(j<n2){
            arr[k++] = rarr[j++];
        }
    }

    public static void mergeSort(int arr[],int left,int right){
        if(left < right){
            int mid = (left+right)/2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            merge(arr,left,mid,right);
        }
    }

    // Merge Sort Algorithm End //

    public static int fibo(int n){
        if(n<=1){
            return n;
        }

        return fibo(n-1) + fibo(n-2);
    }

    public static void permute(String str,String ans){
        if(str.length() == 0){
            return;
        }

        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            String rest = str.substring(0,i) + str.substring(i+1);
            permute(rest, ans + ch);
        }
    }
    public static void main(String[] args) {
        int arr[] = {44,7,2,89,100};
        int tar = 89;
        int res = binarySearch(arr,tar);
        System.out.println("element found " + res + " "+ arr[res]);

        int left = 0;
        int right = arr.length - 1;

        mergeSort(arr, left, right);

        System.out.println("Sorted array: ");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }


    }
}
 