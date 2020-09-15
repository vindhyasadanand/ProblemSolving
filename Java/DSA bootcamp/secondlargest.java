class TestClass 
{
    static void secondLargest(int a,int b,int c)
    {
        if(a>=b && a>=c)
        {
            if(b>=c)
            {
                System.out.println(b);
            }
            else{
                System.out.println(c);
            }
            
        }
        else if(b>=c && b>=a)
        {
          if(a>=c)
          {
              System.out.println(a);
          }
          else{
              System.out.println(c);
          }
        }
        else{
             if(a>=b)
             {
                 System.out.println(a);
             }
             else{
                 System.out.println(b);
             }
           
        }
        
    }
    public static void main(String args[] ) throws Exception 
    {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner sc= new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i=0;i<tc;i++)
        {
           int a = sc.nextInt();
           int b = sc.nextInt();
           int c = sc.nextInt();
           secondLargest(a,b,c);

        }

    }
}
