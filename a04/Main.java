package a04;

import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        
        ImpresoraBasica i1 = new ImpresoraBasica("ImpBasic");
        ImpresoraAvanzada i2 = new ImpresoraAvanzada("ImpAdvance");
        
        i1.imprimir(sc.nextLine());
        i2.imprimir(sc.nextLine());
        i2.escanear(sc.nextLine());
    }
}
