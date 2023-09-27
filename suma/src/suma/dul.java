package suma;
import java.util.Scanner;
public class dul {
   public static void main(String[] args) {
       Scanner leer=new Scanner (System.in);
       float num1,num2,rest;
       System.out.print("Ingresa el primer valor");
       num1=leer.nextFloat();
       System.out.print("Ingresa el segundo valor");
       num2=leer.nextFloat();
       rest=num1+num2;
       System.out.print("El resultado de la suma es: ");
    }
    
}
