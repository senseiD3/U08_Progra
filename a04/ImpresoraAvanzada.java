package a04;

public class ImpresoraAvanzada implements Multifuncion{
    String nombre;
    
    ImpresoraAvanzada(String nombre){
        this.nombre = nombre;
    }
    
    @Override
    public void imprimir(String documento){
        System.out.println("Imprimiendo en la impresora avazada: " + nombre + "El documento: " + documento);
    }
    
    @Override
    public void escanear(String documento){
        System.out.println("Escaneando en la impresora avazada: " + nombre + "El documento: " + documento);
    }
}
