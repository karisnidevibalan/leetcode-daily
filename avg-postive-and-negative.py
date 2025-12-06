a=list(map(int,input().split(",")))
sum=0
sum1=0
count=0
count1=0
for i in range(len(a)):
  if a[i]<0:
    sum+=a[i]
    count=count+1
  else:
    sum1+=a[i]
    count1=count1+1
if sum==0 and sum1>0:
    avg1=sum1/count1
    print(avg1)
    print("no negative numbers")
elif sum1==0:
  print("no positive numbers")
  avg=sum/count
  print(avg)
'''Input:
-1,-2,-3,-4,-5
output:
no positive numbers
-3.0'''
