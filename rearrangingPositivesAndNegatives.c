#include<stdio.h>
void main(){
  int n;
scanf("%d",&n);
int arr[n];
for(int i=0;i<n;i++){
scanf("%d",&arr[i]);
}
int brr[n];
int j=0;
for(int i=0;i<n;i++){
if(arr[i]<0){
brr[j]=arr[i];
j++;
}
}
for(int i=0;i<n;i++){
if(arr[i]>0){
brr[j]=arr[i];
j++;
}
}
for(int i=0;i<n;i++){
printf("%d ",brr[i]);
}
}
s
