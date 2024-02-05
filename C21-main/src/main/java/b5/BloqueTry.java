package b5;


import java.util.InputMismatchException;
import java.util.Scanner;

public class BloqueTry {

    public static void main(String[] args) {

    try {
        int[] a = new int[2];
        a[30]=2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero= scanner.nextInt();

        System.out.println(numero*numero);
    }catch (ArithmeticException e){
         System.out.println("error : Divicion por 0 "+e);
    }catch (InputMismatchException ex){
        System.out.println("error : numero no valido "+ex);
    }catch (RuntimeException ex2){
        System.out.println("error :No sabemos que paso pero paso "+ex2);
    }


        System.out.println("la aplicacion termino ok.");

    }


}
