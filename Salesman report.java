# Salesman-report
#include<stdio.h>
#include<conio.h>
void main()
{
int salitm[4][3],i,j,itmtot[3]={0},salpertot[4]={0}
clrscr();
printf("*****Sales Item Demo*****\n\n");
printf("Enter details for 4 salesman's purchase for 3 items\n");
for(i=0;i<4;i++)
{
for(j=0;j<3;j++)
{
scanf("%d",&salitm[i][j]);
salpertot[i]=salpertot[i]+salitm[i][j];
itmtot[i]=itmtot[j]+salitm[i][j];
}
}
printf("\n\n\tItem1\Item2\tItem3\n");
for(i=0;i<4;i++)
{
printf("%s%-4d","s",i+1);
for(j=0;j<3;j++)
{
printf("%*d",7+j,salitm[i][j]);
}
printf("\n");
}
printf("\n Item wise total\n");
for(j=0;j<3;j++)
printf("%s%-3d=%5d\t","Item",j+1,itmtot[j]);
printf("%s%-3d=%5d\t","s",j+1,salpertot[j]);
getch();
}
