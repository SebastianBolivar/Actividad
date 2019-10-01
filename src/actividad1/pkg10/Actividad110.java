1.
import javax.swing.JOptionPane;

public class Excepciones {

    public static void main(String[] args) {
        operacion();
    }
    public static void operacion(){
        int resultado;
        try {
        int num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1re numero"));
        int num1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese 2do numero"));
        if(num<10 ){
        resultado=num/num1;
        JOptionPane.showMessageDialog(null,"Resultado: "+ resultado);
        }
        else{
        JOptionPane.showMessageDialog(null,"El numero es mayor a 10");
        }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Ingreso letras: "+e);
        }
        catch(ArithmeticException ex){
        JOptionPane.showMessageDialog(null,"division por 0"+ ex.getMessage());
        }
    }
   
}

2.
public class Producto implements Comparable<Producto> {

    private String nombre;
    private int cantidad;

//constructor de la clase producto
    public Producto(String s, int i) {
        nombre = s;
        cantidad = i;
    }
//mÃ©todo de la clase object

    public String toString() {
        return ("Nombre: " + nombre + " Cantidad: " + cantidad);
    }

//mÃ©todos de encapsulamiento
    public String getNombre() {
        return this.nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public int compareTo(Producto o) {
        if (o.getCantidad()>=cantidad) {
            return -1;

        } else if(o.getCantidad()<cantidad){
            return 0;
        }else{
        return 1;
        }
               
    }

}

2.1
public class Mercado {

    public static void main(String args[]) {
// Se definen 5 instancias con el constructor de la clase Producto.
        Producto gaseosa = new Producto("gaseosa", 6);
        Producto paquetes = new Producto("paquetes", 2);
        Producto manzanas = new Producto("manzanas", 5);
        Producto lentejas = new Producto("lentejas", 2);
        Producto aceite = new Producto("aceite", 2);

// Definir un ArrayList llamado lista
        ArrayList lista = new ArrayList();

// Agregamos estas instancias al ArrayList con el mÃ©todo add
        lista.add(gaseosa);
        lista.add(paquetes);
        lista.add(manzanas);
        lista.add(lentejas);
// Las listas inician en 0 (Cero)
// Indica el Ã­ndice de inserciÃ³n
        lista.add(1, aceite);
        lista.add(aceite);

// Mostramos el nÃºmero de objetos de la colecciÃ³n mediante el mÃ©todo size.
        System.out.println(" Lista del mercado con " + lista.size()
                + " productos");

// Se declara una instancia Iterator it la cual facilita recorrer los objetos, para extraer e imprimir sus valores
        Iterator it = lista.iterator();
//verifica si existe otro elemento con el mÃ©todo hasNext()
        Collections.sort(lista);
        lista.forEach((object) -> {
            System.out.println(object);
        }; 
while (it.hasNext()) {
        Object objeto = it.next();
        Producto producto = (Producto) objeto;
        System.out.println(producto);
        }

// Eliminar elemento de ArrayList. Se elimina el objeto con Ã­ndice 2 con el mÃ©todo remove. Se muestra la nueva lista.
        lista.remove(2);
        System.out.println(" Lista del mercado con " + lista.size() + " productos");

// Definir Iterator para extraer e imprimir valores
        Iterator it2 = lista.iterator();
        while (it2.hasNext()) {
            Producto producto = (Producto) it2.next();
            System.out.println(producto);
        }

// Eliminar todos los valores del ArrayList, Se eliminan todos los objetos mediante el mÃ©todo clear.
        lista.clear();
        System.out.println(" Lista del mercado con " + lista.size() + " productos");
    }
}
