isvalidParanthesis(self,s):
l=0
stack=[]
stack.append(-1)
for i in range(len(s)):
  if s[i]=="(":
    stack.append(i)
  else:
    stack.pop()
  if not stack:
    stack.append(i)
  else:
    l=max(l,i-stack[-1])
return l
''' to check stack is empty: not stack, len(stack)==-1
    to get peek stack[-1]
    to pop latest elememt stack.pop(),stack.pop(-1)
