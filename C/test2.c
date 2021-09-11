#include<stdio.h>
#include<string.h>
#include<conio.h>
#include<stdlib.h>

// function should add a '\n' to str and return the new str back.
char* AddNewLineCharToStr(char *s) {
  char* buffer = (char *) malloc(1024*sizeof(char));
  strcpy(buffer,s);
  buffer[strlen(s)] = '\n';
  buffer[strlen(s)+1] =  
  return buffer;
}
int main(){
char s[10] ="archan";

//printf("%s",AddNewLineCharToStr(s));
//char* s1 = AddNewLineCharToStr(s);
printf("%s",AddNewLineCharToStr(s));
return 0;
}
