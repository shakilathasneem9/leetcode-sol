class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[] merged=new int[nums1.length+nums2.length];
        int i=0;
        int j=0;
        int k=0;
        while(i < n && j < m){
            if(nums1[i] <= nums2[j]){
                merged[k] = nums1[i];
                i++;
            }
            else{
            merged[k] = nums2[j];
            j++;
            }
            k++;
        }
        while(i<n){
            merged[k] = nums1[i];
            i++;
            k++;
        }
        while(j < m){
            merged[k] = nums2[j];
            j++;
            k++;
        }
        int total=n+m;
        int mid=total/2;
        if(total%2==1){
            return merged[mid];
        }
        else{
            return (merged[mid-1]+merged[mid])/2.0000;
        }
         
    }
}