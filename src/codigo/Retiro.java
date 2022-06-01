/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

/**
 *
 * @author leonardo
 */
public class Retiro {   //fincion Retiro
    private BaseDeDatos bd=new BaseDeDatos();
    public int cien=0; //declaramos las variables
    public int dos=0;
    public int quin=0;
    public void retiro(int dinero){     
        cien=0;
        dos=0;
        quin=0;
        while(dinero!=0){   //condicion para saber si aun cuenta con dinero y que retir puede realizar
            if((((bd.bqui*500)<=dinero) && (bd.bqui>0)) || ((bd.bqui>0) && dinero==500)){   //retiro de 500
                bd.bqui--;
                dinero=dinero-500;
                quin++;
            }
            else{
                if((((bd.bdos*200)<=dinero) && (bd.bdos>0)) || ((bd.bdos>0) && dinero==200)){   //retiro de 200
                    bd.bdos--;
                    dinero=dinero-200;
                    dos++;
                }
                else{
                    if((((bd.bcien*100)<=dinero) && (bd.bcien>0)) || ((bd.bcien>0) && dinero==100)){    //retiro de 100
                        bd.bcien--;
                        dinero=dinero-100;
                        cien++;
                    }
                }
            }
        }
    }
}
