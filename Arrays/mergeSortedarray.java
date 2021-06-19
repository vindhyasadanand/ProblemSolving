class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int i=m+n-1;
        m = m-1;
        n = n-1;
        int a,b=0;
       
      while(m>=0&&n>=0)
      {    
         
               a = nums1[m]; 
           
                b = nums2[n];
           
            if(a>=b)
            {
                nums1[i] = a;
                m--;
                i--;
            }
            else
            {
                nums1[i] = b;
                n--;
                i--;
            }
    }
         while(n>=0)
        {
            nums1[i] = nums2[n];
            i--;
            n--;
        }
       
    }
}
