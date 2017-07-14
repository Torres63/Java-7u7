package primos;
import java.util.Scanner; 
public class primos {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        int numero, cont;
        cont=0;
        System.out.println("Escribe un numero");
        numero = scn.nextInt();
        for (int a=1; a<=n; a++) {
            if (n % a == 0){
                cont = cont + 1;
            }
        }
        if (cont==2)
          {
          System.out.println("Primo :V");
          }

        else
          {
          System.out.println("No Primo :V");
          }
    }
}
