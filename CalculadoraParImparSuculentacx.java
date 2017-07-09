package CalculadoraParImparSuculentacx;

import java.util.Scanner;

public class CalculadoraParImparSuculentacx {

    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        System.out.println("tu numero");
        int numero=sc.nextInt();
        if(numero%2==0){
            
            System.out.println("Numero es par");
          
        }
        
        else{
            System.out.println("es impar");
        }
    }
    
}
