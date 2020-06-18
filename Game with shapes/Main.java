#include<iostream>
using namespace std;
int main()
{
  float r,x,d;
  cin>>r>>x;
  d=2*r;
  if(d==x)
    cout<<"circle can be inside a square";
  else 
    cout<<"circle cannot be inside a square";
}