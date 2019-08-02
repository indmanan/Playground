#include<stdio.h>
int main()
{
  int no;
  int oct[15],i;
  scanf("%d",&no);
  while(no!=0)
  {
    oct[i]=no%8;
    no=no/8;
    i++;
  }
  int j;
  for(j=i;j>=0;j--)
  {
    printf("%d",oct[j]);
  }
  
  return 0;
}