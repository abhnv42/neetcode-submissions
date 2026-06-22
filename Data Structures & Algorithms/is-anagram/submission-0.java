class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sChar = s.toCharArray();
        Arrays.sort(sChar);
        String sortedS = new String(sChar);

        char[] tChar = t.toCharArray();
        Arrays.sort(tChar);
        String sortedT = new String(tChar);

        System.out.println(sortedT);
        System.out.println(sortedS);

        if(Objects.equals(sortedT, sortedS)) return true;
        return false;
    }
}
