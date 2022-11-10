/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package genericos;

/**
 * Clase que crea y utiliza objetos tipo ClaseGenerica
 * @author juan
 */
public class TestingClaseGenerica {
    
    public static void main(String[] args) {
        
        
        //Declarar un objeto de la clase genérica
        ClaseGenerica<String> objeto1;
        ClaseGenerica<Integer> objeto2;
        //Declarar un objeto de la clase generica tipo cancion
        ClaseGenerica<Cancion>objeto3;
        
        //construir el objeto1
        objeto1 = new ClaseGenerica<>("Ginger");
        System.out.println("El contenido del objeto  es: " + objeto1.getObjeto());
        objeto1.getType();
        
        
        // construir y usar el objeto2
        objeto2= new ClaseGenerica<>(100);
        System.out.println("El contenido del objeto 2 es: " + objeto2.getObjeto());
        objeto2.getType();
        
        
        //Construir un objeto tipo cancion
        Cancion unaCancion = new Cancion("In the end -", "Linkin Park");
        objeto3= new ClaseGenerica<>(unaCancion);
        System.out.println("El contenido del objeto 3 es: " + objeto3.getObjeto());
        objeto3.getType();
        
        //Recuperando el contenido del objeto3 que tambien es un objeto.
        Cancion otroObjeto = objeto3.getObjeto();
        System.out.println("Informacion de otroObjeto: ");
        System.out.println(otroObjeto.getNombre() + " " + otroObjeto.getInterprete());
        
        
    }
}
