bool canMakeArithmeticProgression(int* arr, int arrSize) {
    int compare(const void* a,const void* b){
        return *(int*)a-*(int*)b;
    }
    if(arrSize<=2){
        return true;
    }
    qsort(arr,arrSize,sizeof(int),compare);
    int diff=arr[1]-arr[0];
    for(int i=0;i<arrSize-1;i++){
        if(arr[i+1]-arr[i]!=diff){
            return false;
        }
    }
    return true;
}
//the difference between the numbers should be the same
