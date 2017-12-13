package visual;

import java.util.Scanner;


public class Pantalla {
    
    
    
    public Pantalla(){
        Scanner sc = new Scanner(System.in);
        int choc,ddl,frut,promo;
    
        System.out.println("Ingrese La Cantidad De Alfajores De Chocolate Hechos Hoy:");
        choc = sc.nextInt();
        System.out.println("Ingrese La Cantidad De Alfajores De Dulce De Leche Hechos Hoy:");
        ddl = sc.nextInt();
        System.out.println("Ingrese La Cantidad De Alfajores De Frutas Hechos Hoy:");
        frut = sc.nextInt();
    
        promo = cantDePromo(choc,ddl,frut);
        
        System.out.println("La Cantidad De Cajas Son:");
        System.out.println(promo);
    
    }
    
    
    int cantDePromo(int choc,int ddl,int frut){
        int cajas,alfajores;
         
        alfajores = choc+ddl+frut;
        cajas= alfajores/6;
         
         
        return cajas;
        
    }
}
