#include<stdio.h>
void add();

void sub();

int main()
{
add();
sub();

}

void add()
{
int c,t,k;
printf("Enter the numbers : ");
scanf("%d",&t);
scanf("%d",&k);
c=t+k;

printf("The number is : %d \n",c);

}


void sub()
{
int a , c,b;
printf("Enter the numbers : ");
scanf("%d",&a);
scanf("%d",&b);
c=a-b;

printf("The number is : %d \n",c);

}
