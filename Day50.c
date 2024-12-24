#include<stdio.h>
#include<stdlib.h>

int main()
{
    int D, B;
    scanf("%d",&D);
    int dragon[D];
    for(int i=0;i<D;i++)
    {
        scanf("%d ",&dragon[i]);
    }
    scanf("%d",&B);
    int bomb[B];
    printf("\n");
    for(int i=0;i<B;i++)
    {
        scanf("%d ",&bomb[i]);
        int flag=0;
        loop:
            for(int j=0;j<D;j++)
            {
                dragon[j]-=bomb[i];
                if(dragon[j]<0)
                {
                    flag=1;
                }
            }
            if(flag)
            {
                printf("Game Over");
                break;
            }
            else
            {
                for(int j=0;j<D;j++)
                {
                    printf("%d ",dragon[j]);
                }
                printf("\n");
            }
            if(i==(B-1))
            {
                goto loop;
            }
    }
}