#include <stdio.h>
int main() {
	char ch;
  	scanf("%c",&ch);
  	if(ch>=65 && ch<='Z')
      printf("%c",ch+32);
  	if(ch>='a' && ch<='z')
      printf("%c",ch-32);
	return 0;
}