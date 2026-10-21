import java.util.Scanner;

public class Kata4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa el día (1=Lunes, 7=Domingo): ");
        int dia = entrada.nextInt();

        System.out.print("Ingresa la hora (0-23): ");
        int hora = entrada.nextInt();

        if (dia < 1 || dia > 7) {
            System.out.println("Error: el día debe estar entre 1 y 7.");
            return;
        }

        if (hora < 0 || hora > 23) {
            System.out.println("Error: la hora debe estar entre 0 y 23.");
            return;
        }

        switch (dia) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                if (hora >= 6 && hora < 20) {
                    System.out.println("La cafetería está abierta.");
                } else {
                    System.out.println("La cafetería está cerrada.");
                }
                System.out.println(
                        "Horario de lunes a viernes: 6:00 AM - 8:00 PM"
                );
                break;

            case 6:
                if (hora >= 7 && hora < 14) {
                    System.out.println("La cafetería está abierta.");
                } else {
                    System.out.println("La cafetería está cerrada.");
                }
                System.out.println(
                        "Horario de sábado: 7:00 AM - 2:00 PM"
                );
                break;

            case 7:
                System.out.println("La cafetería está cerrada.");
                System.out.println("Horario de domingo: cerrado todo el día.");
                break;
        }

        entrada.close();
    }
}