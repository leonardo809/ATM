/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import DISEÑO.Portada;
import DISEÑO.SplashScreen;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author leonardo
 */
public class Screenscreen {     //funcion para la barra de carga
    public static void main(String[] args){
        Portada portada=new Portada();
        SplashScreen Splash=new SplashScreen();
        Splash.setVisible(true);
        try{
            for(int i=0;i<=100;i++){
                Thread.sleep(100);
                Splash.lbl_porcentaje.setText(Integer.toString(i)+"%");     //valor de carga
                Splash.Jpb_login.setValue(i);
                if(i==100){
                    Splash.setVisible(false);   //oculta de la pantalla de carga
                    portada.setVisible(true);   //muestra la pantalla de la portada
                }
            }
        }
        catch(InterruptedException e){
            Logger.getLogger(Screenscreen.class.getName()).log(Level.SEVERE,"Fallo de búsqueda ",e);    //mensaje de error
        }
    }
}
