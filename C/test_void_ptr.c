#include<stdio.h>
void main()
{
    int a = 10;
    void ptr = &a;
    printf("%d", *(int *)ptr);
    return 0;
}
