package Projects;
import java.util.Iterator;

import recursive_functions.recursivestr;

/*
*
*  SortedList.java
*
*/

public class SortedList<E extends Comparable<? super E>> extends List<E> {
    public Iterator<E> iterator() {
        return new Iterator<E>() {
        public boolean hasNext() {
            return curr != null;
        }
        public E next() {
            E temp = curr.data;
            curr = curr.next;
            return temp;
        }
        private Node<E> curr = head;
        };
    }
    public void insert(E data) {
        Node<E> key = new Node<E>(data);
        head = insert(key, head);
    }
    private Node<E> insert(Node<E> key,Node<E> temp){
        if(temp == null || key.data.compareTo(temp.data) <0){
            key.next = temp;
            return key;
        }else{
            temp.next = insert(key,temp.next);
            return temp;
        }
    }
    public void remove(E data) {
        Node<E> temp = head;
        if(temp !=null){
            if(data.compareTo(temp.data)==0){
                head = head.next;
                return;
            }
            if(data.compareTo(temp.data)>0){
                remove(data,temp.next);
            }
        }
    }
    private void remove(E data,Node<E> temp){
        if(temp != null){
            if(data.compareTo(temp.data)==0){
                head = head.next;
                return;
            }
            remove(data, temp.next);
        }
        return;
    }
    public E retrieve(int index) {
        Node<E> temp = head;
        if(temp.data != null){
            if(index == 0){
                return temp.data;
            }else if(index<0){
                return null;
            }
            return retrieve(--index,temp.next);
        }         
        return null;  
    }
    private E retrieve(int index,Node<E> temp){
        if(index==0){
            return temp.data;
        }
        if(temp.next != null){
            return retrieve(--index,temp.next);
        }
        return null;
    }
    public boolean search(E data) {
        Node<E> temp = head;
        if(data != null){
            if(data.compareTo(temp.data) == 0){
                return true;
            }           
            return search(data,temp.next);      
        }
        return false;
    }
    private boolean search(E data,Node<E> temp){
        if(temp != null){
            if(data.compareTo(temp.data)==0){
                return true;
            }
            return search(data, temp.next);
        }
        return false;
    }
    private Node<E> reverseList(Node<E> curr){
        if(curr.next == null || curr == null){
            return curr;
        }
        Node<E> newHead = reverseList(curr.next);
        curr.next.next = curr;
        curr.next = null;
        return newHead;
    }
    private void returnListBackwards(Node<E> curr){
        if(curr == null){
            return;
        }
        returnListBackwards(curr.next);
        System.out.print(curr);
    }
}  
