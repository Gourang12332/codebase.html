#include<stdio.h>
#include<string.h>
int main(){
char str[100];
fgets(str ,100,stdin);
char* first = str;
char* last = &str[strlen(str)-1];
for(int i = 0 ; i<strlen(str)/2 ; i++){
   char temp = *first;
   *first = *last;
   *last = temp;

   first++;
   last--;
}
printf("%s",str);
}