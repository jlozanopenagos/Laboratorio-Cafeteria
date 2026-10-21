import java.util.Scanner;

public class kata3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double precio;
        double subtotal = 0;
        double iva;
        double totalConIVA;
        double descuento = 0;
        double totalFinal;

        do {
            System.out.print("Ingresa el precio del producto (0 para terminar): ");
            precio = entrada.nextDouble();

            if (precio > 0) {
                subtotal = subtotal + precio;
            }

        } while (precio != 0);

        iva = subtotal * 0.19;
        totalConIVA = subtotal + iva;

        if (totalConIVA > 50000) {
            descuento = totalConIVA * 0.10;
        }

        totalFinal = totalConIVA - descuento;

        System.out.println("Subtotal: $" + String.format("%.0f", subtotal));
        System.out.println("IVA (19%): $" + String.format("%.0f", iva));
        System.out.println("Total con IVA: $" + String.format("%.0f", totalConIVA));
        System.out.println("Descuento: $" + String.format("%.0f", descuento));
        System.out.println("Total final: $" + String.format("%.0f", totalFinal));

        entrada.close();
    }
}
/*

    Requisitos:

    Pide el precio de cada producto que el cliente pide.
    El cliente puede ingresar varios productos. Usa un bucle while o do-while .
    Cuando el cliente ingresa 0 , termina el pedido.
    Calcula:
    Subtotal (suma de todos los productos).
    IVA (19% del subtotal).
    Total con IVA = subtotal + IVA.
    Si el total con IVA supera $50.000, aplica un descuento del 10% sobre el
    total con IVA.
    descuento = totalConIVA * 0.10
    totalFinal = totalConIVA - descuento
    Si no supera $50.000, no hay descuento y totalFinal = totalConIVA .
    Si el primer precio ingresado es 0 , muestra el reporte con todos los valores en
    0.

    Ejemplo de ejecución 1 (sin descuento):
    Ingresa el precio del producto (0 para terminar): 4000
    Ingresa el precio del producto (0 para terminar): 3500
    Ingresa el precio del producto (0 para terminar): 7500
    Ingresa el precio del producto (0 para terminar): 0
    Subtotal: $15000
    IVA (19%): $2850
    Total: $17850

*/