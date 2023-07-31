import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        BST bst=new BST();
        bst.put(0,1);
        bst.put(0,1);bst.put(0,1);bst.put(0,1);bst.put(0,1);
        bst.inOrder();
    }
}