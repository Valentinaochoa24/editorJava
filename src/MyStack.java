/**
 * Clase MyStack
 * Implementa manualmente una estructura de datos tipo Pila (Stack).
 * Permite almacenar cadenas de texto y realizar operaciones básicas:
 * push(), pop(), peek(), isEmpty().
 */

public class MyStack<T> {
    // Usamos LinkedList internamente para manejar la pila
    private java.util.LinkedList<T> stack = new java.util.LinkedList<>();

    // Inserta un elemento en la parte superior de la pila
    public void push(T item) {
        stack.addFirst(item);
    }

    // Elimina y devuelve el elemento superior de la pila
    // Si la pila está vacía, retorna null
    public T pop() {
        if (isEmpty()) return null;
        return stack.removeFirst();
    }

    // Devuelve el elemento superior sin eliminarlo
    // Si la pila está vacía, retorna null
    public T peek() {
        if (isEmpty()) return null;
        return stack.getFirst();
    }

    // Verifica si la pila está vacía
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
