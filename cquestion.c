// 10
#include<stdio.h>
int main(){
char j ;
for(int i=7 ; i>=1; i--){
for( j = 'A' ; j<'A'+i ; j++){
printf("%c",j);
}
// for(char k = j-1 ; j>='A'+i ; j--){
// printf("%c",j);
// }
printf("\n");
}
}