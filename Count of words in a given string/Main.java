#include<stdio.h>

int main()
{
 int words=0;
  char str[100];
  gets(str);
  int i=0;
  while(str[i]!='\0')
  {
    if(str[i]==' ')
    {
      words++;
    }
    i++;
  }
  printf("%d",words+1);
  
}