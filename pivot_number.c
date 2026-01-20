int pivotInteger(int n) {
    int l=1;
    int r=n;
    int ls=0;
    int rs=0;
    if(n==1 || n==0){
        return n;
    }
    while(l<r){
          ls+=l;
          rs=0;
          for(int i=l;i<=n;i++){
          rs+=i;
          }
          if(ls==rs){
            return l;
            break;
          }
          l++;

    }
    return -1;
}
//A pivot number is a number to which the sum from 0 to that number is equal to the sum of that number to the given input value
