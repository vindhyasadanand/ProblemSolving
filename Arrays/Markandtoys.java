import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'maximumToys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY prices
     *  2. INTEGER k
     */

    public static int maximumToys(List<Integer> prices, int k) 
    {
    // Write your code here
            Collections.sort(prices);
            int item = 0;
            int sum = 0;
            for(int i=0;i<prices.size();i++)
            {
                if(k-prices.get(i)>=0)
                {
                    k = k - prices.get(i);
                    item++;
                }
                else
                {
                    return item;
                }
            }
            return item;
    }

}
