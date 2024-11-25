/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafios.Vista;

import desafios.Controlador.GestionLenguaje;
import desafios.Modelo.LenguajeProgramacion;
import java.util.Scanner;

/**
 *
 * @author Alonso
 */
public class SistemaRegistro {

    private GestionLenguaje gestionLenguaje = new GestionLenguaje();
    private Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        SistemaRegistro sistema = new SistemaRegistro();
        sistema.menu();
    }
    public void menu() {
        int opcion;
        String menu =
        """
                        Menu de Lenguajes de Programacion
            
            Escoja las siguientes opciones:
            
            1.- Agregar Lenguaje
            2.- Buscar Lenguaje
            3.- Eliminar Lenguaje
            4.- Imprimir Lenguaje
            5.-  Salir del menu
            
            """;
        do{ 
            System.out.println(menu);
            opcion = scanner.nextInt();
             scanner.nextLine();
             switch (opcion){
                 case 1 -> agregarLenguaje();
                 case 2 -> buscarLenguaje();
                 case 3 -> eliminarLenguaje();
                 case 4 -> gestionLenguaje.imprimirLenguajes();
                 case 5 -> System.out.println("Saliendo del sistema");
                 default -> System.out.println("Opcion invalida");
             }
        } while(opcion != 5);
    }
    
        private void agregarLenguaje() {
        System.out.print("Año de creacion: ");
        int anioCreacion = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Caracteristica principal: ");
        String caracteristicaPrincipal = scanner.nextLine();
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Utilizacion: ");
        String utilizacion = scanner.nextLine();
        gestionLenguaje.agregarLenguaje(anioCreacion, caracteristicaPrincipal, nombre, utilizacion);
        }
        
        private void buscarLenguaje() {
        System.out.print("Ingrese el nombre del lenguaje: ");
        String nombre = scanner.nextLine();
        LenguajeProgramacion lenguaje = gestionLenguaje.buscarLenguaje(nombre);
        if (lenguaje != null) {
            System.out.println(lenguaje);
        } else {
            System.out.println("Lenguaje no encontrado");
            }
        }
        
        private void eliminarLenguaje() {
        System.out.print("Ingrese el nombre del lenguaje a eliminar: ");
        String nombre = scanner.nextLine();
        gestionLenguaje.eliminarLenguaje(nombre);
        }
}
