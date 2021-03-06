package com.dhslegen.数据结构.树形结构.二叉树.二叉树遍历.中序遍历;

import com.dhslegen.数据结构.树形结构.二叉树.二叉树遍历.TreeNode;

public class InOrder {
    public static void inOrderTraversal(TreeNode biTree) {
        if (biTree == null) {
            return;
        } else {
            inOrderTraversal(biTree.left);
            System.out.printf(biTree.val + ",");
            inOrderTraversal(biTree.right);
        }
    }
}
