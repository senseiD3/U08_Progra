package a04;

public interface Escaneable {
    default void escanear(String documento){
        System.out.println("Escaneando...");
    }
}
