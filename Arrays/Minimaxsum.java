class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    int min = arr.get(0);
    int max = min;
    long sum = min;
    for(int i=1;i<arr.size();i++)
    {
        sum +=arr.get(i);
        if(min>arr.get(i))
        {
            min = arr.get(i);
        }
        if(max<arr.get(i))
        {
            max = arr.get(i);
        }
    }
     System.out.println((sum-max)+ " "+ (sum-min));
    }

}
