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
public class transaccion {
    private BaseDeDatos bd=new BaseDeDatos();   //se actualiza la base de datos
    public boolean disponibilidadCajero(int ingreso){
        return ingreso<(bd.bcien+bd.bdos+bd.bqui);     
    }
    public boolean disponibilidadUsuario(int ingreso, int disponible){  //la disponibilidad del usuario
        return ingreso>disponible;
    }
    public boolean hayDinero(){ 
        return (bd.bcien==0) && (bd.bdos==0) && (bd.bqui==0);
    }
    public boolean multiploDe100(int numero){   //regresa multiplo de 100
        return numero%100==0;
    }
    
}
