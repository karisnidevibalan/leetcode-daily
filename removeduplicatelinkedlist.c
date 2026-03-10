#include<stdio.h>
#include<stdlib.h>
typedef struct Node{
    int d;
    struct Node* n;
}node;
node* duplicate(node* head){
    node* temp=head;
    while(temp->n!=NULL && temp->n!=NULL){
        if(temp->d==temp->n->d){
            temp->n=temp->n->n;
        }
        else{
            temp=temp->n;
        }
    }
    return head;
}
void print(node* head){
        if(head==NULL){
        printf("Empty list\n");
        return;
    }
    node* t=head;
    while(t->n!=NULL ){
       printf("%d->",t->d); 
       t=t->n;
    }
    printf("%d",t->d);
}
void main(){
    int n;
    scanf("%d",&n);
    int a;
    node* head=NULL;
    node* temp=NULL;
    for(int i=0;i<n;i++){
        scanf("%d",&a);
        node* new=(node*)malloc(sizeof(node));
        new->d=a;
        new->n=NULL;
        if(head==NULL){
            head=new;
        }
        else{
            temp=head;
            while(temp->n!=NULL){
                temp=temp->n;
            }
            temp->n=new;
        }
    }
    print(head);
    head=duplicate(head);
    print(head);
}
