package LeetCode;

public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;

      TreeNode(int x) {
          val = x;
      }
      public static void inOrder(TreeNode node){
          if(node ==null){
             return;
          }
          System.out.print(node.val+" ");
          inOrder(node.left);
          inOrder(node.right);
      }
}
