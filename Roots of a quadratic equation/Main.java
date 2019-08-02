#include<stdio.h>
#include<math.h>
int main()
{
	int a,b,c;
  scanf("%d%d%d",&a,&b,&c);
  float r1,r2,d;
  d=(b*b)-(4*a*c);
  if(d>=0)
  {
    if(d>0)
    {
    d=sqrt((b*b)-(4*a*c));
   r1=(float)(-b+d)/(2*a);
    r2=(float)(-b-d)/(2*a);
    printf("root1 = %.2f  root2 = %.2f",r1,r2);
    }
    else
    {
      d=0;
    r1=r2=(float)(-b)/(2*a);
    printf("root1 = %.2f  root2 = %.2f",r1,r2);
    }
  }
  else
  {
    d=sqrt(-d);
   float real=(float)(-b)/(2*a);
    float imag=(float)d/(2*a);
    printf("root1 = %.2f + %.2fi  root2 = %.2f - %.2fi",real,imag,real,imag);
  }
  return 0;
}
