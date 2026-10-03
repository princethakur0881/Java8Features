import java.util.HashMap;

public class CheckAnagram {
    static void main() {
        String s1 = "slient";
        String s2 = "listen";
        CheckAnagram obj = new CheckAnagram();
        System.out.println(obj.anagram(s1,s2));
    }
    public boolean anagram(String s1, String s2){
            if(s1.length()!=s2.length()) return false;
//        HashMap<Character,Integer> cs1=new HashMap<>();
//        HashMap<Character,Integer> cs2=new HashMap<>();
//            for (int i=0;i<s1.length();i++){
//                char ss1 = s1.charAt(i);
//                char ss2 = s1.charAt(i);
//                cs1.put(ss1,cs1.getOrDefault(ss1,0));
//                cs2.put(ss2,cs2.getOrDefault(ss2,0));
//            }
//        return cs1.equals(cs2);


        //type 2
        int [] freq = new int[26];
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;

            freq[s2.charAt(i)-'a']--;
        }
        for(int i:freq){
            if(i!=0)return false;
        }
        return true;
    }
}
