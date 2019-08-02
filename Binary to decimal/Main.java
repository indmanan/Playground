#include<stdio.h>
int main()
{
  int bin,dec=0,i=0,rem;
  scanf("%d",&bin);
  while(bin!=0)
  {
    rem=bin%10;
    dec= dec + rem*pow(2,i);
    i++;
    bin=bin/10;
  }
  printf("%d",dec);
  
  return 0;
}