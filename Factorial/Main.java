#include<stdio.h>
int main()
{
 long int no,fact=1,i;
  scanf("%ld",&no);
  for(i=no;i>0;i--)
  {
    fact=fact*i;
  }
  printf("%ld",fact);
}