#include<stdio.h>
#include<string.h>
#include<conio.h>
#include<stdlib.h>

// function should add a '\n' to str and return the new str back.
char* AddNewLineCharToStr(char *s) {
  char* buffer = (char*) malloc(100*sizeof(char));
  strcpy(buffer,s);
  //buffer[strlen(s)-4] = 'b';
  buffer[strlen(s)] = 'x';
  buffer[strlen(s)+1] = 'y';
  buffer[strlen(s)+2] = 'w';
  buffer[strlen(s)+3] = 'x';
  //buffer[strlen(s)+5] = 't';
  int i;
  //for(i=0;i<=strlen(s);i++) printf("%c",buffer[i]);
  //printf("%d",buffer);
  return buffer;
}
int main(){
char* s = "archan";

//printf("%s",AddNewLineCharToStr(s));
int a = 5;
printf("%d",strlen(s));
char* s1 = AddNewLineCharToStr(s);
//printf("----------->%d-%d",*s1,s1);
printf("\n archan --> %s",s1);
printf("\n%d",strlen(s1));
//for(int i=0;i<=strlen(s)+1;i++) printf("\n --->%d-%c",s1+i,*(s1+i));
return 0;
}
