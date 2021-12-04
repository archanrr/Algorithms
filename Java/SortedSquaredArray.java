
public class SortedSquaredArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sortedSquaredArray(new int[] {-16,-10,-4,-1,1,2,3,5,18});

	}
	public static void sortedSquaredArray(int[] arr) {
		int[] resultArr = new int[arr.length];
		for(int i=0;i<resultArr.length -1;i++) resultArr[i] = 0;
		for(int i=0,j=arr.length-1,k=arr.length-1;j>=i && k>=0;) {
			if(Math.abs(arr[i]) > arr[j]) {
				resultArr[k] = arr[i]*arr[i];
				i++;
				k--;
			}
			else {
				resultArr[k] = arr[j]*arr[j];
				j--;
				k--;
			}
		}
		for(int i=0;i<resultArr.length;i++)
			System.out.print(resultArr[i]+" ");
	}

}
