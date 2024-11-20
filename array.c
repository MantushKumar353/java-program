#include <stdio.h>
int main()
{
    int arr[] = { 3,8, 9, 6 , 7  };
    int x=6;
    int n=5;
    for(int i=0; i<n; i++){
        printf("arr[%d]=%d, ",i, arr[i]);
    }
    printf("\n");
//    int j=x;
//    while(j<n){
//     arr[j-1]=arr[j];
//     j++;
//    }
   printf("\n");
   for(int i=0; i<n-1; i++){
    printf("arr[%d]=%d, ",i,arr[i]);
   }
   return 0;
}