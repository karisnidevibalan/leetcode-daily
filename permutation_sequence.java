class Solution {
    public String getPermutation(int n, int k) {
      List<Integer>l1=new ArrayList<>();
      for(int i=1;i<=n;i++){
        l1.add(i);
      }
      int[] freq=new int[n+1];
      freq[0]=1;
      for(int i=1;i<=n;i++){
        freq[i]=freq[i-1]*i;
      }
      k=k-1;
      StringBuilder ans=new StringBuilder();
      for(int i=n;i>=1;i--){
        int block_size=freq[i-1];
        int index=k/block_size;
        ans.append(l1.get(index));
        l1.remove(index);
        k=k%block_size;
      }
      return ans.toString();
    }
}
//instead of performing all n permutations,permutations of digits places are computed and stored as an array, a list containing all n elements and removing the element that is found in  order to get next element . 


🧠 PERMUTATION SEQUENCE – QUICK REVISION NOTES
🔑 Core Idea

Fix one digit → remaining digits can be arranged freely
Free digits = factorial blocks

🧮 Why factorial?

After fixing a digit:

Remaining positions = (n−1)

Arrangements = (n−1)!

So each digit choice forms a block of (n−1)! permutations

📦 Block Jumping

Convert k to 0-based → k = k - 1

index = k / blockSize

Jump to that block

🔁 Repeat for every position

For each digit:

blockSize = (remainingDigits)!

index = k / blockSize

Pick number at index

Remove it

k = k % blockSize

⚠️ MUST-REMEMBER RULES

✔ Numbers list = 1 to n (NOT 0 to n-1)
✔ Always do k = k - 1
✔ Use (i-1)! for block size
