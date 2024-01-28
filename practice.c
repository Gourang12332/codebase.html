#include<stdio.h>
#include<string.h>
int main(){
char str[100] ;
char enc[100] ;
char dec[100] ;
fgets(str , 100 , stdin);
char str2[100];
strcpy(str2,str);
char *p ,*k;
k = str2 ;
p = str;
int n = strlen(str);
int i = 0 ;
int j = 0 ;
while(i!=n){
if(*p == 'W' || *p == 'n' || *p == 'g' || *p == 'y'){
*p = '@';
i++;
}
}
puts(str);
while(i!=n){
char currchar = str2[i];
char curr2 = str[i];
if(currchar != curr2){
*p = *k;
}
k++;
p++;
 i++;   
}
puts(str);
}