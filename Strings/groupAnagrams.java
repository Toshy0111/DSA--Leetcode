class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       int n = strs.length;
       HashMap<String , List<String>> map = new HashMap<>();
       
       for(int i=0; i<n; i++){
        String str = strs[i];
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        String key = new String (arr);
        if(!map.containsKey(key)){
            map.put(key, new ArrayList<>());
        } 
        map.get(key).add(str);
       }
     return new ArrayList<>(map.values());
    }
}