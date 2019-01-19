/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Andrea y Alexis
 */

public class radio_hoja implements iRadio
{
   
    /**
     * atributos
     */
  private boolean onOff;
  private boolean amfm;
  private double frecAM;
  private double frecFM;
  private double[] guardadas = new double[12];
  
  /**
   * constructor
   */
  public radio_hoja()
  {
    amfm = true;
    onOff = false;
    frecFM = 87.9;
    frecAM = 530.0;
  }
  
/**
 * Metodo para encender o apagar radio
 * @return 
 */

  @Override
  public boolean encendidoRadio()
  {
    if (onOff) {
      onOff = false;
      return false;
    }
    onOff = true;
    return true;
  }
  


/**
 * metodo para saber si estoy en AM o FM
 * @return 
 */
  @Override
  public boolean cambiarAmFm()
  {
    if (!amfm) {
      amfm = true;
      
      return amfm;
    }
    amfm = false;
    
    return amfm;
  }
  
/**
 * metodo para ir a la siguiente estacion
 * @return 
 */
  @Override
  public double subirFrecuencia()
  {
    if (!amfm) {
      if (frecAM >= 1610.0) {
        frecAM = 530.0;
        
        return frecAM;
      }
      
      return this.frecAM += 10.0;
    }
    


    if (frecFM >= 107.9) {
      frecFM = 87.9;
      
      return frecFM;
    }
    

    return this.frecFM += 0.2;
  }
  


  @Override
  /**
   * metodo para regresar a la estacion anterior
   */
  public double bajarFrecuencia()
  {
    if (!amfm) {
      if (frecAM <= 530.0D) {
        frecAM = 1610.0D;
        
        return frecAM;
      }
      
      return this.frecAM -= 10.0;
    }
    


    if (frecFM <= 87.9) {
      frecFM = 107.9;
      
      return frecFM;
    }
    

    return this.frecFM -= 0.2;
  }
  

/** 
 * obtener favorito segun posicion en arreglo
 * @param posicion
 * @return 
 */

  @Override
  public double getFavorito(int posicion)
  {
    double estacion = 0.0;
    int espacio = posicion - 1;
    estacion = guardadas[espacio];
    if (estacion == 0.0)
    {
      if (amfm)
      {
        estacion = 87.9;
      } else {
        estacion = 530.0;
      }
    }
    return estacion;
  }

  /**
   * guardar en posicion del arreglo
   * @param posicion 
   */
    @Override
    
    public void setFavorito(int posicion) {
       if (amfm == true) {
      guardadas[(posicion - 1)] = frecFM;
    } else {
      guardadas[(posicion - 1)] = frecAM;
    } 
    


    
 
  
}
}
