class Solution(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        s1=s.split()
        s2=s1[::-1]
        return " ".join(s2)
