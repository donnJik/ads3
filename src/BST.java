public class BST <K extends Comparable<K>, V>{
    private Node root;
    private class Node{
        private K key;
        private V val;
        private Node left,right;
        public Node(K key, V val)
        {
            this.key=key;
            this.val=val;
            left=right=null;
        }
    }
    public BST(){
        root=null;
    }
    public void put(K key, V val) {
        root = put(root, key, val);
    }
    private Node put(Node current,K key,V val){
        if(current==null){
            return new Node(key, val);
        }
        int cmt= key.compareTo(current.key);
        if(cmt<0){
            current.left=put(current.left, key,val);
        }
        else if(cmt>0){
            current.right=put(current.right, key, val);
        }else {
            current.val = val;
        }
        return current;
    }
    public void inOrder(){
        inOrder(root);//что это означает?
    }
    private void inOrder(Node current) {
        if (current != null) {
            inOrder(current.left);
            System.out.print(current.val + " ");
            inOrder(current.right);
        }
    }
    public V get(K key){
        return null;
    }
    public void delete(K key){

    }
    public Iterable<K> iterator(){
        return null;
    }

}
