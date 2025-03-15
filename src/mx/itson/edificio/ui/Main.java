/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.edificio.ui;

import java.util.Scanner;
import mx.itson.edificio.entidades.Edificio;

/**
 *
 * @author rosagabriela
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
         
        //Generamos una instancia de la clase Edificio.
        Edificio citev = new Edificio();
        
       
        
         System.out.println("Ingrese el nombre del edificio: ");
        String nombre=scanner.nextLine();
        
        System.out.println("Ingrese el color del edificio: ");
        String color = scanner.nextLine();
        
        //Le pedimos al usuario que ingrese la altura por la términal.
        System.out.println("Ingrese la altura del edificio: ");
        float alturaInicial=scanner.nextFloat();
        
        
        
        //Le pedimos al usuario que ingrese el ancho del edificio por la terminal.
        System.out.println("Ingrese el ancho del edificio: ");
        float ancho=scanner.nextFloat();
        
        
        System.out.println("Ingrese la cantidad de salones que tiene el edificio: ");
        int salones=scanner.nextInt();
        
       
        
       
        citev.setNombre(nombre);
        citev.setColor(color);
        citev.setAltura(alturaInicial);
        citev.setAncho(ancho);
        citev.setSalones(salones);
        
       
        
        
        
        //Invocamos al método calcularArea contenido en la clase Edificio.
        float area= citev.calcularArea();
         
        System.out.println("El edificio " + citev.getNombre()
            + " con el interior de color " + citev.getColor()
            + " ahora tiene una altura de " + citev.getAltura()
            + " metros y un ancho de " + citev.getAncho()
            + " Su área actual es de " + citev.calcularArea() + " metros cuadrados.");
        
        System.out.println("Desde agregar pisos al edificio ? (1: si, 0: no) ");
        int opcion=scanner.nextInt();
        if (opcion==1) {
            System.out.println("Ingrese los pisos que desea agregar: ");
            int pisoAdicional=scanner.nextInt();
            
            float alturaFinal =alturaInicial+(pisoAdicional*12.4f);
            citev.setAltura(alturaFinal);
        }
        
       System.out.println("Ahora el edificio " +  citev.getNombre() +
       " Tiene una altura de " + citev.getAltura() + " metros y un área de " +
        citev.calcularArea() + "metros cuadrados.");
    }
}
