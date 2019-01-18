/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Andrea y Alexis
 */
public class radio_hoja {
    
    public void onOff(){
        if(encendido_apagado){
            encendido_apagado = false; 
        }else{
            encendido_apagado = true; 
        } 
    } 
    public float Switch(){
        if(amfm){
            amfm = false;
        }else{
            amfm = true;
        }
        float a = 0; 
        return a; 
    }
    public float siguiente(float a){
        float numeroemisora = 0; 
        if (amfm){
            if (a < 107.9){
                numeroemisora = (float)(a+0.2);
            }else{
                numeroemisora = (float)87.9;
            }
        }else{
            if (a < 1610){
                numeroemisora = (float)(a + 5.0);
            }else{
                numeroemisora = (float)530;
            }
        }
        return numeroemisora;
    }
    public float anterior(float a){
        float numeroemisora = 0;
        if (amfm){
            if (a > 87.9){
                numeroemisora = (float)(a-0.2);
            }else{
                numeroemisora = (float)107.9;
            }
        }else{
            if (a > 530){
                numeroemisora = (float)(a - 5.0);
            }else{
                numeroemisora = (float)1610;
            }
        }
        return numeroemisora;
    }
    public void guardar(float e, float b){
        guardadas[b-1] = e;
    }
    public float seleccionarFav(int b){
        float estacion = (float)(0);
        int espacio = b-1;
        estacion = guardadas[espacio];
        if(estacion == (float)0){
            if (amfm){
                estacion = (float)87.9;
            }else{
                estacion = (float)530;
            }
        }
        return estacion;
    }
}
