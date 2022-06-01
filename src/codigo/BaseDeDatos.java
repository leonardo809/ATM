/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import DISEÑO.ATM;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author leonardo
 */
public class BaseDeDatos {
    public Object money[]=new Object[4];
    public Object dato[]=new Object[3];
    public Object[] deposito=new Object[3];
    public int bcien, bdos, bqui;
    public void obtenerSaldoCajero(){
        Calendar hoy= new GregorianCalendar();
        int dh=hoy.get(Calendar.DATE);
        int mh=hoy.get(Calendar.MONTH);
        int ah=hoy.get(Calendar.YEAR);
        try {
                java.sql.Connection con;
                con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=CAJERO; user=sa; password=sasa;");
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("exec Bfecha'"+ah+"-"+mh+"-"+dh+"'");
                    while (rs.next())
                    {
                        for (int i=0;i<4;i++)
                        {
                            money[i]=rs.getString(i+1);
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ATM.class.getName()).log(Level.SEVERE, null, ex);
                }
        if(money[0]==null){
            try {
                    java.sql.Connection con;
                    con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=CAJERO; user=sa; password=sasa;");
                    Statement stmt=con.createStatement();
                    ResultSet rs=stmt.executeQuery("exec insertar'"+ah+"-"+mh+"-"+dh+"','"+2000+"','"+1500+"','"+1000+"'");
                } catch (SQLException ex) {
                    Logger.getLogger(ATM.class.getName()).log(Level.SEVERE, null, ex);
                }
            bcien=2000;
            bdos=1500;
            bqui=1000;
        }else{
            bcien=Integer.parseInt((String) money[1]);
            bdos=Integer.parseInt((String) money[2]);
            bqui=Integer.parseInt((String) money[3]);
        }
    }
    public void buscarUsuario(String usuario){
        try {
                java.sql.Connection con;
                con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=CAJERO; user=sa; password=sasa;");
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("exec B_USNIP'"+usuario+"'");
                    while (rs.next())
                    {
                        for (int i=0;i<3;i++)
                        {
                            dato[i]=rs.getString(i+1);
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ATM.class.getName()).log(Level.SEVERE, null, ex);
                }
    }
    public void buscarUsuarioDeposito(String usuario){
        try {
                java.sql.Connection con;
                con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=CAJERO; user=sa; password=sasa;");
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("exec B_USNIP'"+usuario+"'");
                    while (rs.next())
                    {
                        for (int i=0;i<3;i++)
                        {
                            deposito[i]=rs.getString(i+1);
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ATM.class.getName()).log(Level.SEVERE, null, ex);
                }
    }
    public void actualizarUsuario(int disponible){
        try {
            java.sql.Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=CAJERO; user=sa; password=sasa;");
            Statement stmt= con.createStatement();
            ResultSet rs=stmt.executeQuery("exec Act '"+dato[0]+"','"+dato[1]+"','"+disponible+"'");
        }
        catch (SQLException ex){
            Logger.getLogger(ATM.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void actualizarNIP(int nip, int disponible){
        try {
            java.sql.Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=CAJERO; user=sa; password=sasa;");
            Statement stmt= con.createStatement();
            ResultSet rs=stmt.executeQuery("exec Act '"+dato[0]+"','"+nip+"','"+disponible+"'");
        }
        catch (SQLException ex) {
            Logger.getLogger(ATM.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void depositar(int nuevo){
        try {
            java.sql.Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=CAJERO; user=sa; password=sasa;");
            Statement stmt= con.createStatement();
            ResultSet rs=stmt.executeQuery("exec Act '"+dato[0]+"','"+dato[1]+"','"+nuevo+"'");
        }
        catch (SQLException ex) {
            Logger.getLogger(ATM.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void actualizarCajero(){
        Calendar hoy= new GregorianCalendar();
        int dh=hoy.get(Calendar.DATE);
        int mh=hoy.get(Calendar.MONTH);
        int ah=hoy.get(Calendar.YEAR);
        try {
            java.sql.Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=CAJERO; user=sa; password=sasa;");
            Statement stmt= con.createStatement();
            ResultSet rs=stmt.executeQuery("exec Act '"+ah+"-"+mh+"-"+dh+"','"+bcien+"','"+bdos+"','"+bqui+"'");
        }
        catch (SQLException ex) {
            Logger.getLogger(ATM.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
