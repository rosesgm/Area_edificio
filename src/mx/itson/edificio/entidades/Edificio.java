/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.edificio.entidades;

/**
 *
 * @author rosagabriela
 */
public class Edificio {

    /**
     * @return the pisos
     */
    public int getPisos() {
        return pisos;
    }

    /**
     * @param pisos the pisos to set
     */
    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the salones
     */
    public int getSalones() {
        return salones;
    }

    /**
     * @param salones the salones to set
     */
    public void setSalones(int salones) {
        this.salones = salones;
    }

    /**
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * @return the ancho
     */
    public float getAncho() {
        return ancho;
    }

    /**
     * @param ancho the ancho to set
     */
    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    private String nombre;
    private String color;
    private int salones;
    private float altura;
    private float ancho;
    private int pisos;

    /**
     * Calcula el área de un edificio. no recibe parámetros.
     *
     * @return
     */
    public float calcularArea() {
        float area = getAltura() * getAncho();
        return area;
    }
}
