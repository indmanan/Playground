#include<stdio.h>
#include<stdlib.h>
int main()
{
  char str[100];
  gets(str);
  int i=0,count=0;
while(str[i]!='\0')
{
  count++;
  i++;
}
  printf("%d",count);
  return 0;
}