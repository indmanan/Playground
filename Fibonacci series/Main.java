#include<stdio.h>
int main()
{
  int no;
  int a=0,i,b=1,next=0;
  scanf("%d",&no);
  for(i=0;i<no;i++)
  {
   printf("%d ",next);
    a=b;
    b=next;
    next=a+b;
  }
  return 0;
}