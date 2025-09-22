import java.util.Scanner;

public class Editor {
    public static void main(String[] args) {
        MyStack<String> acciones = new MyStack<>();
        MyStack<String> deshechas = new MyStack<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Escribir texto");
            System.out.println("2. Deshacer (Undo)");
            System.out.println("3. Rehacer (Redo)");
            System.out.println("4. Mostrar texto actual");
            System.out.println("5. Salir");
            System.out.print("Elige opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Escribe una línea: ");
                    String linea = sc.nextLine();
                    acciones.push(linea);
                    deshechas = new MyStack<>(); // Limpia redo
                    System.out.println("Línea añadida.");
                }
                case 2 -> {
                    String ultima = acciones.pop();
                    if (ultima != null) {
                        deshechas.push(ultima);
                        System.out.println("Deshecho: " + ultima);
                    } else {
                        System.out.println("Nada que deshacer.");
                    }
                }
                case 3 -> {
                    String rehacer = deshechas.pop();
                    if (rehacer != null) {
                        acciones.push(rehacer);
                        System.out.println("Rehecho: " + rehacer);
                    } else {
                        System.out.println("Nada que rehacer.");
                    }
                }
                case 4 -> {
                    System.out.println("Texto actual (de arriba hacia abajo):");
                    if (acciones.isEmpty()) {
                        System.out.println("[Vacío]");
                    } else {
                        MyStack<String> temp = new MyStack<>();
                        while (!acciones.isEmpty()) {
                            String linea = acciones.pop();
                            System.out.println(linea);
                            temp.push(linea);
                        }
                        while (!temp.isEmpty()) {
                            acciones.push(temp.pop());
                        }
                    }
                }
                case 5 -> {
                    System.out.println("Saliendo...");
                    return;
                }
                default -> System.out.println("Opción inválida.");
            }
        }
    }
}
