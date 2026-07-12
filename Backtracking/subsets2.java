class Solution {
    public void backtrack(int[] arr, List<List<Integer>> res, List<Integer> path, int start){
        res.add(new ArrayList<>(path));
        for(int i = 0; i < arr.length; i++){
            path.add(arr[i]);
            backtrack(arr, res, path, i+1);
            path.remove(path.size() - 1);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(arr, res, new ArrayList<>(), 0);
        return res;
        
    }
}
