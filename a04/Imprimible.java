package a04;

public interface Imprimible {
    default void imprimir(String documento){
        System.out.println("Imprimiendo...");
    }
}
