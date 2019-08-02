#include<stdio.h>
int main()
{
  	int size,i;;
  scanf("%d",&size);
  int arr[size];
  for(i=0;i<size;i++)
  {
    scanf("%d",&arr[i]);
  }
  int ser1,ser2,c1=0,c2=0;
  scanf("%d\t%d",&ser1,&ser2);
  for(i=0;i<size;i++)
  {
    if(ser1==arr[i])
    {
      c1++;
      break;
    }
  }
  if(c1==0)
  {
    printf("Element 1 index = -1\n");
  }
  else
  {
   	printf("Element 1 index = %d\n",i);
  }
 
  for(i=0;i<size;i++)
  {
    if(ser2==arr[i])
    {
      c2++;
      break;
    }
  }
  if(c2==0)
  {
    printf("Element 2 index = -1\n");
  }
  else
  {
   	printf("Element 2 index = %d\n",i);
  }
  
    
  return 0;
}