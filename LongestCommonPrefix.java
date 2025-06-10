import java.util.Arrays;

class TrieNode1{
    TrieNode1[] children = new TrieNode1[26];
    boolean isEndOfWord;
    int childrenCount;
    TrieNode1(){
        isEndOfWord = false;
        childrenCount = 0;
        Arrays.fill(children, null);
    }
}
public class LongestCommonPrefix {
    public static void insert(TrieNode1 root, String key){
        TrieNode1 curr = root;
        for(char c : key.toCharArray()){
            int index = c - 'a';
            if(curr.children[index] == null){
                curr.children[index] = new TrieNode1();
                curr.childrenCount++;
            }
            curr = curr.children[index];
        }
        curr.isEndOfWord = true;
    }
    public static String longestCommonPrefix(TrieNode1 root){
        //c+o+d+e -> StringBuilder
        StringBuilder prefix = new StringBuilder();
        TrieNode1 curr = root;
        while(curr != null && curr.childrenCount == 1 && !curr.isEndOfWord) {
            for(int i=0;i<26;i++){
                if(curr.children[i] != null){
                    prefix.append((char)(i+'a'));
                    curr = curr.children[i];//Move to the next character
                }
            }
        }
        return prefix.toString();
    }
    public static void main(String[] args) {
        TrieNode1 root = new TrieNode1();
        String[] words ={"flower","flow","flight","flown","fly"};
        for(String word : words){
            insert(root, word);
        }
        String lcp = longestCommonPrefix(root); //fl
        if(lcp.isEmpty()){
            System.out.println("There is no longest common prefix");
        }
        else{
            System.out.println("The longest common prefix:"+lcp);
        }
    }
}
