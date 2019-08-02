#include<stdio.h>
#include<stdlib.h>
int main()
{
  char c1[50],c2[50],c3[50];
scanf("%s%s%s",&c1,&c2,&c3);
  int i;
 for(i=0;c1[i]!='\0';i++)
  {
    if(c1[i]=='A' || c1[i]=='E' || c1[i]=='I' || c1[i]=='O' || c1[i]=='U' || c1[i]=='a' || c1[i]=='e' || c1[i]=='i' || c1[i]=='o' || c1[i]=='u')
    {
      c1[i]='$';
    }
  }
  
for(i=0;c2[i]!='\0';i++)
  {
      if((c2[i]=='A' || c2[i]=='E' || c2[i]=='I' || c2[i]=='O' || c2[i]=='U' || c2[i]=='a' || c2[i]=='e' || c2[i]=='i' || c2[i]=='o' || c2[i]=='u'))
    {
       
      }
  else
  {
    c2[i]='#'; 
  }
  }
for(i=0;c3[i]!='\0';i++)
  {
    if(c3[i]>='a' && c3[i]<='z')
    {
      c3[i]=c3[i]-32;
    }
  }
  printf("%s%s%s",c1,c2,c3);
}