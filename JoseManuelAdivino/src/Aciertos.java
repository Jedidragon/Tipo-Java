import java.util.Scanner;

/**
 * Esta clase muestra adivinar un numero
 * @author Jose Manuel
 * @version 27/01/2018
 * 
 * 
 */
public class Aciertos {

	//Metodo que genera un numero entre el 1 y 500
    public static void main(String[] args) {
        int n = 0,cont = 0;
        int x = (int) (500 *Math.random());
        //System.out.print(x);
        Scanner sc = new Scanner(System.in);
        do {
        	//metodo que te permite poner el numero por teclado
            System.out.print("\nIntroduce el valor de X: ");
            n = sc.nextInt();
            if (n > x) {
                System.out.print("Te pasaste Amigo");
            } else if (n < x){
                System.out.print("Casi cerca ...");
            }
            cont++;
        } while (n != x);
        //metodo de salida acertando el numero y saca los intentos
        System.out.print("Exelente!!! Haz acertado , No. de intentos: "+cont );
        sc.close();
    }
}
