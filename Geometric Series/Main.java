#include<stdio.h>
#include<math.h>
int main()
{
  int n;
  int t_even,t_odd,term;
  scanf("%d",&n);
  if(n%2==0)
  {
    t_even=n/2;
    term=pow(3,t_even-1);
    printf("%d",term);
  }
     else
     {
       t_odd=(n+1)/2;
       term=pow(2,t_odd-1);
       printf("%d",term);
     }  
  return 0;
}