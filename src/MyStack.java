// Implementación genérica de pila
public class MyStack<T> {
    private java.util.LinkedList<T> stack = new java.util.LinkedList<>();

    public void push(T item) {
        stack.addFirst(item);
    }

    public T pop() {
        if (isEmpty()) return null;
        return stack.removeFirst();
    }

    public T peek() {
        if (isEmpty()) return null;
        return stack.getFirst();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
