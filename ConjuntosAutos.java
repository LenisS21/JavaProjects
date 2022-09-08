/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import java.util.ArrayList;


public class ConjuntosAutos {
    private ArrayList<Auto>  Autos; //el Autos sera el vector y el private se usa para encapsular
    
    public ConjuntosAutos () {
        Autos = new ArrayList<>();
    }
    public void addAuto (Auto x){
        Autos.add(x);
    }
    public String toString(){ //muestra el vector
        String lis="";
        for (int i = 0; i < Autos.size(); i++) {
            Auto ob = Autos.get(i);
            lis+="  "+ob.toString()+"\n";
            
        }
        return lis;
    }

    public float promedio() {
        float sum=0;
        for (int i = 0; i < Autos.size(); i++) {
            Auto ob = Autos.get(i);
            sum+=ob.getPrecio();
        }
        float prom=(float)sum/Autos.size();
        return prom;
    }

    public void borrar(String placa) {
        Auto aut=null;
        for (Auto Autos : Autos) {
            if(Autos.getPlaca().equals(placa)){
                aut=Autos; break;
            }
        }
        Autos.remove(aut);
    }
    
    public void SeleccionSort() {
        for (int i = 0; i < Autos.size(); i++) {
            int menor=Autos.get(i).getModelo();
            int imen=i;
            for (int j = i+1; j < Autos.size(); j++) {
                Auto ob = Autos.get(j);
                if(ob.getModelo()<menor){
                    menor=ob.getModelo();
                    imen=j;
                }
                
            }
            Auto t=Autos.get(i);
            Autos.set(i, Autos.get(imen));
            Autos.set(imen, t);
            
        }
        
    }
    
    public void bubbleSort(){
        for (int i = 0; i < Autos.size(); i++) {
            for (int j = 0; j < Autos.size()-1; j++) {
                if(Autos.get(j).getPlaca().compareTo(Autos.get(j+1).getPlaca())>0){//compareto solo sirve para String
                    Auto t=Autos.get(j);
                    Autos.set(j, Autos.get(j+1));
                    Autos.set(j+1,t);
                }
            }
        }
    }    
    
    public void QuickSort(){
        
    }
    
    

}
 