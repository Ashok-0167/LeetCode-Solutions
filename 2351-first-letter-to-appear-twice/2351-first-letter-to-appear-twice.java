class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> d=new HashSet<>();
        for(char c: s.toCharArray()){
            if(d.contains(c)){
                return c;
            }

            d.add(c);

        }
        return 'a';
    }
}