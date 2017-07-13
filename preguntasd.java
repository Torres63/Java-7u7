package preguntasd;
import java.util.Scanner;

public class preguntasd {


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int respuesta;
       
        System.out.println("Responda a la pregunta");
        System.out.println("Que bimestre estamos");
        respuesta = sc.nextInt();
        
        
            if(respuesta==3)
            {
                System.out.println("Respuesta correcta");
                      
               
            }
                
            else
            {
                System.out.println("Respuesta incorrecta");
            }
            
            
            
        System.out.println("Cual fue el bimestre pasado");
            
        Scanner sf;
        sf = new Scanner(System.in);
        int respuesta2;
        respuesta2 = sc.nextInt();
            if(respuesta2==2){
                System.out.println("respuesta correcta");
                
            }
               
            else{
                System.out.println("respuesta incorrecta");
            }    
        
    }
    
}
