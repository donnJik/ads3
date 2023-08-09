import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap.SimpleEntry;
import java.util.Iterator;
public class BST <K extends Comparable<K>, V> implements Iterable<Map.Entry<K, V>> {
    private Node root;

    @Override
    public Iterator<Map.Entry<K, V>> iterator() {
        return null;
    }

    public class Node{
        public K key;
        public V val;
        private Node left,right;
        private int size;
        public Node(K key, V val)
        {
            this.key=key;
            this.val=val;
            left=right=null;
            this.size=1;
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
        current.size=1+size(current.left)+size(current.right);
        return current;
    }
    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node current) {
        if (current != null) {
            inOrder(current.left);
            System.out.print(current.val + " ");
            inOrder(current.right);
        }
    }

    public void delete(K key) {
        root = delete(root, key);
    }

    private Node delete(Node current, K key) {
        if (current == null) {
            return null;
        }

        int cmp = key.compareTo(current.key);
        if(cmp<0){
            current.left=delete(current.left, key);
        } else if (cmp>0) {
            current.right=delete(current.right, key);
        }
        else{
            if(current.left==null && current.right==null){
                return null;
            }
            if(current.left==null){
                return current.right;
            }
            if(current.right==null){
                return current.left;
            }
            Node minRight=findMin(current.right);
            current.key=minRight.key;
            current.val= minRight.val;
            current.right=deleteMin(current.right);

        }
        current.size=1+size(current.right)+size(current.left);
        return current;
    }
    private Node findMin(Node node){
        if(node.left==null){
            return node;
        }
        return findMin(node.left);
    }
    private Node deleteMin(Node node){
        if(node.left==null){
            return node.right;
        }
        node.left=deleteMin(node.left);
        return node;
    }

    private int size(Node node){
        return node==null ? 0 : node.size;
    }
    public int size(){
        return size(root);
    }



    private void inOrderTraversal(Node node, List<Map.Entry<K, V>> entries) {
        if (node != null) {
            inOrderTraversal(node.left, entries);
            entries.add(new SimpleEntry<>(node.key, node.val));
            inOrderTraversal(node.right, entries);
        }
    }
    public Node find(K key){
        return ffind(root, key);
    }
    private Node ffind(Node current, K key){
        if(current==null || current.key.equals(key)){
            return current;
        }
        int c= key.compareTo(current.key);
        if(c<0){
            return ffind(current.left, key);
        }
        else {
            return ffind(current.right, key );
        }

    }
}
