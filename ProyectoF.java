import java.util.Scanner;
public class ProyectoF{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int limite=0;
    int opcion;
    int numero;
    int tabla1 = 0;
    int resultado;
    int limiteL,a,b,c;
    int divisor;
    int binario;



    a=0;
    b=1;
    c=0;
    System.out.println("----------------------------------------------------------------------");
    System.out.println("                         Elija su opcion                              ");
    System.out.println("----------------------------------------------------------------------");
    System.out.println("  Para opcion 1, escriba -1- tabla de multiplicar while");
    System.out.println("");
    System.out.println("  Para opcion 2, escriba -2- tabla de multiplicar  do while");
    System.out.println("");
    System.out.println("  Para opcion 3, escriba -3- tabla de multiplicar limite while");
    System.out.println("");
    System.out.println("  Para opcion 4, escriba -4- tabla de multiplicar limite do while");
    System.out.println("");
    System.out.println("  Para opcion 5, escriba -5- Fibonacci while");
    System.out.println("");
    System.out.println("  Para opcion 6, escriba -6- Fibonacci do while");
    System.out.println("");
    System.out.println("  Para opcion 7, escriba -7- Conversor decimal a binario");
    System.out.println("  Salir -8-  ");
    System.out.println("");
    System.out.println("                         Elija su opcion                            ");
    opcion=sc.nextInt();
    if(opcion==8){
      System.exit(0);
    }


    if(opcion<=4){
      System.out.println("Ingresa tu numero");
      numero=sc.nextInt();
      System.out.println("=======================");
      if(numero==0){
        System.out.println("Ingresa un numero valido >:V");
      }

    switch (opcion) {
      case 1:
        while (true) {
          tabla1++;
          resultado = numero*tabla1;
          System.out.println(numero + "x" + tabla1 + "=" + resultado);

          if(tabla1<=10){
            break;
          }
        }

      case 2:

        do {
          tabla1++;
          resultado = numero*tabla1;
          System.out.println(numero + "x" + tabla1 + "=" + resultado);
        } while (tabla1<=9);
        break;

      case 3:
        System.out.println("Ingresa el limite que desee 7u7");
        limite=sc.nextInt();
          while (true) {
            tabla1++;
            resultado = numero*tabla1;
            System.out.println(numero + "x" + tabla1 + "=" + resultado);
            if(tabla1==limite){
              break;
            }

        }break;


      case 4:
        System.out.println("Ingresa el limite que desee 7u7");
        limite=sc.nextInt();
        do{
          tabla1++;
          resultado = numero*tabla1;
          System.out.println(numero + "x" + tabla1 + "=" + resultado);
        } while (tabla1<limite);
      break;

    }
  }
    else if((opcion==6)||(opcion==5)||(opcion==7)){

      switch (opcion) {

        case 5:


        System.out.println("Ingresa el limite de la serie Fibonacci");

        limiteL=sc.nextInt();
        System.out.println("=====================================");
        if (limiteL>1){

          while(true){

            a=b;
            b=c;
            c=a+b;
            limite++;
            System.out.println(c);
            if(limite==limiteL){
              break;
            }
        }break;
      }
      else{
        System.out.println("La operacion no se puede realizar");
        break;
      }
        case 6:

          System.out.println("Ingresa el limite de la serie Fibonacci");

          limiteL=sc.nextInt();
          if (limiteL>1) {


            System.out.println("=====================================");
            do {
              limite++;
              a=b;
              b=c;
              c=a+b;


              System.out.println(c);
        } while (limite<limiteL);
          break;
        }
      else{
        System.out.println("La operacion no se puede ejecutar");
        break;
      }
      case 7:

        System.out.println("Ingresa el numero que desea convertir");
        numero=sc.nextInt();
        if(numero<=0){
          System.out.println("Ingrese un numero diferente a cero y que sea positivo :)");
        }
        else{
        System.out.println("============================");

        while (true) {
          binario=numero%2;
          divisor=numero/2;
          numero=divisor;
          System.out.print(binario);
          if(divisor==0){
            break;
          }
        }

      }



      }



    }
    else{
      System.out.println("Ingrese un numero valido porfavor >:V");
    }
  }
}
