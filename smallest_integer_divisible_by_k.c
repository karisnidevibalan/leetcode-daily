int smallestRepunitDivByK(int k) {
    if(k%2==0 || k%5==0){
        return -1;
    }
    int n=0;
    int  len;
    for(len=1;len<=k;len++){
        n=(n*10+1)%k;
        if(n==0)
        return len;
    }
    return -1;
}
// n should be of only 1's so it cann't be divisible by  even numbers and 5 since 0,5 are the ending of multiples of 5.
