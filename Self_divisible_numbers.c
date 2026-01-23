/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* selfDividingNumbers(int left, int right, int* returnSize) {
    
    *returnSize=0;
    int* arr=(int*)malloc((right-left+1)*sizeof(int));
    int num;
    for(int i=left;i<=right;i++){
        num=i;
        int isValid=1;
    while(num>0){
        int temp=num%10;
           if(temp==0 || i%temp!=0){
            isValid=0;
            break;
           }
           num=num/10;
    }
           if(isValid==1){
           arr[(*returnSize)++]=i;
           }
    }
    return arr;
}
// if the number contains 0 then it won't be self divisible.
