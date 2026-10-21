import java.util.Scanner;

public class Kata5 {
    public static void main(String[] args){
        boolean control = true;
        Scanner sc = new Scanner(System.in);
        float total = 0;

        do {
            System.out.println("----------------------------------------------");
            System.out.println("Bienvenidos a mi cafeteria, aqui esta el menu:");
            System.out.println("----------------------------------------------");
            System.out.println("1. Café ($4.000)");
            System.out.println("2. Muffin ($3.500)");
            System.out.println("3. Sandwich ($7.500)");
            System.out.println("4. Jugo ($5.000)");
            System.out.println("5. Té ($3.000)");
            System.out.println("6. Salir");

            System.out.println("Ingrese el numero del producto a consumir:");
            int userInput = sc.nextInt();

            switch(userInput){
                case 1 -> {
                    System.out.println("---------------------------------");
                    System.out.println("Producto agregado: Café ($4.000)");
                    System.out.println("---------------------------------");
                    total += 4000;
                }
                case 2 -> {
                    System.out.println("---------------------------------");
                    System.out.println("Producto agregado: Muffin ($3.500)");
                    System.out.println("---------------------------------");
                    total += 3500;
                }
                case 3 -> {
                    System.out.println("---------------------------------");
                    System.out.println("Producto agregado: Sandwich ($7.500)");
                    System.out.println("---------------------------------");
                    total += 7500;
                }
                case 4 -> {
                    System.out.println("---------------------------------");
                    System.out.println("Producto agregado: Jugo ($5.000)");
                    System.out.println("---------------------------------");
                    total += 5000;
                }
                case 5 -> {
                    System.out.println("---------------------------------");
                    System.out.println("Producto agregado: Té ($3.000)");
                    System.out.println("---------------------------------");
                    total += 3000;
                }
                case 6 -> {
                    System.out.println("---------------------------------");
                    System.out.println("Total a pagar: " + String.format("%.0f",total));
                    System.out.println("---------------------------------");
                    control = false;
                }
                default -> {
                    System.out.println("Opcion no valida");
                }
            }
        } while(control);
    }
}

/*Kata 5: Menú Interactivo con Switch
Contexto: La cafetería tiene un menú básico. Los clientes pueden elegir productos.
Requisitos:
Muestra un menú en bucle usando while (termina cuando elige salir).
Opciones:
1. Café ($4.000)
2. Muffin ($3.500)
3. Sandwich ($7.500)
4. Jugo ($5.000)
5. Té ($3.000)
6. Salir
Usa switch para procesar la selección.
*/
