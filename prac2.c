#include <stdio.h>
#include<string.h>
typedef struct students {
char name[100];
char instituteID[100];
float attendence; 
int marks;
float cgpa ;
}st;
typedef struct teachers {
char name[100] ;
char instituteID[100];
int Salary_paid ;
int workinghours;
}te;
typedef struct staff {
int No_of_members;
int salary ;
int time_joining;
}sf;
int main(){
st arr[2];
for(int i=0 ;i<2;i++){
// enter the name of student 1
printf("ENTER THE NAME OF STUDENT 1 :");
strcpy(arr[i].name , fgets(arr[i].name,100 ,stdin));
arr[i].name[strcspn(arr[i].name , "\n")] = '\0';

// enter the institute id of student 1
printf("ENTER THE INSTITUTE ID OF STUDENT 1 :");
strcpy(arr[i].instituteID , fgets(arr[i].instituteID,100 ,stdin));
arr[i].instituteID[strcspn(arr[i].instituteID ,"\n")] = '\0';

printf("ENTER MARKS :") ;
scanf("%d" , &arr[i].marks);

printf("ENTER Attendence :") ;
scanf("%f" , &arr[i].attendence);

printf("ENTER CGPA :") ;
scanf("%f" , &arr[i].cgpa);
}
int j ;
printf("please enter the number of student you wnat to get info ");
scanf("%d",&j);
puts(arr[j].name);
puts(arr[j].instituteID);
printf("%d",arr[j].marks);
printf("%f",arr[j].cgpa);
printf("%f",arr[j].attendence);
}