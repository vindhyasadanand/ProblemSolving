class GfG
{
    void buildHeap(int arr[], int n)
    {
        //to build max heap
        for(int i=(n-2)/2;i>=0;i--)
        {
           heapify(arr,n,i); 
        }
        //NOTE: After finding max heap swapping of
        //first value with last value done by driver code
        /*
        //to swap first node with last node
        for(int i=n-1;i>=0;i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            //to create max heap
            heapify(arr,n,i);
        }
        
        */
    }
 
    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    void heapify(int arr[], int n, int i)
    {
        int larg = i;
        int lt = 2*i+1;
        int rt = 2*i+2;
        if(arr[lt]>arr[larg]&&lt<n)
        {
            larg = lt;
        }
        if(arr[rt]>arr[larg]&&rt<n)
        {
            larg = rt;
        }
        if(larg!=i)
        {
            int temp = arr[larg];
            arr[larg] = arr[i];
            arr[i] = temp;
            heapify(arr,n,larg);
        }
    }
 }
 
 