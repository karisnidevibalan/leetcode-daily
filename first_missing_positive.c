int firstMissingPositive(int* nums, int numsSize) {
    int i=0;
    while(i<numsSize){
        int correctSize=nums[i]-1;
        if(nums[i]<=numsSize && nums[i]>=1   &&nums[i] != nums[correctSize] )
{
            int temp=nums[i];
            nums[i]=nums[correctSize];
            nums[correctSize]=temp;
        }
        else{
        i++;}
    }
    for(int j=0;j<numsSize;j++){
        if(nums[j]!=j+1){
            return j+1;
        }
    }
    return numsSize+1;
}

//the numbers should be placed in the index which is number-1 . 
