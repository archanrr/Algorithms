#include<stdio.h>
#include <conio.h>
#include <stdlib.h> 

int main()
{
int size = 4;

/* Stored in heap segment like other dynamically allocated things */
char *str = (char *) malloc(sizeof(char)*size);
*(str+0) = 'G';
*(str+1) = 'f';
*(str+2) = 'G';	
*(str+3) = '\0';
*(str+1) = 'n'; /* No problem: String is now GnG */
printf("output: %s%d%c",str,*str,*str);//,*(str+1),*(str+2));
//getchar();
return 0;
}	

