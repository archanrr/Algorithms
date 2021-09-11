#include<stdio.h>
#include<bits/stdc++.h>
using namespace std;
int checkPalindrome(int);

int main() {

    int n, sum;

    printf("Enter a number : ");
    scanf("%d",&n);

    sum = checkPalindrome(n);

    if(n == sum)
         printf("%d is a palindrome", n);
    else
         printf("%d is not a palindrome", n);

    return 0;
}

int checkPalindrome(int n) {

    static int sum=0, r;
    cout<<"Sum"<<sum<<endl;
    if(n != 0)
    {
         r = n % 10;
         sum = sum * 10 + r;
         checkPalindrome(n/10);
    }
    return sum;
}
