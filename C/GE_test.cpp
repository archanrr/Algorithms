#include<bits/stdc++.h>
using namespace std;
int* findPrime(int n){
	int* arr = (int *) malloc((n+1)*sizeof(int *));
	//list <int> lis1;
	for(int i=0;i<=n;i++) arr[i]=1;
	
	for(int i=2;i*i<=n;i++){
		if(arr[i] == 1){
			for(int j=i*i;j<=n;j+=i){
				arr[j]=0;
			}
			//lis1.push_back(i);
		}
	}
	//for(int i=2;i<=n;i++) if(arr[i]==1)cout<<i<<"\t";
	//list <int> :: iterator it;
	//for(it = lis1.begin();it!=lis1.end();++it){
	//	cout<<*it<<"\t";
	//}
	return arr;
}
int main(){
	int n;
	cin>>n;
	int *prime = findPrime(n);
	for(int i=2;i<=n;i++){
		if(*(prime+i) == 1) printf("%d\t",i);
	} 
	//printf("%d",*(prime+i));
	return 1;
}

