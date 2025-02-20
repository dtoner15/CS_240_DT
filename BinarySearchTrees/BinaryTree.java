package BinarySearchTrees;

public class BinaryTree<E extends Comparable<E>> {
    Node<E>  root;


    public void insert(E data){
        //Set root to helper method so that the data gets inputed into the tree
        root = insertHelper(root, data);
    }

    //Main logic for inserting nodes
    private Node<E> insertHelper(Node<E> root, E data){
        if(root == null){
            root = new Node<>(data);
        }else if(data.compareTo(root.data) < 0){
            root.leftNode = insertHelper(root.leftNode, data);
        }else{
            root.rightNode = insertHelper(root.rightNode, data);
        }

        return root;
    }

    //search for a node in a tree 
    public boolean search(E data){
        if(searchHelper(root, data)){
            System.out.println(data + " was found");
        return true;
        }else{
            System.out.println(data + " could not be found");
            return false;
        }
        
    }

    //Main logic for searching for a node in a tree
    private boolean searchHelper(Node<E>root, E data){
        if(root == null){
            return false;
        }else if(root.data == data){
            return true;
        }else if(data.compareTo(root.data) < 0){//compare the root node with the current node if less than search the left subtree
            return searchHelper(root.leftNode, data);
        }else{
            return searchHelper(root.rightNode, data);
        }
    }



    //main method for deleting nodes
    public void delete(E data){
        if(search(data)){
            deleteHelper(root, data);
        }else{
            System.out.println(data  + "Data could not be found");
        }
    }

    //main logic for deleting nodes
    private Node<E> deleteHelper(Node<E> root, E data){
        if(root == null) {
			return root;//root is null so we want to return that null value
		}
		else if(data.compareTo(root.data) < 0) {
			root.leftNode = deleteHelper(root.leftNode, data);
		}
		else if(data.compareTo(root.data) > 0) {
			root.rightNode = deleteHelper(root.rightNode, data);
		}
		else { // node found
			if(root.leftNode == null && root.rightNode == null) {
				root = null;
			}
			else if(root.rightNode != null) { //find a successor to replace this node
				root.data = successor(root);
				root.rightNode = deleteHelper(root.rightNode, root.data);
			}
			else { //find a predecessor to replace this node
				root.data = predecessor(root);
				root.leftNode = deleteHelper(root.leftNode, root.data);
			}
		}
		return root;
    }

    private E successor(Node<E> root) { //find least value below the right child of this root node
		root = root.rightNode;
		while(root.leftNode != null){
			root = root.leftNode;
		}
		return root.data;
	}
	private E predecessor(Node<E> root) {//find greatest value below the left child of this root node
		root = root.leftNode;
		while(root.rightNode != null){
			root = root.rightNode;
		}
		return root.data;
	}

    public void inOrder(){
        inOrderHelper(root);
    }

    private void inOrderHelper(Node<E> root){
        if(root != null){
            inOrderHelper(root.leftNode);
            System.out.print(root.data + " ");
            inOrderHelper(root.rightNode);
        }
    }

    public void preOrder(){
        preOrderHelper(root);
    }

    private void preOrderHelper(Node<E> root){
        if(root != null){
            System.out.print(root.data + " ");
            preOrderHelper(root.leftNode);
            preOrderHelper(root.rightNode);
        }
    }

    public void postOrder(){
        postOrderHelper(root);
    }
    
    private  void postOrderHelper(Node<E> root){
        if(root != null){
            postOrderHelper(root.leftNode);
            postOrderHelper(root.rightNode);
            System.out.print(root.data + " ");
        }
    }

    public void outPutTree(E data){
        Node<E> node = null;
        root = outPutTreeHelper(node, data);
    }

    private Node<E> outPutTreeHelper(Node<E> node, E data){
        if(node != null){
            if(node.rightNode != null){
                System.out.println("//");
            }else{
                System.out.println("//");
            }
        }

        return node;
    }

   


    public static class Node<E>{
        protected E data;//Create data variable for storing data in node
        protected Node<E> rightNode;//reference to the right child node 
        protected Node<E> leftNode;//reference to the left child node
    
        //This constructor assigns the parameter data to the instance variable data, constructor to intialize new node with data.
        public Node(E data){
            this.data = data;
        }
    }

}
