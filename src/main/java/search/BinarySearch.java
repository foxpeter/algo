package search;

public class BinarySearch {
    //二分查找
    public static int binarySearch(int arr[], int len, int key)
    {
        int left = 0;
        int right = len - 1;
        int mid;

        while (left <= right) {
            mid = (left + right) / 2;
            if (key < arr[mid]) {//key在左边
                right = mid - 1;
            } else if (arr[mid] < key) {//key在右边
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
