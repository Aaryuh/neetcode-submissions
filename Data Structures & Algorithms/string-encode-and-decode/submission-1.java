class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded= new StringBuilder();
        for(String s: strs){
            encoded.append(s.length()).append("#").append(s);
        }
        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> finalString= new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#') j++;

            int nextStringLen= Integer.valueOf(str.substring(i, j));
            finalString.add(str.substring(j+1, j+1+nextStringLen));
            i= j+1+nextStringLen;
        }
        return finalString;
    }
}
