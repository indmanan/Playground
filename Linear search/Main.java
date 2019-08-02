#include<stdio.h>
int main()
{
  int size;
  scanf("%d",&size);
  int arr[size];
  int i;
  for(i=0;i<size;i++)
  {
    scanf("%d",&arr[i]);
  }
  int ser;
  int count=0;
  scanf("%d",&ser);
  for(i=0;i<size;i++)
  {
   if(ser==arr[i])
   {
     count++;
     printf("%d",i+1);
   }
  }
  if(count==0)
    printf("%d isn't present in the array.",ser);
  
  
  
  return 0;
}