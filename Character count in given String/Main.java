#include<stdio.h>
int main()
{
	char str[50];
  gets(str);
  if(strlen(str)>20)
  {
    printf("Invalid Input");
    exit(1);
  }
  int i=0,count=1;
 while(str[i]!='\0')
 {
   if(str[i]==str[i+1])
   {
     count++;
   }
   else
   {
     printf("%c%d",str[i],count);
     count=1;
   }
   i++;
     
 }
}