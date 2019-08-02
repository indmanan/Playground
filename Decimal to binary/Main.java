#include<stdio.h>
int main()
{
  int dec,i=0;
  int b[15];
scanf("%d",&dec);
  
  while(dec!=0)
  {
   	b[i]=dec%2;
 	i++;
   	dec=dec/2;
  }
  int j;
  for(j=i-1;j>=0;j--)
  {
   printf("%d",b[j]); 
  }
  return 0;
}