public class Sort {
    public static int[] bubbleSort(int[] nums) {
        int n = nums.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    // swap nums[i] and nums[i+1]
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
        return nums;
    }

    public static int[] insertionSort(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; ++i) {
            int key = nums[i];
            int j = i - 1;

            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j = j - 1;
            }
            nums[j + 1] = key;
        }
        return nums;
    }
}
