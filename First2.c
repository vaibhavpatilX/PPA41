#include<stdio.h>

//First2.c and Second.c Link compile

 //No1 is a integer which is defined external
 //to  this file
 extern int No1;

 //No2 is a integer whioch is defined external
 //to this file 
 extern int No2;

 
 //Function Declaration
 //Demo is a function which accepts nothing and 
 //which returns nothing is external to this file;
 extern void Demo();

 int main()
{
    Demo();     //Function call

    printf("Value of No1 : %d\n",No1);
    printf("Value of No2 : %d\n",No2);

    return 0;
}
