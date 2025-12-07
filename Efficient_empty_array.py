n=list(map(int,input().split(",")))
count=0
while n:
  x=n[0]
  if x==min(n):
    n.pop(0)
  else:
    n.append(n.pop(0))
  count=count+1
print(count)
''' input:3,4,-1
output:5'''
  
  
