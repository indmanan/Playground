#include<stdio.h>
int main()
{
  int a,d,ts1,ts2,n_term,n;
  scanf("%d",&n);
  if(n%2==1)
  {
    a=0;
    d=2;
    ts1=(n+1)/2;
    n_term= a+(ts1-1)*d;
    printf("%d",n_term);
  }
  else
  {
    a=0;
    d=1;
    ts2=n/2;
    n_term= a+(ts2-1)*d;
    printf("%d",n_term);
    
  }
  
	
	return 0;
}