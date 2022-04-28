import java.util.Scanner;

public class Ejercicios4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("--positivo/negativo/0--");//esto es para distinguir los ejercicios en consola

        System.out.println("Por favor ingrese un número negativo positivo o 0");
        Float numeroif = entrada.nextFloat();

        if (numeroif == 0) {
            System.out.println("El " + numeroif +" es 0");
        } else if (numeroif < 0) {
            System.out.println("El " + numeroif +" es Negativo");
        } else {
            System.out.println("El " + numeroif +" es Positivo");
        }

        System.out.println("--while++--"); //esto es para distinguir los ejercicios en consola

        System.out.println("Por favor ingrese un número entero inferior a 3");
        int numeroWhile = entrada.nextInt();

        while (numeroWhile < 3) {
            System.out.println("númeroWhile: " + numeroWhile);
            numeroWhile = numeroWhile + 1;
        }

        System.out.println("--doWhile++ una vez--");//esto es para distinguir los ejercicios en consola

        System.out.println("Por favor ingrese un número entero");
        int numeroWhile2 = entrada.nextInt();

        do {
            numeroWhile2 = numeroWhile2 + 1;
            System.out.println("El numeroWhile2 es ahora :" + numeroWhile2);
        } while (numeroWhile2 < numeroWhile2++);

        System.out.println("--For--");//esto es para distinguir los ejercicios en consola

        int numeroFor = 0;

        for (int i=0; numeroFor <= 3; i++){
            System.out.println("numeroFor: " + numeroFor);
            numeroFor = numeroFor +1;
        }

        System.out.println("--switch--");//esto es para distinguir los ejercicios en consola

        System.out.println("Por favor ingrese una estación del año en minusculas");
        var estacion = entrada.next();

        switch (estacion){
            case"primavera":
                System.out.println("es primavera");
                break;
            case"verano":
                System.out.println("es verano");
                break;
            case"otoño":
                System.out.println("es otoño");
                break;
            case"invierno":
                System.out.println("es invierno");
                break;
            default:
                System.out.println("Esto no es una estación del año");
        }
    }
}