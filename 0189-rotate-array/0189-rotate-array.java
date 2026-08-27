//[1 2 3 4 5 6 7]->[7 1 2 3 4 5 6 ]->[6 7 1 2 3 4 5]->[5 6 7 1 2 3 4]
//k=3
//[1 2 3 4]
//.s
//.      e
//temp=1

class Solution {
    public void rev(int[] nums, int start, int end) {
        while (start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;

        k = k % n;   // important

        if (k == 0) {
            return;
        }

        rev(nums, 0, n - 1);
        rev(nums, 0, k - 1);
        rev(nums, k, n - 1);
    }
}