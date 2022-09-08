/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;    

public class Vector extends JFrame{
    public static void main(String[] args) {
        int v[]= new int [10000]; //se crea el vector y ese vector tiene 10k de tamaño
        int n= Integer.parseInt(JOptionPane.showInputDialog("DIGITA N ")); //paquete que se usan (Integer.parseInt)se usa para convertir el string a entero
        generar(v,n);
        String lis= toString(v,n);
        JOptionPane.showMessageDialog(null, lis); //para mostrar en ventana
        burbuja(v,n);
        //insercion(v,n);
        JOptionPane.showMessageDialog(null, lis+"\n"+toString(v,n));
        
    }

    private static void generar(int[] v, int n) {  //Genera numeros aleatoriamente
        for (int i = 0; i < n; i++) {
            v[i]= (int) (Math.random()*1000);
        }
    }

    private static String toString(int[] v, int n) {
        String lis=" ";
        for (int i = 0; i < n; i++) {
            lis+=" "+v[i];
        }
        return lis;
    }

    private static void burbuja(int[] v, int n) { //metodo burbuja
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
                if(v[j]>v[j+1]){
                    intercambio(v,j,j+1);
                }
                
            }
        }
    }

    private static void intercambio(int[] v, int j, int jj) {
        int t=v[j];
        v[j]=v[jj];
        v[jj]=t;
    }

    /*private static void insercion(int[] v, int n) {
        int clave;
        for (int j = 1; j < n; j++) {
            clave=v[j];
            int i = j-1;
            while(i>-1 && v[i]>clave){
                v[i+1]=v[i];
                i = i-1;
            }
            v[i+1]=clave;
        }
    }*/

    
    
    
}
