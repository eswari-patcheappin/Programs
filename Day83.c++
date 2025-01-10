#include <iostream>
#include<cstring>
using namespace std;
int val(char[],int,int);
int main() {
    char S[201];
    cin>>S;
    int count=0;
    for(int i=0;i<strlen(S);i++)
    {
        count+=val(S,i,i);
        count+=val(S,i,i+1);
    }
    cout<<count;
}
int val(char S[],int left, int right)
{
    int count=0;
    while(left>=0 && right<strlen(S) && S[right]==S[left])
    {
        if(right-left+1>=2)
        {
            count++;
        }
        right++;left--;
    }
    return count;
}