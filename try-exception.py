class  Accountlowbalance(Exception):
  pass
class balanceerror(Exception):
  pass
def withdraw(account,balance,money):
  if account=="frozen":
    raise Accountlowbalance("FROZEN ACC")
  elif balance<1000:
    raise balanceerror("LOW BALANCE")
  else:
    s=balance-money
    print(s)
    print("WITHDRAW SUCCESSFUL")
try:
  account=input().strip()
  balance=int(input().strip())
  money=int(input())
  withdraw(account,balance,money)
except Accountlowbalance as e:
  print(e)
except balanceerror as e:
  print(e)
