#include<stdio.h>
void main()
{
  int base,exp,power=1;
  scanf("%d%d",&base,&exp);
  if(exp<0)
  {
    printf("Wrong input");
           exit(1);
  }
  else
  {
   	while(exp!=0)
    {
     	power=power*base; 
      	exp--;
    }
    printf("%d",power);
  }
}