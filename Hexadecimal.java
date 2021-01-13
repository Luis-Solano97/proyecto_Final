/*
 Programa decimal a binario
 Marin Solano Luis Andrés
 Rodríguez Cedeño Aldo
 */
import java.util.Scanner;
 
public class Hexadecimal {
 
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número decimal: ");
        int decimal = teclado.nextInt();
        teclado.close();
          
        String hexadecimal = Integer.toHexString(decimal);
        System.out.printf("Hexadecimal: %s \n", hexadecimal);
    }
}

