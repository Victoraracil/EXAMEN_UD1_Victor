import java.util.InputMismatchException;
import java.util.Scanner;

public class EXAMEN {
    public void ejercicio1(){

        int num = 0;
        System.out.println("Introduce un nuemero?"); //Se define la variable num y se pregunta el numero
        Scanner entrada = new Scanner(System.in);

        while (num == 0) { //bucle para controlar que se introduzcan letras (try-catch) y seguir pidiendo un numero
            try {
                num = entrada.nextInt();
            } catch (NumberFormatException | InputMismatchException | ArithmeticException e) {
                System.out.println("ERROR: introduce un numero valido "); //Error si no se introduce un numero
                entrada.nextLine();
            }
        }
        if (num > 0){ //Comparacion para saber si el numero es positivo o negativo y asi sacar su valor absoluto
            System.out.println("El valor absoluto de es " + num);
        }else {
            num = num * (-1);
            System.out.println("El valor absoluto es " + num);
        }

    }

    public void ejercicio2(){

        float par1 = 0; //ancho de la pared
        float par2 = 0;//largo de la pared
        float azu1 = 0;//ancho del azulejo
        float azu2 = 0;//largo del azulejo
        System.out.println("Introduce tu nombre: "); //Se definen las variables y se pregunta el nombre
        Scanner entrada = new Scanner(System.in);

        String nombre = entrada.next();
        System.out.println("La obra de " + nombre);

        while (par1 == 0 || par2 == 0 || azu1 == 0 || azu2 == 0 ){ //control para no introducir letras y pedir un valor valido
            try{

                System.out.println("Introduce el ancho de la pared:"); //PARED
                par1 = entrada.nextInt();
                System.out.println("Introduce el largo de la pared:");
                par2 = entrada.nextFloat();

                System.out.println("Introduce el ancho del azulejo:");//AZULEJO
                azu1 = entrada.nextInt();
                System.out.println("Introduce el largo del azulejo:");
                azu2 = entrada.nextFloat();

            }catch (NumberFormatException | InputMismatchException | ArithmeticException e) {
                System.out.println("ERROR: introduce un numero valido "); //Error si no se introduce un numero
                entrada.nextLine();
            }
        }

        if (azu1 == azu2){
            System.out.println("ERROR: El azulejo no puede ser cuadrado");//ERROR de azulejo cuadrado
        }else{

            par1 = par1 * par2; //Calcula para comprobar si el azulejo es mas grande que la pared
            azu1 = azu1 * azu2;
            if (par1 < azu1){
                System.out.println("ERROR: El azulejo no puede ser mas grande que la pared"); //ERROR de azulejo mas grande que pared

            }else{
                float rest = par1 / azu1; // resultado de los azulejos necesarios
                System.out.println("Se necesitan " + rest + " azulejos");
            }
        }

    }
}

