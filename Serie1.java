import java.util.Scanner;

public class Serie1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("Este Programa te permite medir Celcius y Fahrenheit, elige la opcion que deseas.");
        System.out.println("ADVERTENCIA: Asegurate de ingresar valores numericos. :)");
        System.out.println(" ");
        System.out.println("********");
        System.out.println("* MENU *");
        System.out.println("********");
        System.out.println(" ");
        System.out.println("1. Convertir de Celsius a Farenheit.");
        System.out.println("2. Convertir de Farenheit a Celsius. ");
        System.out.println("3. Salir del programa");
        
        int opcion = scan.nextInt();
        
        switch (opcion) {
            case 1:
            try {
                System.out.print("Por favor ingresa el numero de Celsius que quieres convertir a Fahrenheit: ");
                int celsius = scan.nextInt();
                double F = ((celsius * 9/5)+32);

                System.out.println(celsius + "° Celsius es igual a " + F + "° Fahrenheit");
            }
                catch (Exception ex) {
                    System.out.println("Ingresar un valor numerico.");
                }
                
                break;
            case 2:
            try {
                System.out.print("Porfavor ingresa el numero de Fahrenheit que quieres convertir a Celsius: ");
                int fahrenheit = scan.nextInt();
                double C = ((fahrenheit - 32)*5/9);

                System.out.println(fahrenheit + "° Fahrenheit es igual a " + C + "° Celsius");
            }
                catch (Exception ex){
                    System.out.println("Ingresar un valor numerico");
                }
                break;
        
            case 3:
                System.out.println("Gracias por usar el programa.");

                break;

            default:
                System.out.println("Por favor ingresar una opcion válida.");

                break;
        }
            scan.close();
    }
}
