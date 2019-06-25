package LeetCode;

public class No105  {
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode head = test(preorder,inorder,0,preorder.length-1,0,inorder.length-1);
        return head;
    }
    public static TreeNode test(int[] pre, int[] in,int pl,int pr,int il,int ir){
        System.out.println(pl+" "+pr+" "+il+" "+ir);
        if(pl > pr){
            return null;
        }else if( pl == pr){
            return new TreeNode(pre[pl]);
        }
        int index = pl;
        TreeNode head = new TreeNode(pre[pl]);
        for(int i = index ; i <= ir; i++){
            if(pre[pl] == in[i]){
                head.left = test(pre,in,   pl+1    ,pl+i-il   , il ,  i-1);
                head.right = test(pre, in ,pl+i-il+1 ,  pr,     i+1,     ir);
                break;
            }
        }
        return head;
    }
    public static void main(String[] args){
        int[] pre ={3,9,20,15,7};
        int[] in = {9,3,15,20,7};
        TreeNode.inOrder( buildTree(pre,in));

    }
}
