class Solution {

    public void backtrack(List<Integer> path, int start, int k, int n, List<List<Integer>> res){
        if(path.size() == k){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i = start; i <= n; i++){
            path.add(i);
            backtrack(path, i+1, k, n, res);
            path.remove(path.size() - 1);
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(new ArrayList<>(), 1, k, n, res);
        return res;
       
    }
}
