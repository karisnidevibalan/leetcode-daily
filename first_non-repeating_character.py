s=input()
for i in s:
  c=s.count(i)
  if c==1:
    print(i)
    break
else:
    print("-1")
freq={}
for i in s:
  freq[i]=freq.get(i,0)+1
for i in s:
   if freq[i]==1:
    print(i)
    break


'''
Input:codetantra
output:c
Input:aabbcc
output:-1'''
