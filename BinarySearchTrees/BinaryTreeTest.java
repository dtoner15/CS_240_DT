package BinarySearchTrees;

public class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();

        tree.insert(8);
        tree.insert(7);
        tree.insert(12);
        tree.insert(15);
        tree.insert(20);
        tree.insert(2);
        tree.insert(3);
        tree.insert(5);

        tree.delete(5);

        tree.search(22);      
 
        System.out.println("Inorder: ");
        tree.inOrder();
        System.out.println("\nPreorder: ");
        tree.preOrder();
        System.out.println("\nPostorder: ");
        tree.postOrder();
        System.out.println();

        tree.outPutTree(5);
    }
}
