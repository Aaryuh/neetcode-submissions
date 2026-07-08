class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> ListOfLists = new HashMap();
        for(int i = 0; i < strs.length; i++){
            String cur = strs[i];
            char[] s = cur.toCharArray();
            Arrays.sort(s);
            String sorted = new String(s);

            if(ListOfLists.containsKey(sorted)){
                ListOfLists.get(sorted).add(cur);
            }else{
                List<String> list = new ArrayList<>();
                list.add(cur);
                ListOfLists.put(sorted, list);
            }
        }

        return new ArrayList<>(ListOfLists.values());

    }
}
