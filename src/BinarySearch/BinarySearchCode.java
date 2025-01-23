package BinarySearch;

public class BinarySearchCode
{
    public static int binarySearch(int arr[], int n, int target)
    {
        int low = 0;
        int high = n-1;

        while (low <= high)
        {
            int mid = (low + high)/2;

            if(target == arr[mid]) return mid+1;
            else if (target >= arr[mid]) low = mid+1;
            else high = mid-1;
        }

        return -1;
    }

    public static int recSearch(int arr[], int low, int high, int target)
    {
    //  base case
        if (low > high)
        {
            return -1;
        }

        int mid = (low + high)/2;

        if(arr[mid] == target)
        {
            return mid+1;
        } else if (arr[mid] > target) {
            return recSearch(arr,low,mid-1,target);
        }
        else
        {
            return recSearch(arr,mid+1,high,target);
        }

    }

    public static void main(String[] args)
    {
        int arr[] = {1,3,5,7,9,10,15,67,89};
        int target = 67;
        System.out.println(binarySearch(arr,arr.length,target));

        System.out.println(recSearch(arr,0,arr.length-1,target));
    }
}
