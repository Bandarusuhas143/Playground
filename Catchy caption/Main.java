#include <cstring>
#include <iostream>
using namespace std;
int main()
{
char str[100];
  int count=0;
  cin.getline(str,100);
  int len=strlen(str);
 for(int i=0;i<len;i++)
 {
   if(str[i]==' ')
   {
     count++;
   }
 }
  if(count<=10)
  {
    cout<<"Caption eligible for the contest";
  }
  else
  {
    cout<<"Caption not eligible for the contest";
  }
  return 0;
}