import java.util.Scanner;

public class kata2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el nombre de la bebida: ");
        String bebida = sc.nextLine();

        System.out.print("Ingresa la temperatura: ");
        double temperatura = sc.nextDouble();

        if(temperatura > 60){
            System.out.printf("%s: caliente", bebida);

        } else if(temperatura >= 30 && temperatura <= 60){
            System.out.printf("%s: templada", bebida);
        } else if(temperatura < 30){
            System.out.printf("%s: fria", bebida);
        }

        sc.close();
    }
}

/*
Kata 2: Clasificador de Bebidas
Contexto: La cafetería tiene diferentes tipos de bebidas. Debes clasificarlas según
su temperatura.
Requisitos:
Pide el nombre de una bebida.
Pide la temperatura en grados Celsius (puede ser decimal, usa nextDouble() ).
Clasifica la bebida según la temperatura:
"Caliente" si temperatura > 60.
"Templada" si temperatura ≥ 30 y ≤ 60.
"Fría" si temperatura < 30.
Muestra el nombre y la clasificación.
Ingresa el nombre de la bebida: Café Americano
Ingresa la temperatura: 75
Café Americano: Caliente

*/