public class Print_Permutation
{
    public static ArrayList<String> FindPermutations(String STR) {

        // Write your code here!
        // base case: 
        if(STR.length()==0)
        {
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }
        char ch = STR.charAt(0);
        String ros = STR.substring(1);
        ArrayList<String> mr = new ArrayList<>();
        ArrayList<String> rr =  FindPermutations(ros);
        for(String rrs:rr)
        {
            for(int i=0;i<=rrs.length();i++)
            {
                String val = rrs.substring(0,i) + ch + rrs.substring(i);
                mr.add(val);
                
            }
        }
        return mr;

    }
}