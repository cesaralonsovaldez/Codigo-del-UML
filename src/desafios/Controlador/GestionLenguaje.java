/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafios.Controlador;

import desafios.Modelo.LenguajeProgramacion;

/**
 *
 * @author Alonso
 */
public class GestionLenguaje {
    private LenguajeProgramacion[] arregloLenguajes = new LenguajeProgramacion[FACTOR_CRECIMIENTO];
    private static final int FACTOR_CRECIMIENTO = 2;
    private int contadorLenguajes = 0;
    
    public void agregarLenguaje(int anioCreacion, String caracteristicaPrincipal, String nombre, String utilizacion) { 
        if (contadorLenguajes == arregloLenguajes.length) { 
            LenguajeProgramacion[] nuevoArreglo = new LenguajeProgramacion[arregloLenguajes.length + FACTOR_CRECIMIENTO]; 
            System.arraycopy(arregloLenguajes, 0, nuevoArreglo, 0, arregloLenguajes.length); 
            arregloLenguajes = nuevoArreglo; 
            } 
        arregloLenguajes[contadorLenguajes++] = new LenguajeProgramacion(anioCreacion, caracteristicaPrincipal, nombre, utilizacion);
    }
    
    public LenguajeProgramacion buscarLenguaje(String nombre) {
        for (int i = 0; i < contadorLenguajes; i++) { 
            if (arregloLenguajes[i].getNombre().equals(nombre)) { 
                return arregloLenguajes[i];
            }       
        }
        return null;
    }
    
    public boolean eliminarLenguaje(String nombre) { 
        for (int i = 0; i < contadorLenguajes; i++) { 
            if (arregloLenguajes[i].getNombre().equals(nombre)) { 
                arregloLenguajes[i] = arregloLenguajes[--contadorLenguajes]; 
                arregloLenguajes[contadorLenguajes] = null; 
                return true; 
            } 
        } 
        return false; 
    }
    
    public LenguajeProgramacion[] getArregloLenguajes() { 
        return arregloLenguajes; 
    }
    
    public void imprimirLenguajes() { 
        for (int i = 0; i < contadorLenguajes; i++) { 
            System.out.println(arregloLenguajes[i]);
        } 
    }
}
