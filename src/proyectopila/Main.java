package proyectopila;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int opcion = 0;
        String data;

        Pila pila = new Pila(10); // Este valor puede cambiarse (tamaño max de la pila)

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Menú principal\n\n"
                        + "1. Añadir libros\n"
                        + "2. Ver libros añadidos\n"
                        + "3. Retirar último libro añadido\n"
                        + "4. Buscar un libro\n"
                        + "5. Salir\n\n"));

                switch (opcion) {
                    case 1:
                        data = JOptionPane.showInputDialog("ingrese el nombre del libro");
                        pila.push(data);
                        break;

                    case 2:
                        if (pila.top > 0) {
                            JOptionPane.showMessageDialog(null, pila.verLibros());
                        }else{
                            JOptionPane.showMessageDialog(null, "No se ha añadido ningún libro");
                        }
                        break;

                    case 3:
                        if(pila.top>0){
                            JOptionPane.showMessageDialog(null, "Se ha retirado el libro: "+pila.pop());
                        }else{
                            JOptionPane.showMessageDialog(null, "No se ha añadido ningún libro");
                        }
                        
                        break;

                    case 4:
                        if (pila.top > 0) {
                            data = JOptionPane.showInputDialog("libro a buscar");
                            if(pila.buscarLibro(data)>=0){
                                JOptionPane.showMessageDialog(null, "Se ha encontrado: \n\n" + pila.arr[pila.buscarLibro(data)]);
                            }else{
                                JOptionPane.showMessageDialog(null, "No se ha encontrado el libro");
                            }
                        }else{
                            JOptionPane.showMessageDialog(null, "No se ha añadido ningún libro");
                        }                        
                        break;

                    case 5:
                        opcion=5;
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "opcion no disponible");
                        break;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor ingresar un valor válido");
            }

        } while (opcion != 5);

    }

}
