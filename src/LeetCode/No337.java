package LeetCode;

public class No337 {
    public int rob(TreeNode root) {
        if (root == null)
            return 0;
        return Integer.max(Stolen(root.left,true)+root.val
                        +Stolen(root.right,true),
                Stolen(root.left,false)+Stolen(root.right,false));
    }

    public int Stolen(TreeNode root,boolean isStolen){
        if(root == null)
            return 0;
        int max =Integer.MIN_VALUE;
        if(isStolen){
            max = Stolen(root.left,false)+Stolen(root.right,false);
        }else {
            max = Integer.max(Stolen(root.left,true)+root.val
            +Stolen(root.right,true),
                    Stolen(root.left,false)+Stolen(root.right,false));
        }
        return max;
    }
}
