class Solution {

     public void backtrack(List<List<Integer>> res, int[] arr, List<Integer> path){ 
           if(path.size() == arr.length){
            res.add(new ArrayList<>(path));
            return;
           }

           for(int i=0; i<arr.length; i++){
            if(!path.contains(arr[i])){
                path.add(arr[i]);
                backtrack(res, arr, path);
                path.remove(path.size()-1);
            }
           }
        }

    public List<List<Integer>> permute(int[] arr) {

        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, arr, new ArrayList<>());
        return res;
    }
}