class Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
    List<Integer> ans = new ArrayList<Integer>();
    for(int marks:grades)
    {
         if(marks<38||marks%5<=2) 
         {
             ans.add(marks);
         }      
         else if(marks%5>2)
         {
              int add = 5 - (marks%5);
              ans.add(marks+add);
         }
    }
    return ans;

    }

}
