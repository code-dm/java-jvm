package com.codingdm.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: java-jvm
 * @description: 合并BST
 * @author:
 * @Email
 * @created: 2021/06/14 14:41
 */
public class BinarySearchTreeMerge {


    public void toArray(ArrayList<Integer> result, Node root){
        if(root != null) {
            toArray(result, root.left);
            result.add(root.data);
            toArray(result, root.right);
        }
    }

    public ArrayList<Integer> treeToArray(Node root){
        ArrayList<Integer> result = new ArrayList<>();
        toArray(result, root);
        return result;
    }

    public ArrayList<Integer> mergeSortedArray(ArrayList<Integer> array1, ArrayList<Integer> array2){

        if (array1 == null && array2 == null) {
            return null;
        }
        if (array1 == null || array1.size() <= 0) {
            return array2;
        }
        if (array2 == null || array2.size() <= 0) {
            return array1;
        }

        ArrayList<Integer> result = new ArrayList<>(array1.size() + array2.size());
        int i = 0, j = 0;
        while (i < array1.size() && j < array2.size()){

            if(array1.get(i) <= array2.get(j)) {
                result.add(array1.get(i));
                i ++;
            }else {
                result.add(array2.get(j));
                j ++;
            }
        }

        int size = Math.max(array1.size(), array2.size());

        ArrayList<Integer> maxArray =  array1.size() > array2.size() ? array1 : array2;

        while (i < size){
            result.add(maxArray.get(i));
            i ++;
        }
        return result;
    }

    public Node arrayToTree(ArrayList<Integer> array, int start, int end){

        if (start > end) {
           return null;
        }
        int mid = (start + end) / 2;
        Node node = new Node(array.get(mid));

        node.left = arrayToTree(array, start, mid - 1);

        node.right = arrayToTree(array, mid + 1, end);

        return node;

    }


    public void print (Node root) {
        // 利用队列先进先出的性质存储节点
        LinkedList<Node> queue = new LinkedList<>();
        if (root != null) {
            queue.add(root);
        }
        while (!queue.isEmpty()) {
            Node curr = queue.remove();

//            res.add(curr.val);
            System.out.println(curr.data);

            if (curr.left != null) {
                queue.add(curr.left);
            }
            if (curr.right != null) {
                queue.add(curr.right);
            }
        }
    }

    public static void main(String[] args) {

        BinarySearchTreeMerge binarySearchTreeMerge = new BinarySearchTreeMerge();
        Node tree1 = new Node(100);
        tree1.left = new Node(50);
        tree1.right = new Node(300);
        tree1.left.left = new Node(20);
        tree1.left.right = new Node(70);
        ArrayList<Integer> array1 = binarySearchTreeMerge.treeToArray(tree1);

        System.out.println(array1.toString());

        Node tree2 = new Node(80);
        tree2.left = new Node(40);
        tree2.right = new Node(120);
        ArrayList<Integer> array2 = binarySearchTreeMerge.treeToArray(tree2);

        System.out.println(array2.toString());

        ArrayList<Integer> merged = binarySearchTreeMerge.mergeSortedArray(array1, array2);

        System.out.println(merged.toString());

        Node node = binarySearchTreeMerge.arrayToTree(merged, 0, merged.size() - 1);

        binarySearchTreeMerge.print(node);


    }


}

class Node {

    Integer data;
    Node left, right;

    Node(Integer d) {
        data = d;
        left = right = null;
    }
}
