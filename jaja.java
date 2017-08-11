package jaja;
import java.util.Scanner;

public class jaja{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingresa tres numeros");
        Scanner sc = new Scanner(System.in);
        Scanner scb = new Scanner(System.in);
        Scanner scc = new Scanner(System.in);
        
        
        int a,b,c;
        a = sc.nextInt(); 
    
        b = scb.nextInt();
      
        c = scc.nextInt();
                
        if (a>b){
            if (a>c){
                System.out.println("el mayor es "+a);
              }
           
            
                
            }
        else {
         if (b>c){
             System.out.println("el mayor es "+b);
         }   
        } 
        if (c>b){
            if (c>a){
                System.out.println("el mayor es "+c);
            }
        }
    }
    
}
