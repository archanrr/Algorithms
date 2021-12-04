package DynamicProgramming;

public class GridTraveller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 2;
		int n = 3;
		int memArr[][] = new int[m+1][n+1];
		for(int i=0;i<=m;i++)
			for(int j=0;j<=n;j++)
				memArr[i][j] = -1;
		System.out.print(gridTraveller(m,n,memArr));
		
	}
	public static int gridTraveller(int m,int n,int[][] memArr) {
		if(m==0 || n==0) return 0;
		else if(m==1 && n==1) return 1;
		if(memArr[m][n] != -1) return memArr[m][n];
		memArr[m][n] = gridTraveller(m-1,n,memArr) + gridTraveller(m,n-1,memArr);
		return memArr[m][n];
	}

}
