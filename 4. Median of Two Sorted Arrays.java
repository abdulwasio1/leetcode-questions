class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int index = - 0;
        int nums3[] = new int[nums1.length + nums2.length];
        for(int a= 0; a<nums1.length ; a++){
            nums3[index++] = nums1[a];
    
        }
        for(int a= 0; a<nums2.length ; a++){
            nums3[index++] = nums2[a] ;
        }
        Arrays.sort(nums3);
        int n = nums3.length;
        if(nums3.length  %2 !=0){
            return (double)nums3[nums3.length/2];
        }else{
            return (nums3[n/2] + nums3[(n/2)-1]) / 2.0;
        }
    }
}
