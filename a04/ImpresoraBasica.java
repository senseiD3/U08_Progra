package a04;

public class ImpresoraBasica implements Imprimible{
    String nombre;
    
    ImpresoraBasica(String nombre){
        this.nombre = nombre;
    }
    
    @Override
    public void imprimir(String documento){
        System.out.println("Imprimiendo en la impresora basica: " + nombre + "El documento: " + documento);
    }
}
