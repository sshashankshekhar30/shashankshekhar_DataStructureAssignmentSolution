package com.greatlearning.driver;
import java.util.*;

public class BST {
	static int key;
	static Scanner input=new Scanner (System.in);
	
	/**
	 * BST nodes:-
	 * @param args
	 */
	static class Node{
		
		int key;
		Node left;
		Node Right;
	}
	/**
	 * Temp Node creation:-
	 * @param args
	 */
	static Node NewNode(int data) {
		
		Node temp=new Node();
		temp.key=data;
		temp.left=null;
		temp.Right=null;
		
		return temp;
	}
	/**
	 * Insertion of Nodes:-
	 * @param root
	 * @param key
	 * @return
	 */
	static Node InsertNode(Node root,int key) {
		
		Node newNode=NewNode(key);
		
		Node x=root;
		Node Current_Node=null;
		
		while(x!=null) {
			
			Current_Node=x;
			int parent=x.key;
			System.out.println("the parent Node is "+parent);
			if(key<x.key) {
				x=x.left;
			}else if(key>x.key) {
				
				x=x.Right;
			}else {
				
				System.out.println("Dublicate value Found ");
				
				return newNode;
			}
		}
		
		if(Current_Node==null) {
			
			Current_Node=newNode;
		}else if(key<Current_Node.key) {
			
			Current_Node.left=newNode;
		}else {
			
			Current_Node.Right=newNode;
		}
		
		return Current_Node;
	}
	public static void InorderAssendingOrder(Node root) {
		
		if(root==null) {
			return;
		}else {
			InorderAssendingOrder(root.left);
			System.out.print("["+ root.key + "]");
			InorderAssendingOrder(root.Right);
			
		}
	}
	
	public static void main(String[] args) {
		
		Node root=null;
		Node result=null;
		
		boolean Status=true;
		
		while(Status==true) {
			
			System.out.println("Enter the Total Number of Transaction that You want to make:- ");
			int size=input.nextInt();
			for(int i=0;i<size;i++) {
				
				System.out.println(String.format("Enter the %d Transections",(i+1) ));
				int Transection=input.nextInt();
				
				if(root==null) {
					
					root=InsertNode(root,Transection);
				}else {
					
					result=InsertNode(root,Transection);
				}
				
				System.out.println("The Binary Tree in the ascending Order is ");
				InorderAssendingOrder(root);
				System.out.println();
			}
			
		System.out.println("To stop Transaction, enetr 0, else Press Any other numberas key to continue");
		
		int Ans=input.nextInt();
		
		if(Ans==0) {
			Status=false;
			
		}else {
			Status=true;
			}
		}
		System.out.println("Program Completed SucssessFully ");
		input.close();
	}


}
