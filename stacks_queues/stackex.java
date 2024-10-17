package stacks_queues;
//import java.util.Stack;
import java.util.Random;
import java.util.Iterator;
public class stackex {
    public static void main(String[] args) {
        Stack<Integer> stack = new AStack<Integer>();
        System.out.println(stack);

        int num = args.length == 1 ? Integer.parseInt(args[0]) : 11;
        Random rand = new Random();
        for(int i =0;i<num;i++){
            int n = rand.nextInt(num);
            stack.push(n);
            System.out.println(n);
            //System.out.println();
        }
        for(Integer k : stack){
            System.out.println(k + "");
        }
    }
}
interface Stack<E> extends Iterable<E>{
    E pop();
    void push(E data);
}
class AStack<E> implements Stack<E>{
    private class StackIterator<E> implements Iterator<E>{
        public boolean hasNext(){
            return false;
        }
        public E next(){
            return null;
        }
        public Iterator<E> iterator(){
            return new StackIterator<E>();
        }
    }
    public Iterator<E> iterator(){
        return null;
    }
    private Object[] stack = new Object[10];
    private int top;
    public E pop(){
        E temp = null;
        if(stack.length > 10 && top <= stack.length / 3){
            shrink();
        }
        if(top > 0){
            temp = (E)stack[--top];
        }
        return temp;
    }
    public void push(E data){
        if (top >= stack.length){
            grow();
        }
        if (top < stack.length){
            stack[top++] = data;
        }
    }
    private void grow(){
        System.out.println("grow");
        Object[] temp = new Object[stack.length*2];
        for(int i = 0; i<stack.length ; i++){
            temp[i] = stack[i];
        }
        stack = temp;
    }
    private void shrink(){
        System.out.println("shrink");
        Object[] temp = new Object[stack.length/2];
        for(int i = 0; i<temp.length ; i++){
            temp[i] = stack[i];
        }
        stack = temp;
    }   
}
/* 
class RStack<E> implements Stack<E>{
    public Iterator<E> iterator(){
        return new Iterator<E>() {
            public boolean hasNext(){
                return curr != null;
            }
            public E next(){
                E temp = curr.data;
                curr = curr.next;
                return temp;
            }
            private Node<E> curr = head;
        };
    }
    private class Node<t>{
        private T data;
        private Node<T> next;
        private Node(t data){
            this.data = data;
        }
    }
    private Node<E> head;
    public E pop(){
        E temp = null;
        if(head != null){
            temp = head.data;
            head = head.next;
        }
        return temp;
    }
    public void push(E data){
        Node<E> temp = new Node<E>(data);
        temp.next = head;
        head = temp;
    }

}
*/