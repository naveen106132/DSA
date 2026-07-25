/*
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }*
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    // Returns all root-to-leaf paths in the binary tree
    // Each path is represented as a string like "1->2->5"
    public List<String> binaryTreePaths(TreeNode root) {

        // Final answer list storing all valid paths
        List<String> path = new ArrayList<>();

        // StringBuilder to maintain the current path during DFS
        // Using StringBuilder avoids costly String concatenations
        StringBuilder subPath = new StringBuilder();

        // Start DFS traversal from the root
        binaryPaths(root, path, subPath);

        return path;
    }

    // DFS helper function
    // root    -> current tree node
    // path    -> list storing all completed root-to-leaf paths
    // subPath -> mutable string representing current traversal path
    public void binaryPaths(TreeNode root,
                            List<String> path,
                            StringBuilder subPath) {

        // Store the current length of subPath
        // This is used for backtracking to restore state
        int len = subPath.length();

        // Base Case 1:
        // If current node is null, there is no path to explore
        if (root == null) {
            return;
        }

        // Base Case 2 (Leaf Node):
        // If the current node is a leaf, we complete one full path
        if (root.left == null && root.right == null) {

            // Append the leaf node value to the path
            subPath.append(root.val);

            // Convert the current path to String and store it
            // new String(subPath) ensures we store a snapshot
            path.add(new String(subPath));

            // Backtracking:
            // Restore subPath to its previous state before returning
            subPath.setLength(len);
            return;
        }

        // Recursive Case:
        // Append current node value followed by "->"
        // This represents moving down the path
        subPath.append(root.val).append("->");

        // Explore left subtree
        binaryPaths(root.left, path, subPath);

        // Explore right subtree
        binaryPaths(root.right, path, subPath);

        // Backtracking step:
        // Remove everything added in this function call
        // so sibling branches start with a clean path
        subPath.setLength(len);
    }
}