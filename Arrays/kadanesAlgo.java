int maxSubarraySum(int arr[], int n){
        
        // Your code here
        int sumtillhere = 0;
        int maxsofar = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            sumtillhere +=arr[i];
            if(sumtillhere<arr[i])
            {
                sumtillhere = arr[i];
            }
            maxsofar = Math.max(sumtillhere,maxsofar);
        }
        return maxsofar;
        
    }
    
}

