import java.util.Scanner;

public class Kata1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---------------------------------------------");
        System.out.println("Bienvenido a mi restaurante-cafeteria");
        System.out.println("---------------------------------------------");

        System.out.println("Ingresa el total de la cuenta: ");
        float valorProducto = sc.nextFloat();

        if(valorProducto < 0){
            System.out.println("Error: total inválido");
        }

        if (valorProducto > 0){
            System.out.println("Ingresa el valor de la propina que quieres dar: ");
            int valorPorcentaje = sc.nextInt();
            if(!(valorPorcentaje > 0 && valorPorcentaje <= 100)){
                System.out.println("Error: porcentaje inválido");
            } else{
                float totalPorcentaje = valorProducto + ((valorPorcentaje*valorProducto)/100);
                float valorNetoPropina = totalPorcentaje - valorProducto;

                System.out.println("---------------------------------------------");
                System.out.printf("Valor de la propina: %.0f%n", valorNetoPropina);
                System.out.println("---------------------------------------------");

                System.out.println("---------------------------------------------");
                System.out.println("Total a pagar: " + String.format("%.0f", totalPorcentaje));
                System.out.println("---------------------------------------------");

                if(valorPorcentaje <= 5 ) {
                    System.out.println("---------------------------------------------");
                    System.out.println("Propina muy baja");
                    System.out.println("---------------------------------------------");
                } else if( valorPorcentaje >= 30 ){
                    System.out.println("---------------------------------------------");
                    System.out.println("Propina muy generosa!");
                    System.out.println("---------------------------------------------");
                }
            }

        }
        sc.close();
    }
}