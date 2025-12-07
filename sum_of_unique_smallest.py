n=list(map(int,input().split(",")))
if len(n)<=2:
  sum= 0
elif all(n[i]<n[i+1] for i in range(len(n)-1)):
  sum= 0
elif len(set(n))==1:
  sum = 0
else:
  s=sorted(set(n))
  min=s[0]
  max=s[1]
  i=n.index(min)
  j=n.index(max)
  sum1=sum(n[i+1:j] )
  print(sum1)
  
'''Input: 3,1,4,1,2,5
Output:5'''
