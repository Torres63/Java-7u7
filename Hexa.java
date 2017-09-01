import java.util.Scanner;
public class Hexa{
  public static void main(String args[]){
    System.out.println("-----------------------------------------");
    System.out.println("| Ingrese el numero que desea convertir |");
    System.out.println("-----------------------------------------");
    int numero,division=0,mod=0,mod1=0;

    Scanner sc=new Scanner(System.in);
    numero=sc.nextInt();
    System.out.println("-----------------------------------------------");


    if((numero<=15)&&(numero>=10)){
      switch (numero) {

        case 10:
          System.out.println("A");d
            break;
        case 11:
          System.out.println("B");
          break;
        case 12:
          System.out.println("C");
          break;
        case 13:
          System.out.println("D");
          break;
        case 14:
          System.out.println("E");
          break;

        case 15:
          System.out.println("F");
          break;


      }

    }
    else{

      division=numero/16;
      mod=numero%16;
      mod1=mod;
      if((mod1<=15)&&(mod1>=10)){

        switch (mod1) {

          case 10:
            System.out.println("A");
            break;

          case 11:
            System.out.println("B");
            break;

          case 12:
            System.out.println("C");
            break;

          case 13:
            System.out.println("D");
            break;

          case 14:
            System.out.println("E");
            break;

          case 15:
            System.out.println("F");
            break;


        }

      }
      else{
        if(mod<10){
          System.out.println(mod1);
        }
      }
      while ((division>=15)||(division<=15)){
        numero=division;
        division=numero/16;
        mod=numero%16;
        if((mod<=15)&&(mod>=10)){

          switch (mod) {

            case 10:
              System.out.println("A");
              break;
            case 11:
              System.out.println("B");
              break;
            case 12:
              System.out.println("C");
              break;
            case 13:
              System.out.println("D");
              break;
            case 14:
              System.out.println("E");
              break;

            case 15:
              System.out.println("F");
              break;


          }


        }
        else{
            System.out.println(mod);
        }
        if((division>=10)&&(division<=15)){

          switch (division) {

            case 10:
              System.out.println("A");
              break;
            case 11:
              System.out.println("B");
              break;
            case 12:
              System.out.println("C");
              break;
            case 13:
              System.out.println("D");
              break;
            case 14:
              System.out.println("E");
              break;

            case 15:
              System.out.println("F");
              break;


            }
            break;
        }
        else{
          if(division<10){
          System.out.println(division);
          break;
          }
        }

      }







      }
    }
}
