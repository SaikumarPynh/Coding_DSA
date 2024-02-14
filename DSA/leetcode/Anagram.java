import java.util.HashMap;
class annagram{
    public static void result(String str1,String str2){
        HashMap<Character,Integer> map1 = new HashMap<>();

        HashMap<Character,Integer> map2 = new HashMap<>();

        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();
        if(s1.length != s2.length){
            return;
        }
        for(char i:s1){
            map1.put(i,map1.getOrDefault(i,0)+1);
        }
        for(char c:s2){
            map2.put(c,map2.getOrDefault(c,0)+1);
        }
        if(map1.equals(map2)){
            System.out.print("anagrams");
        }else{
            System.out.print("not an anagrams");

        }


    }
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        result(str1, str2);
    }
}
