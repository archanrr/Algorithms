#include<stdio.h>
#include<string.h>

// function should add a '\n' to str and return the new str back.
char* AddNewLineCharToStr(char *s) {
  char buffer[1024];
  strcpy(buffer,s);
  buffer[strlen(s)] = '\n';
  //buffer[strlen(s+1)] = '\0';
  int i;
  for(i=0;i<=strlen(s);i++) printf("%c",buffer[i]);
  return buffer;
}
void main(){
char* s = "archan";

//printf("%s",AddNewLineCharToStr(s));
char* s1 = AddNewLineCharToStr(s);
}
