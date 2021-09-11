#include <stdio.h>
struct test {
    signed int x : 2;
    unsigned int y : 2;
    unsigned int z : 2;
};
int main()
{
    struct test t;
    t.x = 3;
    printf("%d", t.x);
    return 0;
}
