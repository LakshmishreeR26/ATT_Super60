import java.util.ArrayList;
import java.util.List;
public class LeetCodePhoneProblem {
    private void solve(String digits, String output, int index, List<String> ans, String[] mapping){
        //Base Case
        if(index>=digits.length()){
            ans.add(output);
            return;
        }
        int number=digits.charAt(index)-'0'; //2
        String value = mapping[number]; //abc
        for(int i=0;i<value.length();i++){
            output+=value.charAt(i); //Chosen 'a'
            solve(digits,output,index+1,ans,mapping);
            output=output.substring(0,output.length()-1); //Backtracking
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        //Base Case
        if(digits==null || digits.length()==0){
            return ans;
        }


        String[] mapping = {
                "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
        };
        solve(digits,"",0,ans,mapping);
        return ans;
    }
    public static void main(String[] args) {
        LeetCodePhoneProblem leetcode = new LeetCodePhoneProblem();
        List<String> ans = leetcode.letterCombinations("23");
        System.out.println(ans);
    }
}
