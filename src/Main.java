import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        BST bst=new BST();
        bst.put(0,1);
        bst.put(1,2);bst.put(2,3);bst.put(3,4);bst.put(4,5);
        bst.inOrder();
        System.out.println("");
        int treeSize= bst.size();
        System.out.println(treeSize);
        bst.delete(0);
        System.out.println("");
        bst.inOrder();
        System.out.println("");
        treeSize=bst.size();
        System.out.println(treeSize);
    }
}