package Arrays.Medium;

public class Question3 {
    public static boolean isAnagram(String s, String t) {
        s = s.toLowerCase();
        t = t.toLowerCase();
        if(s==null||t==null||s.length() != t.length()) return false;
        int freq [] = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(freq[i]!=0) return false;
        }
        return true;
    }
    static void main() {
        String  str1  = "Listen";
        String  str2  = "isten";
        if(isAnagram(str1,str2)){
            System.out.println("Given both String is  \"Anagram\"");
        }else {
            System.out.println("Given String is Not \"Anagram\"");
        }
    }
}
