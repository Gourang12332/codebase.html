#include<stdio.h>
typedef struct Node
{
 int data;
 struct Node* next;
} Node;
Node* head;
typedef struct linkedlist{

void (*add)(int data);
void (*print)();
}ll;
Node* temp;
void add(int data){

    Node* newnode = (Node*)malloc(sizeof(Node));
    newnode->data = data;
    if(head == NULL){
        head = newnode;
        temp = head;
        return ;
    }
temp->next = newnode;

newnode->next = NULL ;
temp = newnode;
}

void printlist(){
Node* currnode = head;
while(currnode!=NULL){
 printf("%d  ----->  ",currnode->data);
 currnode = currnode->next;
 
}
}
int main(){
ll list;
list.add = add;
list.print = printlist ;

list.add(1);
list.add(2);
list.add(3);
list.add(4);
list.print();
}