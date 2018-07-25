# count-1s-sorted-binary-array

  ## i = 0 from the parent method and j is the last index of the array
    ```
      // i = 0 from the parent method and j is the last index of the array

      private static int count1s(int[] arr, int i, int j) {
        if (j >= i) {
          int mid = i + (j - i) / 2;

          if (arr[mid] == 1 && (mid == j || arr[mid + 1] == 0)) {
            return mid + 1;
          }
          if (arr[mid] == 0) {
            return count1s(arr, i, mid - 1);
          }
          return count1s(arr, mid + 1, j);
        }
        return -1;
      }

    ```
