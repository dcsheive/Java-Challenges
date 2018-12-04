public class Anagram{
    
    public static void main(String[] args) {
        System.out.println(isAnagram("race", "Faaces"));
        System.out.println(isAnagram("race", "Face"));
        System.out.println(isAnagram("race", "acre"));
    }
    public static boolean isAnagram(String str1, String str2){
        if (str1.length() != str2.length()) return false;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        int[] letters = new int[256];
        
        for (char c : str1.toCharArray()){
            letters[c]++;
        }
        for (char c : str2.toCharArray()){
            letters[c]--;
        }
        for (int i : letters){
            if (i!= 0){
                return false;
            }
        }
        return true;
    }
}