class Solution {
    public double average(int[] salary) 
    {
        int max = salary[0];
        int min = salary[0];
        for(int i=1;i<salary.length;i++)
        {
            if(salary[i]>=max)
            {
                max = salary[i];
            }
           else if(salary[i]<min)
            {
                min = salary[i];
            }
            
        }
       // System.out.println(max + " "+ min);
        double sum=0;
        for(int i=0;i<salary.length;i++)
        {
            if(salary[i]!=max && salary[i]!=min)
            {
                sum+=salary[i];
            }
        }
        int n = salary.length;
        n = n-2;
        sum = sum/n;
        return sum;
    }
}
