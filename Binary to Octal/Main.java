#include<stdio.h>
#include<math.h>
int main()
{
  int binary,decimal=0;
  scanf("%d",&binary);
  int i=0;
  while(binary!=0)
  {
   	decimal=decimal+(binary%10)*pow(2,i);
    ++i;
    binary=binary/10;
  }
  int oct[10];
  i=0;
  while(decimal!=0)
  {
   oct[i]=decimal%8;
    ++i;
    decimal=decimal/8;
  }
  int j;
  for(j=i-1;j>=0;j--)
  {
    printf("%d",oct[j]);
}
}