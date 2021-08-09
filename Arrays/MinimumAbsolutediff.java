class Result {

    /*
     * Complete the 'minimumAbsoluteDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int minimumAbsoluteDifference(List<Integer> arr) 
    {
           Collections.sort(arr);

        int minimumDifference = Integer.MAX_VALUE;

        for (int i = 0; i < arr.size() - 1; i++) {
             int difference = arr.get(i+1) - arr.get(i);
    
        if (difference < minimumDifference) 
        {
             minimumDifference = difference;
        
            
         }
       }   

        return minimumDifference;

    }

}
