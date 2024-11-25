/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafios;

import java.util.Scanner;

/**
 *
 * @author Alonso
 */
public class Desafios {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variables 
        String producto1, producto2, producto3, producto4, producto5;
        int cantidad1, cantidad2, cantidad3, cantidad4, cantidad5;
        double precio1, precio2, precio3, precio4, precio5;
        int categoria1, categoria2, categoria3, categoria4, categoria5;

        // Entrada de datos para los 5 productos
        System.out.println("Ingrese el nombre del producto #1:");
        producto1 = sc.nextLine();
        System.out.println("Ingrese la cantidad en inventario del producto #1:");
        cantidad1 = sc.nextInt();
        System.out.println("Ingrese el precio unitario del producto #1:");
        precio1 = sc.nextDouble();
        System.out.println("Ingrese la categoría del producto #1 (1: Electrónicos, 2: Alimentos, 3: Ropa):");
        categoria1 = sc.nextInt();
        sc.nextLine();  // salto de linea

        System.out.println("Ingrese el nombre del producto #2:");
        producto2 = sc.nextLine();
        System.out.println("Ingrese la cantidad en inventario del producto #2:");
        cantidad2 = sc.nextInt();
        System.out.println("Ingrese el precio unitario del producto #2:");
        precio2 = sc.nextDouble();
        System.out.println("Ingrese la categoría del producto #2 (1: Electrónicos, 2: Alimentos, 3: Ropa):");
        categoria2 = sc.nextInt();
        sc.nextLine();  // salto de linea

        System.out.println("Ingrese el nombre del producto #3:");
        producto3 = sc.nextLine();
        System.out.println("Ingrese la cantidad en inventario del producto #3:");
        cantidad3 = sc.nextInt();
        System.out.println("Ingrese el precio unitario del producto #3:");
        precio3 = sc.nextDouble();
        System.out.println("Ingrese la categoría del producto #3 (1: Electrónicos, 2: Alimentos, 3: Ropa):");
        categoria3 = sc.nextInt();
        sc.nextLine();  // Consumir el salto de línea

        System.out.println("Ingrese el nombre del producto #4:");
        producto4 = sc.nextLine();
        System.out.println("Ingrese la cantidad en inventario del producto #4:");
        cantidad4 = sc.nextInt();
        System.out.println("Ingrese el precio unitario del producto #4:");
        precio4 = sc.nextDouble();
        System.out.println("Ingrese la categoría del producto #4 (1: Electrónicos, 2: Alimentos, 3: Ropa):");
        categoria4 = sc.nextInt();
        sc.nextLine();  // Salto de Linea

        System.out.println("Ingrese el nombre del producto #5:");
        producto5 = sc.nextLine();
        System.out.println("Ingrese la cantidad en inventario del producto #5:");
        cantidad5 = sc.nextInt();
        System.out.println("Ingrese el precio unitario del producto #5:");
        precio5 = sc.nextDouble();
        System.out.println("Ingrese la categoría del producto #5 (1: Electrónicos, 2: Alimentos, 3: Ropa):");
        categoria5 = sc.nextInt();
//----------------------------------------------------------------------------------------------------------------------------------
        // Cálculo del valor total del inventario
        double valorTotal1 = cantidad1 * precio1;
        double valorTotal2 = cantidad2 * precio2;
        double valorTotal3 = cantidad3 * precio3;
        double valorTotal4 = cantidad4 * precio4;
        double valorTotal5 = cantidad5 * precio5;

        // Aplicar descuentos
        valorTotal1 = aplicarDescuento(cantidad1, valorTotal1);
        valorTotal2 = aplicarDescuento(cantidad2, valorTotal2);
        valorTotal3 = aplicarDescuento(cantidad3, valorTotal3);
        valorTotal4 = aplicarDescuento(cantidad4, valorTotal4);
        valorTotal5 = aplicarDescuento(cantidad5, valorTotal5);

        // Mostrar la información y aplicar decisiones
        mostrarInformacionProducto(producto1, cantidad1, precio1, valorTotal1, categoria1);
        mostrarInformacionProducto(producto2, cantidad2, precio2, valorTotal2, categoria2);
        mostrarInformacionProducto(producto3, cantidad3, precio3, valorTotal3, categoria3);
        mostrarInformacionProducto(producto4, cantidad4, precio4, valorTotal4, categoria4);
        mostrarInformacionProducto(producto5, cantidad5, precio5, valorTotal5, categoria5);

        // Mostrar el resumen del inventario
        double valorTotalInventario = valorTotal1 + valorTotal2 + valorTotal3 + valorTotal4 + valorTotal5;
        System.out.println("\nResumen del inventario:");
        System.out.println("1. " + producto1 + " - Valor total después de descuentos: " + valorTotal1);
        System.out.println("2. " + producto2 + " - Valor total después de descuentos: " + valorTotal2);
        System.out.println("3. " + producto3 + " - Valor total después de descuentos: " + valorTotal3);
        System.out.println("4. " + producto4 + " - Valor total después de descuentos: " + valorTotal4);
        System.out.println("5. " + producto5 + " - Valor total después de descuentos: " + valorTotal5);

        System.out.println("\nEl valor total del inventario es: " + valorTotalInventario + " soles.");
        if (valorTotalInventario > 500) {
            System.out.println("Atención: Se recomienda reducir el inventario ya que el valor total supera los 500 soles.");
        }

        
        
    }

    // Método para aplicar descuentos según la cantidad
    public static double aplicarDescuento(int cantidad, double valorTotal) {
        if (cantidad > 100) {
            return valorTotal * 0.8;  // 20% de descuento
        } else if (cantidad > 50) {
            return valorTotal * 0.9;  // 10% de descuento
        }
        return valorTotal;  // Sin descuento
    }
//-----------------------------------------------------------------------------------------------------------------------------------
    // Método para mostrar la información del producto y aplicar la clasificación
    public static void mostrarInformacionProducto(String producto, int cantidad, double precio, double valorTotal, int categoria) {
        System.out.println("\nProducto: " + producto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: " + precio);
        System.out.println("Valor total después de descuentos: " + valorTotal);

        // Switch para mostrar el mensaje correspondiente a la categoría
        switch (categoria) {
            case 1:
                System.out.println("Producto electrónico. Revisar garantía.");
                break;
            case 2:
                System.out.println("Producto alimenticio. Revisar fecha de caducidad.");
                break;
            case 3:
                System.out.println("Producto de ropa. Revisar tallas disponibles.");
                break;
            default:
                System.out.println("Categoría no válida.");
        }

        // Verificar si se debe mostrar la advertencia de valor superior a 500 soles
        if (valorTotal > 500) {
            System.out.println("Atención: Se recomienda reducir el inventario ya que el valor total supera los 500 soles.");
        }
    }
}