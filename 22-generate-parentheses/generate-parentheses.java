class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        backtracking (0, 0, n, res, str);
        return res;
    }

    private void backtracking(int open, int close, int n, List<String> res, StringBuilder str){
        if (open == close && open == n){
            res.add(str.toString());
            return;
        }
        if (open > close){
            str.append(')');
            backtracking(open, close+1, n, res, str);
            str.deleteCharAt(str.length()-1);
        }
        if (open < n){
            str.append('(');
            backtracking(open+1, close, n, res, str);
            str.deleteCharAt(str.length()-1);
        }
    }
}