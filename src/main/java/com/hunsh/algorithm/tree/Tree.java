package com.hunsh.algorithm.tree;

import org.junit.Test;

import javax.xml.soap.Node;

/**
 * @Author : Edward Jia
 * @Description :
 * @Date : 17/4/27
 * @Version :
 */
public class Tree {


    public static void main(String[] args){



    }

    Node root = null;


    void empty (){
        root = null;
    }

    boolean isEmpty (){
        return root == null;
    }

    Node add (Node node){
        return add(node, root);
    }

    private Node add (Node node, Node root){
        return null;
    }

    Node remove (Node node){
        return remove(node, root);
    }

    private Node remove (Node node, Node root){
        return null;
    }

    Node find (Integer data){
        return null;
    }
















    class Node <T>{
        T t;

        Node<T> left;
        Node<T> right;


        Node(T t){
            this(t, null, null);
        }

        Node(T t, Node left, Node right){
            this.t = t;
            this.left = left;
            this.right = right;
        }
    }

}
