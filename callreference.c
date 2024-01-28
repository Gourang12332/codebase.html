#include <stdio.h>
 void square(int *p){
*p = *p * *p ;
printf("the square is %d" , *p);
}
int main(){
int i = 4;
square(&i);
printf("the number is %d",i);
}