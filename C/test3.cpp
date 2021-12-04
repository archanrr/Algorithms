#include<bits/stdc++.h>
using namespace std;

char* integer2String(int a){
	int temp = a;
	int count=0;
	while(temp != 0){
		count++;		
		temp = temp/10;
	}
	temp = a;
	char* character= (char*) malloc(count*sizeof(char *));
	int i=0;
	while(temp != 0){
		character[count-i-1] = '0'+ temp%10;
		i++;
		temp = temp/10;
	}
	return character;
}
int str2int(char* a){
	int n = strlen(a);
	int temp = 0;
	for(int i=0;i<n;i++){
		cout<<"a[n-i-1]"<<a[n-i-1]<<"       "<<pow(10,i)*a[n-i-1]<<endl;
		temp = temp + pow(10,i)*a[n-i-1];
	}
	return temp;	
}
int main()
{
	int a = 123;
	char * str=integer2String(a);
	int a1 = str2int(str);
	cout<<"integer to str"<<str;
	cout<<"String to integer"<<a1;
}
