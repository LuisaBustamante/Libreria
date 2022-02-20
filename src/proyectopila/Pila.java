package proyectopila;

public class Pila {

    String arr[];
    int maxSize; // Tamaño máximo de la pila
    int top;  // Primer elemento de la pila

    // Método oonstructor
    public Pila(int n) {
        maxSize = n;
        arr = new String[maxSize];
        top = 0;
    }

    // Método para comprobar si la pila está vacía, devuelve true si está vacío
    // false si no está vacío
    public boolean empty() {
        if (top == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Método para ingresar datos a la pila
    public void push(String str) {
        if (top < maxSize) {
            arr[top] = str;
            top++;
        }
    }

    // Método para buscar un libro por su nombre, devuelve su posición en el array
    //equalsIgnoreCase compara las dos cadenas dadas sobre la base del contenido de la cadena independientemente del caso de la cadena
    public int buscarLibro(String nombre) {
        for (int i = 0; i < top; i++) {
            if (nombre.equalsIgnoreCase(arr[i])) {
                return i;
            }
        }
        return -1;
    }

    // Método para ver la pila de libros, devuelve un String con los datos
    public String verLibros() {
        String str = "";
        for (int i = top - 1; i >= 0; i--) {
            str += arr[i] + "\n";
        }
        return str;

    }

    // Método para devolver el último dato en la pila
    public String peek() {
        if (top > 0) {
            return arr[top - 1];
        } else {
            return null;
        }
    }

    // Método para devolver el útimo dato y eliminarlo
    public String pop() {
        String temp = null;
            temp = arr[top - 1];
            arr[top - 1] = null;
            top--;
        
        return temp;
    }

   /*
    public void eliminarLibro(int pos) {
        if (pos >= top) {
            pop();
        } else {
            arr[pos] = null;
            for (int i = 0; i < top; i++) {
                arr[i] = arr[i];
            }
        }

        top--;

    }
    */
}