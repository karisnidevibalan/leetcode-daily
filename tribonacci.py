class Solution(object):
    def tribonacci(self, n):
        """
        :type n: int
        :rtype: int
        """
        t1,t2,t3=0,1,1
        if n==0:
            return 0
        if n==1 or n==2:
            return 1
        for _ in range(n-2):
            temp=t1+t2+t3
            t1=t2
            t2=t3
            t3=temp
        return t3
