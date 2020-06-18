#include<iostream>
using namespace std;
int main()
{
  int m,n,req;
  cin>>m>>n>>req;
  if(m*n>=(req-1) || m*n==(req-2))
  {
    cout<<"Doctor, you can proceed with your experiment.";
  }
  else 
  {
    cout<<"Sorry Doctor! You need more bacteria.";
  }
}
    