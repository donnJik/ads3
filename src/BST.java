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
        return null;
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
