#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
struct node
{
    int number;
    struct node* next;
};

int main(){
    printf("Hello World");
    int i;
    struct node* root = NULL;
    struct node* temp = NULL;
    for (i=0; i<10; i++) {
    	struct node* namelist = (struct node*) malloc(sizeof(struct node));
        namelist->number = i;
        namelist->next = NULL;
        if(root == NULL) {
        	root = namelist;
			temp = root;	
		} else {
        	temp->next = namelist;
			temp = temp->next;	
		}
        
    }
    //struct node* temp = NULL;
    temp = root;
    while(temp != NULL){
    	printf("%d",temp->number);
    	temp = temp->next;
	}
    
}
