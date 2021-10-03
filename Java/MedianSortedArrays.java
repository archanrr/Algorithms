class XX {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length_nums1 = nums1.length;
        int length_nums2 = nums1.length;
        int reslength = (int) Math.ceil((nums1.length + nums2.length)/2) + 1;
        int count = 0;
        if(reslength%2==0) {
            count = 1;
        }
        int[] result = new int[reslength/2];
        int i,j,k;
        for(i=0,j=0,k=0;i<length_nums1 && j<length_nums2 && k<reslength;){
            //if(k==((reslength/2)-1)) break;
            if(nums1[i]<nums2[j]){
                result[k]=nums1[i];
                i++;
                k++;
            } else {
                result[i]=nums2[j];
                j++;
                k++;
            }
        }
        while(i<length_nums1){
            //if(k==((reslength/2)+1)) break;
            result[k]=nums1[i];
            i++;
            k++;
        }
        while(j<length_nums2){
            //if(k==((reslength/2)+1)) break;
            result[k]=nums2[j];
            j++;
            k++;
        }
        System.out.println("k"+k+"i"+i+"j"+j);
        for(int ik=0;ik<result.length;ik++) {
        	System.out.print(" "+result[ik]);
        }
        if(reslength%2==0) {
            return result[k] + result[k -1];
        } else return result[k-1];
    }
}
public class MedianSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XX s = new XX();
		int[] a1 = new int[]{1,2};
		int[] a2 =new int[]{3,4};
		System.out.println("            result "+s.findMedianSortedArrays(a1, a2));

	}

}
