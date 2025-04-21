import java.util.Scanner;

public class Serie2 {
    public static void main(String[] args){
        Scanner scann = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("Bienvenido a la Calculadora.");
        System.out.println("ADVERTENCIA: Asegurate de ingresar valores numericos para proceder. :)");
        System.out.println(" ");
        System.out.println("¿Que operacion deseas realizar?");
        System.out.println(" ");
        System.out.println("***********************");
        System.out.println("* MENU DE CALCULADORA *");
        System.out.println("***********************");
        System.out.println(" ");
        System.out.println("1. Suma.");
        System.out.println("2. Resta. ");
        System.out.println("3. Multiplicación.");
        System.out.println("4. División.");
        System.out.println("5. Salir del programa.");
        
        int opcion = scann.nextInt();
        double Num1 = 0;
        double Num2 = 0;
        double Resultado;
        switch (opcion) {
            case 1:
            try {
                System.out.print("Por favor ingresa el primer numero: ");
                Num1 = scann.nextDouble();
                System.out.print("Por favor ingresa el segundo numero: ");
                Num2 = scann.nextDouble();
                Resultado = Num1 + Num2;

                System.out.println("El resultado de la suma es: " + Resultado);
            }
                catch (Exception ex) {
                    System.out.println("Ingresar un valor numerico.");
                }
                
                break;
            case 2:
            try {
                System.out.print("Por favor ingresa el primer numero: ");
                Num1 = scann.nextDouble();
                System.out.print("Por favor ingresa el segundo numero: ");
                Num2 = scann.nextDouble();
                Resultado = Num1 - Num2;

                System.out.println("El resultado de la resta es: " + Resultado);
            }
                catch (Exception ex){
                    System.out.println("Ingresar un valor numerico");
                }
                break;
        
            case 3:
            try {
                System.out.print("Por favor ingresa el primer numero: ");
                Num1 = scann.nextDouble();
                System.out.print("Por favor ingresa el segundo numero: ");
                Num2 = scann.nextDouble();
                Resultado = Num1 * Num2;

                System.out.println("El resultado de la multiplicación es: " + Resultado);
            }
                catch (Exception ex){
                    System.out.println("Ingresar un valor numerico");
                }
                break;

            case 4:
            try {
                    System.out.print("Por favor ingresa el primer numero: ");
                    Num1 = scann.nextDouble();
                    System.out.print("Por favor ingresa el segundo numero: ");
                    Num2 = scann.nextDouble();
                    Resultado = Num1 / Num2;
    
                    System.out.println("El resultado de la División es: " + Resultado);
            }
                catch (Exception ex){
                    System.out.println("Ingresar un valor numerico");
                }
                break;

            case 5:
            System.out.println("Gracias por utilizar la calculadora, ¡Hasta Pronto!");

                break;

            default:
                System.out.println("Por favor ingresar una opcion válida.");

                break;
        }
            scann.close();
    }
}