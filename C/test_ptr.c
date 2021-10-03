#include<stdio.h>

int add(int *a, int *b){
	printf("%d-%d",*a,*b);
	return (*a + *b);
}

void main(){
	int x = 6;
	int * a = &x;
	int y=9;
	int *b = (int*) &y;
	int x1 = add(3,5);
	printf("\n%d",x1);
}
