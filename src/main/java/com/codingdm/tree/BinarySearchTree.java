/*
 * Copyright (C) 2021 XW Soft, LLC - All Rights Reserved
 *
 * This program and the accompanying materials are made by XW Soft, LLC.
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 *
 * Written by Dongming WU <wudongming@xwsoft.com.cn>, 06/2021
 */

package com.codingdm.tree;

/**
 * @author Dongming WU
 */
class Node {
    int value;
    Node left, right;

    public Node(int d) {
        value = d;
        left = right = null;
    }
}

public class BinarySearchTree {


    // 前序遍历 -> 根前后 深度优先
    void before(Node node) {
        if(node != null) {
            System.out.println(node.value);
            before(node.left);
            before(node.right);
        }

    }

    // 中序遍历 -> 前根后
    void root(Node node) {
        if(node != null) {
            before(node.left);
            System.out.println(node.value);
            before(node.right);
        }
    }

    // h后续遍历 -> 前后根
    void after(Node node) {
        if(node != null) {
            before(node.left);
            before(node.right);
            System.out.println(node.value);
        }
    }



    public static void main(String[] args) {

        Node root = new Node(41);

        Node l11 = new Node(20);

        root.left = l11;
        l11.left = new Node(11);
        l11.right = new Node(29);
        l11.right.left = new Node(32);

        root.right = new Node(65);
        root.right.left = new Node(50);
        root.right.right = new Node(91);

        root.right.left.left = new Node(72);
        root.right.left.right = new Node(99);


        new BinarySearchTree().before(root);
        System.out.println("--------------------------");
        new BinarySearchTree().root(root);
        System.out.println("--------------------------");
        new BinarySearchTree().after(root);

    }


}
