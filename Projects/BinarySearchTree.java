package Projects;

public class BinarySearchTree<E extends Comparable<? super E>> extends BinaryTree<E> {
    public void insert(E data){
        Node<E> temp = new Node<E>(data);
        root = insert(root, temp);
    }
    private Node<E> insert(Node<E> curr, Node<E> node){
        if(curr == null){
            return curr;
        }else{
            if(curr.compareTo(node) > 0){
                insert(curr.right, node);
            }else{
                insert(curr.left, node);
            }
        }
    }
    public void remove(E data){

    }
    private void remove(Node<E> curr, Node<E> target){

    }
}
