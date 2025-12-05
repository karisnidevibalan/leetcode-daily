arr = list(map(int, input().split(',')))
def count(arr):
  count1=arr.count(1)
  count2=arr.count(2)
  count3=arr.count(3)
  return [1]*count1+[2]*count2+[3]*count3
print(count(arr))
