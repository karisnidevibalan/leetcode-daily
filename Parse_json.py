import json
def isjson(myjson):
  try:
    json.loads(myjson)
  except ValueError as e:
    return False
  return True
myjson=input()
print(isjson(myjson))
'''input:{"foo":[5,6.8],"foo":"bar"}
Output:True'''
    
