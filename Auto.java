/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

/**
 *
 * @author Andre
 */
public class Auto {
    private String placa; 
    private int modelo;
    private float precio;
    

    public Auto(String placa, int modelo, float precio) {
        this.placa = placa;
        this.modelo = modelo;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Auto |" + "placa = " + placa + "| |modelo = " + modelo + "| |precio = " + precio + '|';
    }
    
    

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the modelo
     */
    public int getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
    
}
