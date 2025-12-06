arr=list(map(int,input().split(",")))
count=0
while True:
  if all(arr[i]<=arr[i+1] for i in range(len(arr)-1)):
    break
  if arr[0]<arr[1]:
    arr.pop(0)
  else:
    arr.append(arr.pop(0))
  count=count+1
print(count)
'''Input:1,2,4,3
output:3'''
