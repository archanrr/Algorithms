
public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {2,3,4,1,5};
		arr = mergeSort(arr,0,arr.length-1);
		/*for(int z=0;z<arr.length;z++) {
			System.out.print(" "+arr[z]+" ");
		}*/
	}
	public static int[] mergeSort(int[] a,int l,int h) {
		if(l<h) {
			int mid = l+ (h-l)/2;
			a = mergeSort(a,l,mid);
			a =  mergeSort(a,mid+1,h);
			a = merge(a,l,mid,h);
		}
		return a;
	}
	public static int[] merge(int[] a,int l,int mid,int h) {
		int[] arr1 = new int[mid - l];
		int[] arr2 = new int[h-mid];
		int[] newArr = new int[h-l];
		for(int z=0;z<a.length;z++) {
			//a[z] = newArr[z];
			System.out.print("-"+a[z]);
		}
		System.out.println("*--------------------------------*");
		for(int i=0;i<mid - l -1;i++) {
			arr1[i] = a[i];
		}

		for(int i=0;i<h-mid -1;i++) {
			arr2[i] = a[i];
		}
		//System.out.println("*--------------------------------");
		for(int z=0;z<a.length;z++) {
			//a[z] = newArr[z];
			if(z<(mid - l -1)) System.out.print("*"+arr1[z]);
			else if(z>(h-mid - 1)) System.out.print("-"+arr2[z]);
		}
		//Compare the 2 arrays and arranged them in sorted order
		int i=0,j=0,k=l;
		for(;i<mid - l && j<h-mid;) {
			if(arr1[i] <= arr2[j]) {
				newArr[k] = arr1[i];
				i++;
			} else {
				newArr[k] = arr2[j];
				j++;
			}
			k++;
		}
		// add remaining elements from arr1 to new array
		for(;i < mid - l; i++) {
			newArr[k] = arr1[i];
			k++;
		}
		// add remaining elements from arr2 to new array
		/*for(;j < h-mid; j++) {
			newArr[k] = arr2[j];
			k++;
		}*/
		// Copy the elements from tem array to input arr
		/*for(int z=0;z<newArr.length;z++) {
			a[z] = newArr[z];
			System.out.print("---"+a[z]);
		}*/
		return a;
	}
}
