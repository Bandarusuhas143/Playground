#include<iostream>
#include<stdio.h>
#include<string.h>
using namespace std;
int main()
{
  char str[50];
  int n;
    gets(str);
  n=strlen(str);
  cout<<"The number of letters in the name is "<<n<<"\n";
  return 0;
}