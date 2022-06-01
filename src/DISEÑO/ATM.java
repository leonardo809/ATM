package DISEÑO;


import codigo.BaseDeDatos;
import codigo.Pantalla;
import codigo.Retiro;
import codigo.TecladoNumerico;
import codigo.transaccion;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
//falta a cuenta: efectivo y transferencia, cambiar nip y retirar
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Home1
 */
public class ATM extends javax.swing.JFrame {

    /**
     * Creates new form ATM
     */
    public ATM() {
        initComponents();
        cursores();
        cursores2();
        lbl_ranuraint.setOpaque(false); // inicalisamos los lbl como false
        lbl_ranurarec.setOpaque(false);
        lbl_ranuraefe.setOpaque(false);
        ImageIcon img1=new ImageIcon(getClass().getResource("/imagenes/dolares.png")); // colocamos nuestras imagenes que utilizaremos con escalas por defecto
        Icon imagen1=new ImageIcon(img1.getImage().getScaledInstance(lbl_imagenes.getWidth(), lbl_imagenes.getHeight(), Image.SCALE_DEFAULT));
        lbl_imagenes.setIcon(imagen1);
        ImageIcon reci=new ImageIcon(getClass().getResource("/imagenes/recibo.png"));
        Icon ric=new ImageIcon(reci.getImage().getScaledInstance(btn_recibo.getWidth(), btn_recibo.getHeight(), Image.SCALE_DEFAULT));
        btn_recibo.setIcon(ric);
        btn_recibo.setVisible(false);
        ImageIcon img2=new ImageIcon(getClass().getResource("/imagenes/negocio.png"));
        Icon imagen2=new ImageIcon(img2.getImage().getScaledInstance(btn_cash.getWidth(), btn_cash.getHeight(), Image.SCALE_DEFAULT));
        btn_cash.setIcon(imagen2);
        ImageIcon img3=new ImageIcon(getClass().getResource("/imagenes/dinero.png"));
        Icon imagen3=new ImageIcon(img3.getImage().getScaledInstance(btn_dinero.getWidth(), btn_dinero.getHeight(), Image.SCALE_DEFAULT));
        btn_dinero.setIcon(imagen3);
        ImageIcon img5=new ImageIcon(getClass().getResource("/imagenes/cancelar.png"));
        Icon imagen7=new ImageIcon(img5.getImage().getScaledInstance(10, 10, Image.SCALE_DEFAULT));
        btn_cancelar.setIcon(imagen7);
        ImageIcon img6=new ImageIcon(getClass().getResource("/imagenes/continuar.png"));
        Icon imagen8=new ImageIcon(img6.getImage().getScaledInstance(10, 10, Image.SCALE_DEFAULT));
        btn_continuar.setIcon(imagen8);
        ImageIcon img7=new ImageIcon(getClass().getResource("/imagenes/limpiar.png"));
        Icon imagen9=new ImageIcon(img7.getImage().getScaledInstance(10, 10, Image.SCALE_DEFAULT));
        btn_limpiar.setIcon(imagen9);
        ImageIcon img4=new ImageIcon(getClass().getResource("/imagenes/ranura.png"));
        Icon imagen4=new ImageIcon(img4.getImage().getScaledInstance(lbl_ranurarec.getWidth(), lbl_ranurarec.getHeight(), Image.SCALE_DEFAULT));
        Icon imagen5=new ImageIcon(img4.getImage().getScaledInstance(lbl_ranuraint.getWidth(), lbl_ranuraint.getHeight(), Image.SCALE_DEFAULT));
        Icon imagen6=new ImageIcon(img4.getImage().getScaledInstance(lbl_ranuraefe.getWidth(), lbl_ranuraefe.getHeight(), Image.SCALE_DEFAULT));
        lbl_ranurarec.setIcon(imagen4); //nombre de la variable incon, diesño para los lbl 
        lbl_ranuraint.setIcon(imagen5);
        lbl_ranuraefe.setIcon(imagen6);
        this.repaint();
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/log.png")).getImage());
        this.setLocationRelativeTo(null);   
        lbl_imagenes.setVisible(false);
        lbl_opcion6.setText(pantalla.mostrarMensaje("Continuar")); //nuestros lbl de las pantallas se encuentran vacios excepto por el de continuar
        lbl_opcion5.setText(pantalla.mostrarMensaje(""));
        lbl_opcion4.setText(pantalla.mostrarMensaje(""));
        lbl_opcion3.setText(pantalla.mostrarMensaje(""));
        lbl_opcion2.setText(pantalla.mostrarMensaje(""));
        lbl_opcion1.setText(pantalla.mostrarMensaje(""));
        lbl_mensajes.setText(pantalla.mostrarMensaje("Bienvenido"));
        ImageIcon mq=new ImageIcon(getClass().getResource("/imagenes/izq.png"));
        ImageIcon der=new ImageIcon(getClass().getResource("/imagenes/der.png"));
        Icon tecla= new ImageIcon(mq.getImage().getScaledInstance(btn_op4.getWidth(), btn_op4.getHeight(), Image.SCALE_DEFAULT));
        Icon tecla2= new ImageIcon(der.getImage().getScaledInstance(btn_op4.getWidth(), btn_op4.getHeight(), Image.SCALE_DEFAULT));
        btn_op4.setIcon(tecla); //nombre de la variable incon, diesño para botones de operación
        btn_op5.setIcon(tecla);
        btn_op6.setIcon(tecla);
        btn_op1.setIcon(tecla2);
        btn_op2.setIcon(tecla2);
        btn_op3.setIcon(tecla2);  
        lbl_ingresos.setVisible(false); //lbl inicializados en false
        btn_cash.setVisible(false);
        btn_dinero.setVisible(false);
        bd.obtenerSaldoCajero();
    }
    private int disponible; //declaramos nuestras variables
    int x, y;
    int aux2, eot, multiplexor=0, servicio=0, cos;
    private final Pantalla pantalla=new Pantalla();
    private final BaseDeDatos bd=new BaseDeDatos();
    private final TecladoNumerico tn=new TecladoNumerico();
    private final transaccion tran=new transaccion();
    private final Retiro re=new Retiro();
    private final recibo res=new recibo();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel2 = new javax.swing.JPanel();
        lbl_mensajes = new javax.swing.JLabel();
        lbl_ingresos = new javax.swing.JLabel();
        lbl_opcion4 = new javax.swing.JLabel();
        lbl_opcion5 = new javax.swing.JLabel();
        lbl_opcion6 = new javax.swing.JLabel();
        lbl_opcion1 = new javax.swing.JLabel();
        lbl_opcion2 = new javax.swing.JLabel();
        lbl_opcion3 = new javax.swing.JLabel();
        lbl_imagenes = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        btn_minimizar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        lbl_encabezado = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        panel3 = new javax.swing.JPanel();
        btn_cash = new javax.swing.JButton();
        btn_no7 = new javax.swing.JButton();
        btn_no4 = new javax.swing.JButton();
        btn_no1 = new javax.swing.JButton();
        btn_no8 = new javax.swing.JButton();
        btn_no5 = new javax.swing.JButton();
        btn_no2 = new javax.swing.JButton();
        btn_no9 = new javax.swing.JButton();
        btn_no6 = new javax.swing.JButton();
        btn_no3 = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        btn_continuar = new javax.swing.JButton();
        btn_punto = new javax.swing.JButton();
        btn_no00 = new javax.swing.JButton();
        btn_no0 = new javax.swing.JButton();
        lbl_ranuraefe = new javax.swing.JLabel();
        lbl_efectivo = new javax.swing.JLabel();
        panel_li = new javax.swing.JPanel();
        btn_op1 = new javax.swing.JButton();
        btn_op2 = new javax.swing.JButton();
        btn_op3 = new javax.swing.JButton();
        panel_ld = new javax.swing.JPanel();
        btn_op4 = new javax.swing.JButton();
        btn_op5 = new javax.swing.JButton();
        btn_op6 = new javax.swing.JButton();
        panel_ra = new javax.swing.JPanel();
        btn_recibo = new javax.swing.JButton();
        btn_dinero = new javax.swing.JButton();
        lbl_ranuraint = new javax.swing.JLabel();
        lbl_insertar = new javax.swing.JLabel();
        lbl_ranurarec = new javax.swing.JLabel();
        lbl_recibo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel2.setBackground(new java.awt.Color(0, 204, 204));
        panel2.setLayout(null);

        lbl_mensajes.setBackground(new java.awt.Color(204, 204, 255));
        lbl_mensajes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_mensajes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_mensajes.setText("jLabel1");
        lbl_mensajes.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        lbl_mensajes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panel2.add(lbl_mensajes);
        lbl_mensajes.setBounds(0, 0, 360, 40);

        lbl_ingresos.setBackground(new java.awt.Color(255, 255, 255));
        lbl_ingresos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_ingresos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_ingresos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lbl_ingresos.setOpaque(true);
        panel2.add(lbl_ingresos);
        lbl_ingresos.setBounds(130, 50, 110, 40);

        lbl_opcion4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_opcion4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_opcion4.setText("Cambio de NIP");
        lbl_opcion4.setToolTipText("");
        lbl_opcion4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        panel2.add(lbl_opcion4);
        lbl_opcion4.setBounds(260, 90, 100, 40);

        lbl_opcion5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_opcion5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_opcion5.setText("jLabel4");
        lbl_opcion5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        panel2.add(lbl_opcion5);
        lbl_opcion5.setBounds(260, 160, 100, 40);

        lbl_opcion6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_opcion6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_opcion6.setText("jLabel5");
        lbl_opcion6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        panel2.add(lbl_opcion6);
        lbl_opcion6.setBounds(260, 230, 100, 40);

        lbl_opcion1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_opcion1.setText("jLabel6");
        panel2.add(lbl_opcion1);
        lbl_opcion1.setBounds(0, 90, 100, 40);

        lbl_opcion2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_opcion2.setText("jLabel7");
        panel2.add(lbl_opcion2);
        lbl_opcion2.setBounds(0, 160, 100, 40);

        lbl_opcion3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_opcion3.setText("jLabel8");
        panel2.add(lbl_opcion3);
        lbl_opcion3.setBounds(0, 230, 100, 40);
        panel2.add(lbl_imagenes);
        lbl_imagenes.setBounds(80, 110, 190, 140);

        getContentPane().add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 360, 290));

        panel1.setBackground(new java.awt.Color(0, 153, 153));
        panel1.setLayout(null);

        btn_minimizar.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        btn_minimizar.setForeground(new java.awt.Color(255, 255, 255));
        btn_minimizar.setText("-");
        btn_minimizar.setToolTipText("Minimizar");
        btn_minimizar.setBorder(null);
        btn_minimizar.setBorderPainted(false);
        btn_minimizar.setContentAreaFilled(false);
        btn_minimizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_minimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_minimizarActionPerformed(evt);
            }
        });
        panel1.add(btn_minimizar);
        btn_minimizar.setBounds(550, 0, 30, 20);

        btn_salir.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_salir.setForeground(new java.awt.Color(255, 255, 255));
        btn_salir.setText("x");
        btn_salir.setToolTipText("Cerrar");
        btn_salir.setBorder(null);
        btn_salir.setBorderPainted(false);
        btn_salir.setContentAreaFilled(false);
        btn_salir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        panel1.add(btn_salir);
        btn_salir.setBounds(590, 0, 15, 20);

        lbl_encabezado.setBackground(new java.awt.Color(153, 0, 153));
        lbl_encabezado.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_encabezado.setForeground(new java.awt.Color(255, 255, 255));
        lbl_encabezado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_encabezado.setText("ATM");
        lbl_encabezado.setOpaque(true);
        lbl_encabezado.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lbl_encabezadoMouseDragged(evt);
            }
        });
        lbl_encabezado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_encabezadoMousePressed(evt);
            }
        });
        panel1.add(lbl_encabezado);
        lbl_encabezado.setBounds(0, 0, 610, 20);

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 20));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, -1, -1));

        panel3.setBackground(new java.awt.Color(102, 102, 102));
        panel3.setLayout(null);

        btn_cash.setBackground(new java.awt.Color(255, 255, 0));
        btn_cash.setBorder(null);
        btn_cash.setContentAreaFilled(false);
        btn_cash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cashActionPerformed(evt);
            }
        });
        panel3.add(btn_cash);
        btn_cash.setBounds(10, 210, 340, 70);

        btn_no7.setBackground(new java.awt.Color(192, 192, 192));
        btn_no7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btn_no7.setText("7");
        btn_no7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_no7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_no7ActionPerformed(evt);
            }
        });
        panel3.add(btn_no7);
        btn_no7.setBounds(10, 20, 60, 30);

        btn_no4.setBackground(new java.awt.Color(192, 192, 192));
        btn_no4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btn_no4.setText("4");
        btn_no4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_no4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_no4ActionPerformed(evt);
            }
        });
        panel3.add(btn_no4);
        btn_no4.setBounds(10, 60, 60, 30);

        btn_no1.setBackground(new java.awt.Color(192, 192, 192));
        btn_no1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btn_no1.setText("1");
        btn_no1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_no1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_no1ActionPerformed(evt);
            }
        });
        panel3.add(btn_no1);
        btn_no1.setBounds(10, 100, 60, 30);

        btn_no8.setBackground(new java.awt.Color(192, 192, 192));
        btn_no8.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btn_no8.setText("8");
        btn_no8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_no8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_no8ActionPerformed(evt);
            }
        });
        panel3.add(btn_no8);
        btn_no8.setBounds(100, 20, 60, 30);

        btn_no5.setBackground(new java.awt.Color(192, 192, 192));
        btn_no5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btn_no5.setText("5");
        btn_no5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_no5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_no5ActionPerformed(evt);
            }
        });
        panel3.add(btn_no5);
        btn_no5.setBounds(100, 60, 60, 30);

        btn_no2.setBackground(new java.awt.Color(192, 192, 192));
        btn_no2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btn_no2.setText("2");
        btn_no2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_no2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_no2ActionPerformed(evt);
            }
        });
        panel3.add(btn_no2);
        btn_no2.setBounds(100, 100, 60, 30);

        btn_no9.setBackground(new java.awt.Color(192, 192, 192));
        btn_no9.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btn_no9.setText("9");
        btn_no9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_no9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_no9ActionPerformed(evt);
            }
        });
        panel3.add(btn_no9);
        btn_no9.setBounds(190, 20, 60, 30);

        btn_no6.setBackground(new java.awt.Color(192, 192, 192));
        btn_no6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btn_no6.setText("6");
        btn_no6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_no6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_no6ActionPerformed(evt);
            }
        });
        panel3.add(btn_no6);
        btn_no6.setBounds(190, 60, 60, 30);

        btn_no3.setBackground(new java.awt.Color(192, 192, 192));
        btn_no3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btn_no3.setText("3");
        btn_no3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_no3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_no3ActionPerformed(evt);
            }
        });
        panel3.add(btn_no3);
        btn_no3.setBounds(190, 100, 60, 30);

        btn_cancelar.setBackground(new java.awt.Color(204, 0, 0));
        btn_cancelar.setText("cancelar");
        btn_cancelar.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        panel3.add(btn_cancelar);
        btn_cancelar.setBounds(260, 20, 90, 30);

        btn_limpiar.setBackground(new java.awt.Color(204, 204, 0));
        btn_limpiar.setText("limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });
        panel3.add(btn_limpiar);
        btn_limpiar.setBounds(260, 60, 90, 30);

        btn_continuar.setBackground(new java.awt.Color(0, 153, 0));
        btn_continuar.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btn_continuar.setText("continuar");
        btn_continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_continuarActionPerformed(evt);
            }
        });
        panel3.add(btn_continuar);
        btn_continuar.setBounds(260, 100, 90, 30);

        btn_punto.setBackground(new java.awt.Color(192, 192, 192));
        btn_punto.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btn_punto.setText(".");
        btn_punto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panel3.add(btn_punto);
        btn_punto.setBounds(10, 140, 60, 30);

        btn_no00.setBackground(new java.awt.Color(192, 192, 192));
        btn_no00.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btn_no00.setText("00");
        btn_no00.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_no00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_no00ActionPerformed(evt);
            }
        });
        panel3.add(btn_no00);
        btn_no00.setBounds(190, 140, 60, 30);

        btn_no0.setBackground(new java.awt.Color(192, 192, 192));
        btn_no0.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btn_no0.setText("0");
        btn_no0.setToolTipText("");
        btn_no0.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_no0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_no0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_no0ActionPerformed(evt);
            }
        });
        panel3.add(btn_no0);
        btn_no0.setBounds(100, 140, 60, 30);

        lbl_ranuraefe.setBackground(new java.awt.Color(0, 102, 102));
        lbl_ranuraefe.setOpaque(true);
        panel3.add(lbl_ranuraefe);
        lbl_ranuraefe.setBounds(10, 200, 340, 30);

        lbl_efectivo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_efectivo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_efectivo.setText("EFECTIVO");
        panel3.add(lbl_efectivo);
        lbl_efectivo.setBounds(10, 180, 100, 20);

        getContentPane().add(panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 360, 290));

        panel_li.setBackground(new java.awt.Color(102, 102, 102));
        panel_li.setLayout(null);

        btn_op1.setBackground(new java.awt.Color(192, 192, 192));
        btn_op1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_op1ActionPerformed(evt);
            }
        });
        panel_li.add(btn_op1);
        btn_op1.setBounds(0, 90, 40, 40);

        btn_op2.setBackground(new java.awt.Color(192, 192, 192));
        btn_op2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_op2ActionPerformed(evt);
            }
        });
        panel_li.add(btn_op2);
        btn_op2.setBounds(0, 160, 40, 40);

        btn_op3.setBackground(new java.awt.Color(192, 192, 192));
        btn_op3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_op3ActionPerformed(evt);
            }
        });
        panel_li.add(btn_op3);
        btn_op3.setBounds(0, 230, 40, 40);

        getContentPane().add(panel_li, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 40, 290));

        panel_ld.setBackground(new java.awt.Color(102, 102, 102));
        panel_ld.setLayout(null);

        btn_op4.setBackground(new java.awt.Color(192, 192, 192));
        btn_op4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btn_op4.setForeground(new java.awt.Color(102, 102, 102));
        btn_op4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_op4ActionPerformed(evt);
            }
        });
        panel_ld.add(btn_op4);
        btn_op4.setBounds(0, 90, 40, 40);

        btn_op5.setBackground(new java.awt.Color(192, 192, 192));
        btn_op5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btn_op5.setForeground(new java.awt.Color(102, 102, 102));
        btn_op5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_op5ActionPerformed(evt);
            }
        });
        panel_ld.add(btn_op5);
        btn_op5.setBounds(0, 160, 40, 40);

        btn_op6.setBackground(new java.awt.Color(192, 192, 192));
        btn_op6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btn_op6.setForeground(new java.awt.Color(102, 102, 102));
        btn_op6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_op6ActionPerformed(evt);
            }
        });
        panel_ld.add(btn_op6);
        btn_op6.setBounds(0, 230, 40, 40);

        getContentPane().add(panel_ld, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 40, 290));

        panel_ra.setBackground(new java.awt.Color(102, 102, 102));
        panel_ra.setLayout(null);

        btn_recibo.setBorder(null);
        btn_recibo.setBorderPainted(false);
        btn_recibo.setContentAreaFilled(false);
        btn_recibo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reciboActionPerformed(evt);
            }
        });
        panel_ra.add(btn_recibo);
        btn_recibo.setBounds(10, 50, 190, 80);

        btn_dinero.setBorder(null);
        btn_dinero.setBorderPainted(false);
        btn_dinero.setContentAreaFilled(false);
        btn_dinero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dineroActionPerformed(evt);
            }
        });
        panel_ra.add(btn_dinero);
        btn_dinero.setBounds(20, 180, 170, 110);

        lbl_ranuraint.setBackground(new java.awt.Color(0, 102, 102));
        lbl_ranuraint.setOpaque(true);
        panel_ra.add(lbl_ranuraint);
        lbl_ranuraint.setBounds(10, 160, 190, 30);

        lbl_insertar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_insertar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_insertar.setText("INSERTAR");
        panel_ra.add(lbl_insertar);
        lbl_insertar.setBounds(10, 130, 120, 30);

        lbl_ranurarec.setBackground(new java.awt.Color(0, 102, 102));
        lbl_ranurarec.setOpaque(true);
        lbl_ranurarec.setRequestFocusEnabled(false);
        panel_ra.add(lbl_ranurarec);
        lbl_ranurarec.setBounds(10, 40, 190, 30);

        lbl_recibo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_recibo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_recibo.setText("RECIBO");
        panel_ra.add(lbl_recibo);
        lbl_recibo.setBounds(10, 10, 90, 22);

        getContentPane().add(panel_ra, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 210, 290));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 80, 290));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 90, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_no1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_no1ActionPerformed
    teclado("1");
    }//GEN-LAST:event_btn_no1ActionPerformed

    private void btn_op6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_op6ActionPerformed
        if(((lbl_opcion6.getText().equals("Cancelar")) && (lbl_mensajes.getText().equals("Elija cuanto")))//condicionamientos para nuetro lbl 6 de operacion
            ||((lbl_opcion6.getText().equals("Continuar")) && (lbl_mensajes.getText().equals("No te alcanza")))
            ||((lbl_opcion6.getText().equals("Continuar")) && (lbl_mensajes.getText().equals("Pagado")) && (btn_recibo.isVisible()==false))
            ||((lbl_opcion6.getText().equals("Continuar")) && (lbl_mensajes.getText().equals("No hay dinero")))){
            vaciar();
            pregunta();
        }
        else{
            if((lbl_opcion6.getText().equals("izzi")) && (lbl_mensajes.getText().equals("Selecione el servicio"))){ // pagos izzi
                vaciar();
                lbl_mensajes.setText(pantalla.mostrarMensaje("Ingrese su monto"));
                lbl_ingresos.setVisible(true);
                lbl_opcion4.setText(pantalla.mostrarMensaje("Cancelar"));
                servicio=3;
            }
            else{
                if((lbl_opcion6.getText().equals("Cancelar")) && (lbl_mensajes.getText().equals("Seleccione una opción"))){ //cancelar operación
                    bd.actualizarUsuario(disponible);
                    vaciar();
                    lbl_mensajes.setText(pantalla.mostrarMensaje("Bienvenido"));
                    lbl_ingresos.setVisible(false);
                    lbl_opcion6.setText(pantalla.mostrarMensaje("Continuar"));   
                }
                else{
                    if((lbl_opcion6.getText().equals("Continuar")) && (lbl_mensajes.getText().equals("No alcanza"))){ 
                        vaciar();
                        if(tran.hayDinero()==true){
                            lbl_mensajes.setText(pantalla.mostrarMensaje("No hay dinero"));
                            lbl_opcion6.setText(pantalla.mostrarMensaje("Continuar"));
                            lbl_opcion4.setText(pantalla.mostrarMensaje("Cancelar"));
                        }
                        else{
                            vaciar();
                            pregunta();
                        }
                    }
                    else{
                        if((lbl_opcion6.getText().equals("Continuar")) && (lbl_mensajes.getText().equals("Cuanto necesita"))){ //retiros
                            if(tran.multiploDe100(Integer.parseInt(lbl_ingresos.getText()))){
                                vaciar();
                                lbl_mensajes.setText(pantalla.mostrarMensaje("Solo se pueden multiplos de cien"));
                                lbl_opcion4.setText(pantalla.mostrarMensaje("Cancelar"));
                                lbl_opcion5.setText(pantalla.mostrarMensaje("Continuar"));
                                lbl_ingresos.setVisible(false);
                            }
                            else{
                                retiro(Integer.parseInt(lbl_ingresos.getText()));
                            }
                        }
                        else{
                            if((lbl_opcion6.getText().equals("Continuar")) && (lbl_mensajes.getText().equals("Ingrese Nuevo Nip"))){ //nuevo Nip
                                vaciar();
                                lbl_ingresos.setVisible(false);
                                bd.actualizarNIP(Integer.parseInt(lbl_ingresos.getText()), disponible);
                                menu();
                            }
                            else{
                                if((lbl_opcion6.getText().equals("Continuar")) && (lbl_mensajes.getText().equals("No tiene el dinero"))){ 
                                    vaciar();
                                    lbl_ingresos.setVisible(true);
                                    lbl_opcion4.setText(pantalla.mostrarMensaje("Cancelar"));
                                    lbl_mensajes.setText(pantalla.mostrarMensaje("Ingrese su monto"));
                                }
                                else{
                                    if((lbl_opcion6.getText().equals("Pago de servicio")) && (lbl_mensajes.getText().equals("Seleccione una opción"))){ //Pagos a servicios
                                        vaciar();
                                        pago();
                                        lbl_opcion6.setVisible(false);
                                        cos=0;
                                    }
                                    else{
                                        if((lbl_opcion6.getText().equals("Continuar")) && (lbl_mensajes.getText().equals("Ingrese su cuenta de servicio"))){ //Cuenta de servicios
                                            res.lbl_cuenta.setText(lbl_ingresos.getText());
                                            vaciar();
                                            if(eot==1){
                                                lbl_ingresos.setVisible(false);
                                                btn_dinero.setVisible(true);
                                                lbl_imagenes.setVisible(true);
                                                lbl_mensajes.setText(pantalla.mostrarMensaje("Ingrese el dinero"));
                                            }
                                            else{
                                                btn_recibo.setVisible(true);
                                                lbl_ingresos.setVisible(false);
                                                lbl_mensajes.setText(pantalla.mostrarMensaje("Pagado"));
                                                lbl_opcion5.setText(pantalla.mostrarMensaje("Continuar"));
                                                lbl_opcion5.setVisible(true);
                                            }
                                        }
                                        else{
                                            if((lbl_opcion6.getText().equals("Continuar")) && (lbl_mensajes.getText().equals("Ingrese su monto"))){ //Accion de pagar
                                                aux2=Integer.parseInt(lbl_ingresos.getText());
                                                res.lbl_monto.setText(lbl_ingresos.getText());
                                                int correcto;
                                                if(cos==0){
                                                    if(eot==1){
                                                        if(tran.multiploDe100(Integer.parseInt(lbl_ingresos.getText()))==true){
                                                            cuentaservicio();
                                                        }
                                                        else{
                                                            vaciar();
                                                            lbl_mensajes.setText(pantalla.mostrarMensaje("Solo se pueden multiplos de 100"));
                                                            lbl_opcion4.setText(pantalla.mostrarMensaje("Cancelar"));
                                                            lbl_opcion5.setText(pantalla.mostrarMensaje("Continuar"));
                                                            lbl_ingresos.setVisible(false);
                                                        }
                                                    }
                                                    else{
                                                        cuentaservicio();
                                                    }
                                                }
                                                else{
                                                    if(eot==1){
                                                        if(tran.multiploDe100(Integer.parseInt(lbl_ingresos.getText()))==true){ //validacion de multiplos de 100
                                                            vaciar();
                                                            lbl_ingresos.setVisible(true);
                                                            lbl_opcion4.setText(pantalla.mostrarMensaje("Cancelar"));
                                                            lbl_mensajes.setText(pantalla.mostrarMensaje("Ingrese no. cuenta"));
                                                        }
                                                        else{
                                                            vaciar();
                                                            lbl_mensajes.setText(pantalla.mostrarMensaje("Solo se pueden multiplos de 100"));
                                                            lbl_opcion4.setText(pantalla.mostrarMensaje("Cancelar"));
                                                            lbl_opcion5.setText(pantalla.mostrarMensaje("Continuar"));
                                                            lbl_ingresos.setVisible(false);
                                                        }
                                                    }
                                                    else{
                                                        vaciar();
                                                        lbl_ingresos.setVisible(true);
                                                        lbl_opcion4.setText(pantalla.mostrarMensaje("Cancelar"));
                                                        lbl_mensajes.setText(pantalla.mostrarMensaje("Ingrese no. cuenta"));
                                                    }
                                                }
                                            }
                                            else{
                                                if((lbl_opcion6.getText().equals("Continuar")) && (lbl_mensajes.getText().equals("Ingrese no. cuenta"))){
                                                    bd.buscarUsuarioDeposito(lbl_ingresos.getText());
                                                    if(bd.deposito[0]!=null){
                                                        vaciar();
                                                        lbl_mensajes.setText(pantalla.mostrarMensaje("Pagado"));
                                                        lbl_opcion5.setText(pantalla.mostrarMensaje("Continuar"));
                                                        lbl_ingresos.setVisible(false);
                                                        btn_recibo.setVisible(true);
                                                        bd.depositar(Integer.parseInt((String) bd.deposito[2])+aux2);
                                                    }
                                                    else{
                                                        vaciar();
                                                        lbl_ingresos.setVisible(false);
                                                        lbl_opcion4.setText(pantalla.mostrarMensaje("Cancelar"));
                                                        lbl_opcion5.setText(pantalla.mostrarMensaje("Continuar"));
                                                        lbl_mensajes.setText(pantalla.mostrarMensaje("Cuenta no existente en el banco"));
                                                    }
                                                }
                                                else{
                                                    if((lbl_opcion6.getText().equals("Continuar")) && (lbl_mensajes.getText().equals("Su saldo es de:"))){ //mostrar el saldo
                                                        vaciar();
                                                        lbl_ingresos.setVisible(false);
                                                        pregunta();
                                                        lbl_ingresos.setText(pantalla.mostrarMensaje(""));
                                                    }
                                                    else{
                                                        if((lbl_opcion6.getText().equals("Continuar")) && (lbl_mensajes.getText().equals("NIP Equivocado: vuelva a intentarlo"))){ //validacion de Nip
                                                            vaciar();
                                                            lbl_mensajes.setText(pantalla.mostrarMensaje("Ingrese su NIP"));
                                                            lbl_ingresos.setVisible(true);
                                                        }
                                                        else{
                                                            if((lbl_opcion6.getText().equals("Continuar")) && (lbl_mensajes.getText().equals("Usuario no encontrado: vuelva a intentarlo"))){
                                                               vaciar();
                                                               lbl_mensajes.setText(pantalla.mostrarMensaje("Ingrese su Usuario"));
                                                               multiplexor=0;
                                                               lbl_ingresos.setVisible(true);
                                                            }
                                                            else{
                                                                if((lbl_opcion6.getText().equals("Continuar")) && (lbl_mensajes.getText().equals("Bienvenido"))){
                                                                    vaciar();
                                                                    lbl_mensajes.setText(pantalla.mostrarMensaje("Ingrese su Usuario"));
                                                                    multiplexor=0;
                                                                    lbl_ingresos.setVisible(true);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btn_op6ActionPerformed

    private void btn_op1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_op1ActionPerformed
        if((lbl_opcion1.getText().equals("CFE")) && (lbl_mensajes.getText().equals("Selecione el servicio"))){ //accion del boton de operacion 1 Servicios
            services();
            servicio=1;
        }
        else{
            if((lbl_opcion1.getText().equals("Cancelar")) && (lbl_mensajes.getText().equals("Ingrese Nuevo Nip"))){ // accion del boton de operacion 1 nuevo Nip
                vaciar();
                pregunta(); 
            }
            else{
                if((lbl_opcion1.getText().equals("100")) && (lbl_mensajes.getText().equals("Elija cuanto"))){ //accion del boton de operacion 1 retiro de 100
                    sacar(100);
                }
            }
        }
    }//GEN-LAST:event_btn_op1ActionPerformed

    private void btn_op2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_op2ActionPerformed
        if((lbl_opcion2.getText().equals("200")) && (lbl_mensajes.getText().equals("Elija cuanto") )){ //accion del boton de operacion 2 retiro de 200
            sacar(200);    
        }
        else{
            if((lbl_opcion2.getText().equals("Consultar Saldo")) && (lbl_mensajes.getText().equals("Seleccione una opción"))){ //consulta de saldo 
                vaciar();
                lbl_mensajes.setText("Su saldo es de:");
                lbl_ingresos.setVisible(true);
                lbl_ingresos.setText("$"+disponible);
                lbl_opcion2.setVisible(false);
                lbl_opcion3.setVisible(false);
                lbl_opcion5.setVisible(false);
                lbl_opcion6.setVisible(true);
                lbl_opcion6.setText(pantalla.mostrarMensaje("Continuar"));
            }
            else{
                if((lbl_opcion2.getText().equals("Telmex")) && (lbl_mensajes.getText().equals("Selecione el servicio"))){ //pagos Telmex
                    services();
                    servicio=2;
                }
            }
        }
    }//GEN-LAST:event_btn_op2ActionPerformed

    private void btn_op5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_op5ActionPerformed
        if(((lbl_opcion5.getText().equals("Continuar")) && (lbl_mensajes.getText().equals("Solo se pueden multiplos de cien"))) //acciones del boton de operacion 5
            ||((lbl_opcion5.getText().equals("Retirar")) && (lbl_mensajes.getText().equals("Seleccione una opción")))){
            vaciar();
            menu_retirar();
        }
        else{
            if((lbl_opcion5.getText().equals("300")) && (lbl_mensajes.getText().equals("Elija cuanto"))){ //accion del boton de operacion 5 retiro de 300
                sacar(300);      
            }
            else{
                if((lbl_opcion5.getText().equals("Continuar")) && (lbl_mensajes.getText().equals("Pagado")) && (btn_recibo.isVisible()==false)){
                    vaciar();
                    pregunta();
                    if(eot==0){
                        disponible=disponible-aux2;
                        aux2=0;
                    }
                    servicio=0;
                }
                else{
                    if((lbl_opcion5.getText().equals("Continuar")) && (lbl_mensajes.getText().equals("Cuenta no existente en el banco"))){ //validacion del boton de operacion 5
                        vaciar();
                        lbl_opcion4.setText(pantalla.mostrarMensaje("Cancelar"));
                        lbl_mensajes.setText(pantalla.mostrarMensaje("Ingrese no. cuenta"));
                    }
                    else{
                        if((lbl_opcion5.getText().equals("Continuar")) && (lbl_mensajes.getText().equals("No te puedes autodepositar"))){
                            vaciar();
                            lbl_opcion4.setText(pantalla.mostrarMensaje("Cancelar"));
                            lbl_mensajes.setText(pantalla.mostrarMensaje("Ingrese no. cuenta"));
                            lbl_ingresos.setVisible(false);
                        }
                        else{
                            if((lbl_opcion5.getText().equals("sky")) && (lbl_mensajes.getText().equals("Selecione el servicio"))){ //pagos a sky
                                vaciar();
                                services();
                                servicio=4;
                            }
                            else{
                                if((lbl_opcion5.getText().equals("Continuar")) && (lbl_mensajes.getText().equals("Solo se pueden multiplos de 100"))){ //opciones de pago
                                    vaciar();
                                    lbl_opcion4.setText(pantalla.mostrarMensaje("Cancelar"));
                                    lbl_mensajes.setText(pantalla.mostrarMensaje("Ingrese su monto"));
                                    lbl_ingresos.setVisible(true);
                                }
                                else{
                                    if((lbl_opcion5.getText().equals("Efectivo")) && (lbl_mensajes.getText().equals("Seleccione una opción")) && (cos==1)){
                                        vaciar();    
                                        lbl_mensajes.setText(pantalla.mostrarMensaje("Ingrese su monto"));
                                        lbl_ingresos.setVisible(true);
                                        lbl_opcion4.setText(pantalla.mostrarMensaje("Cancelar"));
                                        eot=1;
                                    }
                                    else{
                                        if((lbl_opcion5.getText().equals("Efectivo")) && (lbl_mensajes.getText().equals("Seleccione una opción")) && (cos==0)){
                                            vaciar();    
                                            menu_servicios();
                                            eot=1;
                                        }
                                        else{
                                            if((lbl_opcion5.getText().equals("A cuenta")) && (lbl_mensajes.getText().equals("Seleccione una opción"))){
                                                vaciar();
                                                pago();
                                                cos=1;
                                            }
                                            else{
                                                if((lbl_opcion5.getText().equals("Si")) && (lbl_mensajes.getText().equals("¿Desea hacer otra operación?"))){ //validacion para realizar otra operación
                                                    vaciar();
                                                    menu();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btn_op5ActionPerformed

    private void btn_op4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_op4ActionPerformed
        if((lbl_opcion4.getText().equals("No")) && (lbl_mensajes.getText().equals("¿Desea hacer otra operación?"))){ //acciones boton de operacion 4 calcelar otra operacion
            vaciar();
            lbl_mensajes.setText(pantalla.mostrarMensaje("Bienvenido"));
            lbl_opcion6.setText(pantalla.mostrarMensaje("Continuar"));
        }
        else{
            if((lbl_opcion4.getText().equals("Cambiar NIP")) && (lbl_mensajes.getText().equals("Seleccione una opción"))){
                vaciar();
                lbl_ingresos.setVisible(true);
                lbl_mensajes.setText(pantalla.mostrarMensaje("Ingrese Nuevo Nip"));
                lbl_opcion1.setText(pantalla.mostrarMensaje("Cancelar"));
            }
            else{
                if((lbl_opcion4.getText().equals("Cancelar")) && ((lbl_mensajes.getText().equals("Ingrese su monto"))
                    || (lbl_mensajes.getText().equals("Ingrese su cuenta de servicio")) 
                    || (lbl_mensajes.getText().equals("Selecione el servicio"))
                    || (lbl_mensajes.getText().equals("Solo se pueden multiplos de 100"))
                    || (lbl_mensajes.getText().equals("Solo se pueden multiplos de cien"))
                    || (lbl_mensajes.getText().equals("Ingrese no. cuenta"))
                    || (lbl_mensajes.getText().equals("Cuenta no existente en el banco")))
                    || (lbl_mensajes.getText().equals("No te puedes autodepositar"))
                    || (lbl_mensajes.getText().equals("No hay dinero"))
                    || (lbl_mensajes.getText().equals("No alcanza"))
                    || (lbl_mensajes.getText().equals("No te alcanza"))
                    || (lbl_mensajes.getText().equals("Seleccione una opción"))
                    || (lbl_mensajes.getText().equals("Cuanto necesita"))){
                    vaciar();
                    pregunta();
                }
                else{
                    if((lbl_opcion4.getText().equals("1000")) && (lbl_mensajes.getText().equals("Elija cuanto"))){ //accion del boton de operacion 4 retiro de 1000
                        sacar(1000);       
                    }
                }
            }
        }
    }//GEN-LAST:event_btn_op4ActionPerformed

    private void btn_op3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_op3ActionPerformed
        if((lbl_opcion3.getText().equals("Otro")) && (lbl_mensajes.getText().equals("Elija cuanto"))){ //accion del boton de operacion 3 otros
            vaciar();
            lbl_mensajes.setText(pantalla.mostrarMensaje("Cuanto necesita"));
            lbl_ingresos.setVisible(true);
            lbl_opcion4.setText(pantalla.mostrarMensaje("Cancelar"));
        }
        else{
            if((lbl_opcion3.getText().equals("Transferencia")) && (lbl_mensajes.getText().equals("Seleccione una opción")) && cos==1){
                vaciar();
                eot=0;
                lbl_mensajes.setText(pantalla.mostrarMensaje("Ingrese su monto"));
                lbl_ingresos.setVisible(true);
                lbl_opcion4.setText(pantalla.mostrarMensaje("Cancelar"));
            }
            else{
                if((lbl_opcion3.getText().equals("Transferencia")) && (lbl_mensajes.getText().equals("Seleccione una opción")) && cos==0){
                    vaciar();
                    eot=0;
                    menu_servicios();
                }
                else{
                    if((lbl_opcion3.getText().equals("Depositar")) && (lbl_mensajes.getText().equals("Seleccione una opción"))){
                        vaciar();    
                        lbl_opcion4.setText(pantalla.mostrarMensaje("Cancelar"));
                        lbl_opcion5.setText(pantalla.mostrarMensaje("A cuenta"));
                        lbl_opcion6.setText(pantalla.mostrarMensaje("Pago de servicio"));
                    }
                }
            }
        }
    }//GEN-LAST:event_btn_op3ActionPerformed

    private void btn_cashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cashActionPerformed
        lbl_imagenes.setVisible(false);    //acciones del evento boton cash
        btn_cash.setVisible(false);        
        btn_recibo.setVisible(true);
        JOptionPane.showMessageDialog(null,"Billetes de cien: "+re.cien+"\nBilletes de doscientos: "+re.dos+"\nBilletes de quinientos: "+re.quin);
        vaciar();
        pregunta();
    }//GEN-LAST:event_btn_cashActionPerformed

    private void btn_reciboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reciboActionPerformed
        Calendar fecha=new GregorianCalendar(); //da el recibo de la operacion realizada especificando dia, mes, año, minutos, segundo y horas
        int dia=fecha.get(Calendar.DATE); //igualación de las variables de la fecha
        int mes=fecha.get(Calendar.MONTH);
        int año=fecha.get(Calendar.YEAR);
        int minuto=fecha.get(Calendar.MINUTE); //igualacion de las variables de la hora
        int hora=fecha.get(Calendar.HOUR);
        int segundo=fecha.get(Calendar.SECOND);
        res.lbl_fecha.setText(dia+"-"+mes+"-"+año+" "+hora+":"+minuto+":"+segundo);
        res.setVisible(true);
        lbl_mensajes.setText(pantalla.mostrarMensaje("Pagado"));
        lbl_opcion5.setText(pantalla.mostrarMensaje("Continuar"));
        btn_recibo.setVisible(false);
    }//GEN-LAST:event_btn_reciboActionPerformed

    private void btn_dineroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dineroActionPerformed
        btn_dinero.setVisible(false); //acciones del evento boton dinero
        lbl_imagenes.setVisible(false);
        btn_recibo.setVisible(true);
        lbl_mensajes.setText(pantalla.mostrarMensaje("Recoja su recibo"));
    }//GEN-LAST:event_btn_dineroActionPerformed

    private void btn_no2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_no2ActionPerformed
    teclado("2");   //boton del teclado 2 igual a valor 2
    }//GEN-LAST:event_btn_no2ActionPerformed

    private void btn_no3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_no3ActionPerformed
    teclado("3");   //boton del teclado 3 igual a valor 3
    }//GEN-LAST:event_btn_no3ActionPerformed

    private void btn_no4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_no4ActionPerformed
        teclado("4");   //boton del teclado 4 igual a valor 4
    }//GEN-LAST:event_btn_no4ActionPerformed

    private void btn_no5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_no5ActionPerformed
        teclado("5");   //boton del teclado 5 igual a valor 5
    }//GEN-LAST:event_btn_no5ActionPerformed

    private void btn_no6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_no6ActionPerformed
    teclado("6");   //boton del teclado 6 igual a valor 6
    }//GEN-LAST:event_btn_no6ActionPerformed

    private void btn_no7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_no7ActionPerformed
    teclado("7");   //boton del teclado 7 igual a valor 7
    }//GEN-LAST:event_btn_no7ActionPerformed

    private void btn_no8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_no8ActionPerformed
    teclado("8");   //boton del teclado 8 igual a valor 8
    }//GEN-LAST:event_btn_no8ActionPerformed

    private void btn_no9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_no9ActionPerformed
    teclado("9");   //boton del teclado 9 igual a valor 9
    }//GEN-LAST:event_btn_no9ActionPerformed

    private void btn_no0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_no0ActionPerformed
    teclado("0");   //boton del teclado 0 igual a valor 0
    }//GEN-LAST:event_btn_no0ActionPerformed

    private void btn_no00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_no00ActionPerformed
        teclado("00");  //boton del teclado 00 igual a valor 00
    }//GEN-LAST:event_btn_no00ActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        lbl_ingresos.setText(pantalla.Limpiar()); //limpia la pantalla
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        vaciar();
        pregunta();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_continuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_continuarActionPerformed
        if(((lbl_opcion6.getText().equals("Continuar")) && (lbl_mensajes.getText().equals("Pagado")) && (btn_recibo.isVisible()==false))    //condicnes de accion del boton continuar
            ||((lbl_opcion6.getText().equals("Continuar")) && (lbl_mensajes.getText().equals("No te alcanza"))) 
            ||((lbl_opcion6.getText().equals("Continuar")) && (lbl_mensajes.getText().equals("No hay dinero")))){
            vaciar();
            pregunta();
        }
        else{
            if((lbl_opcion5.getText().equals("Continuar")) && (lbl_mensajes.getText().equals("Solo se pueden multiplos de cien"))){
                vaciar();
                menu_retirar();
            }
            else{
                if((lbl_opcion5.getText().equals("Continuar")) && (lbl_mensajes.getText().equals("Pagado")) && (btn_recibo.isEnabled()==false)){
                    vaciar();
                    pregunta();
                    if(eot==0){
                        disponible=disponible-aux2;
                        aux2=0;
                    }
                    servicio=0;
                }
                else{
                    if((lbl_opcion5.getText().equals("Continuar")) && (lbl_mensajes.getText().equals("Cuenta no existente en el banco"))){ //validacion de la opción
                        vaciar();
                        lbl_opcion4.setText(pantalla.mostrarMensaje("Cancelar"));
                        lbl_mensajes.setText(pantalla.mostrarMensaje("Ingrese no. cuenta"));
                    }
                    else{
                        if((lbl_opcion5.getText().equals("Continuar")) && (lbl_mensajes.getText().equals("No te puedes autodepositar"))){
                            vaciar();
                            lbl_opcion4.setText(pantalla.mostrarMensaje("Cancelar"));
                            lbl_mensajes.setText(pantalla.mostrarMensaje("Ingrese no. cuenta"));
                            lbl_ingresos.setVisible(false);
                        }
                        else{
                            if((lbl_opcion5.getText().equals("Continuar")) && (lbl_mensajes.getText().equals("Solo se pueden multiplos de 100"))){
                                vaciar();
                                lbl_opcion4.setText(pantalla.mostrarMensaje("Cancelar"));
                                lbl_mensajes.setText(pantalla.mostrarMensaje("Ingrese su monto"));
                                lbl_ingresos.setVisible(true);
                            }
                            else{
                                if((lbl_opcion6.getText().equals("Continuar")) && (lbl_mensajes.getText().equals("No alcanza"))){
                                    vaciar();
                                    if((bd.bcien==0) && (bd.bdos==0) && (bd.bqui==0)){
                                        lbl_mensajes.setText(pantalla.mostrarMensaje("No hay dinero"));
                                        lbl_opcion6.setText(pantalla.mostrarMensaje("Continuar"));
                                        lbl_opcion4.setText(pantalla.mostrarMensaje("Cancelar"));
                                    }
                                    else{
                                        vaciar();
                                        pregunta();
                                    }
                                }
                                else{
                                    if((lbl_opcion6.getText().equals("Continuar")) && (lbl_mensajes.getText().equals("Cuanto Necesita"))){
                                        if(tran.multiploDe100(Integer.parseInt(lbl_ingresos.getText()))==false){
                                            vaciar();
                                            lbl_mensajes.setText(pantalla.mostrarMensaje("Solo se pueden multiplos de cien"));
                                            lbl_opcion4.setText(pantalla.mostrarMensaje("Cancelar"));
                                            lbl_opcion5.setText(pantalla.mostrarMensaje("Continuar"));
                                            lbl_ingresos.setVisible(false);
                                        }
                                        else{
                                            retiro(Integer.parseInt(lbl_ingresos.getText()));
                                        }            
                                    }
                                    else{
                                        if((lbl_opcion6.getText().equals("Continuar")) && (lbl_mensajes.getText().equals("Ingrese Nuevo Nip"))){
                                            vaciar();
                                            lbl_ingresos.setVisible(false);
                                            bd.actualizarNIP(Integer.parseInt(lbl_ingresos.getText()), disponible);
                                            menu();
                                        }
                                        else{
                                            if((lbl_opcion6.getText().equals("Continuar")) && (lbl_mensajes.getText().equals("No tiene el dinero"))){
                                                vaciar();
                                                lbl_ingresos.setVisible(true);
                                                lbl_opcion4.setText(pantalla.mostrarMensaje("Cancelar"));
                                                lbl_mensajes.setText(pantalla.mostrarMensaje("Ingrese su monto"));
                                            }
                                            else{
                                                if((lbl_opcion6.getText().equals("Continuar")) && (lbl_mensajes.getText().equals("Ingrese su cuenta de servicio"))){
                                                    res.lbl_cuenta.setText(lbl_ingresos.getText());
                                                    vaciar();
                                                    if(eot==1){
                                                    lbl_mensajes.setText(pantalla.mostrarMensaje("Ingrese el dinero"));
                                                    lbl_imagenes.setVisible(true);
                                                    lbl_ingresos.setVisible(false);
                                                    btn_dinero.setVisible(true);
                                                    }
                                                    else{
                                                        btn_recibo.setVisible(true);
                                                        lbl_ingresos.setVisible(false);
                                                        lbl_mensajes.setText(pantalla.mostrarMensaje("Pagado"));
                                                        lbl_opcion5.setText(pantalla.mostrarMensaje("Continuar"));
                                                        lbl_opcion5.setVisible(true);
                                                    }
                                                }
                                                else{
                                                    if((lbl_opcion6.getText().equals("Continuar")) && (lbl_mensajes.getText().equals("Ingrese su monto"))){
                                                        aux2=Integer.parseInt(lbl_ingresos.getText());
                                                        res.lbl_monto.setText(lbl_ingresos.getText());
                                                        if(cos==0){
                                                            if(eot==1){
                                                                if(tran.multiploDe100(Integer.parseInt(lbl_ingresos.getText()))==true){
                                                                    vaciar();
                                                                    lbl_ingresos.setVisible(true);
                                                                    lbl_opcion4.setText(pantalla.mostrarMensaje("Cancelar"));
                                                                    lbl_mensajes.setText(pantalla.mostrarMensaje("Ingrese su cuenta de servicio"));
                                                                }
                                                                else{
                                                                    vaciar();
                                                                    lbl_mensajes.setText(pantalla.mostrarMensaje("Solo se pueden multiplos de 100"));
                                                                    lbl_opcion4.setText(pantalla.mostrarMensaje("Cancelar"));
                                                                    lbl_opcion5.setText(pantalla.mostrarMensaje("Continuar"));
                                                                    lbl_ingresos.setVisible(false);
                                                                }
                                                            }
                                                            else{
                                                                vaciar();
                                                                lbl_ingresos.setVisible(true);
                                                                lbl_opcion4.setText(pantalla.mostrarMensaje("Cancelar"));
                                                                lbl_mensajes.setText(pantalla.mostrarMensaje("Ingrese su cuenta de servicio"));
                                                            }
                                                        }
                                                        else{
                                                            if(eot==1){
                                                                if(tran.multiploDe100(Integer.parseInt(lbl_ingresos.getText()))==true){
                                                                    vaciar();
                                                                    lbl_ingresos.setVisible(true);
                                                                    lbl_opcion4.setText(pantalla.mostrarMensaje("Cancelar"));
                                                                    lbl_mensajes.setText(pantalla.mostrarMensaje("Ingrese no. cuenta"));
                                                                }
                                                                else{
                                                                    vaciar();
                                                                    lbl_mensajes.setText(pantalla.mostrarMensaje("Solo se pueden multiplos de 100"));
                                                                    lbl_opcion4.setText(pantalla.mostrarMensaje("Cancelar"));
                                                                    lbl_opcion5.setText(pantalla.mostrarMensaje("Continuar"));
                                                                    lbl_ingresos.setVisible(false);
                                                                }
                                                            }
                                                            else{
                                                                vaciar();
                                                                lbl_ingresos.setVisible(true);
                                                                lbl_opcion4.setText(pantalla.mostrarMensaje("Cancelar"));
                                                                lbl_mensajes.setText(pantalla.mostrarMensaje("Ingrese no. cuenta"));
                                                            }
                                                        }
                                                    }
                                                    else{
                                                        if((lbl_opcion6.getText().equals("Continuar")) && (lbl_mensajes.getText().equals("Ingrese no. cuenta"))){
                                                            bd.buscarUsuarioDeposito(lbl_ingresos.getText());
                                                            if(bd.deposito[0]!=null){
                                                                vaciar();
                                                                lbl_mensajes.setText(pantalla.mostrarMensaje("Pagado"));
                                                                lbl_opcion5.setText(pantalla.mostrarMensaje("Continuar"));
                                                                lbl_ingresos.setVisible(false);
                                                                btn_recibo.setVisible(true);
                    
                                                                bd.depositar(Integer.parseInt((String) bd.deposito[2]+aux2));
                                                            }
                                                            else{
                                                                vaciar();
                                                                lbl_ingresos.setVisible(false);
                                                                lbl_opcion4.setText(pantalla.mostrarMensaje("Cancelar"));
                                                                lbl_opcion5.setText(pantalla.mostrarMensaje("Continuar"));
                                                                lbl_mensajes.setText("Cuenta no existente en el banco");
                                                            }
                                                        }
                                                        else{
                                                            if((lbl_opcion6.getText().equals("Continuar")) && (lbl_mensajes.getText().equals("Su saldo es de:"))){ //verificacion de saldo
                                                                vaciar();
                                                                lbl_ingresos.setVisible(false);
                                                                pregunta();
                                                                lbl_ingresos.setText(pantalla.mostrarMensaje(""));
                                                            }
                                                            else{
                                                                if((lbl_opcion6.getText().equals("Continuar")) && (lbl_mensajes.getText().equals("NIP Equivocado: vuelva a intentarlo"))){ //validacion de Nip y usuario
                                                                    vaciar();
                                                                    lbl_mensajes.setText(pantalla.mostrarMensaje("Ingrese su Usuario"));
                                                                    lbl_ingresos.setVisible(true);
                                                                }
                                                                else{
                                                                    if((lbl_opcion6.getText().equals("Continuar")) && (lbl_mensajes.getText().equals("Usuario no encontrado: vuelva a intentarlo"))){
                                                                        vaciar();
                                                                        lbl_mensajes.setText(pantalla.mostrarMensaje("Ingrese su Usuario"));
                                                                        multiplexor=0;
                                                                        lbl_ingresos.setVisible(true);
                                                                    }
                                                                    else{
                                                                        if((lbl_opcion6.getText().equals("Continuar")) && (lbl_mensajes.getText().equals("Bienvenido"))){
                                                                            vaciar();
                                                                            lbl_mensajes.setText(pantalla.mostrarMensaje("Ingrese su Usuario"));
                                                                            multiplexor=0;
                                                                            lbl_ingresos.setVisible(true);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btn_continuarActionPerformed

    private void btn_minimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_minimizarActionPerformed
        this.setExtendedState(ICONIFIED);   //accion minimizar 
        this.setExtendedState(1);
    }//GEN-LAST:event_btn_minimizarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        bd.actualizarCajero();  //al salir se actualiza el cajero
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void lbl_encabezadoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_encabezadoMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_lbl_encabezadoMouseDragged

    private void lbl_encabezadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_encabezadoMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_lbl_encabezadoMousePressed
private void menu(){ //funcion menu
                        lbl_mensajes.setText(pantalla.mostrarMensaje("Seleccione una opción")); 
                        lbl_ingresos.setText(pantalla.mostrarMensaje(""));
                        lbl_opcion3.setText(pantalla.mostrarMensaje("Depositar"));
                        lbl_opcion2.setText(pantalla.mostrarMensaje("Consultar Saldo"));
                        lbl_opcion4.setText(pantalla.mostrarMensaje("Cambiar NIP"));
                        lbl_opcion5.setText(pantalla.mostrarMensaje("Retirar"));
                        lbl_opcion6.setText(pantalla.mostrarMensaje("Cancelar"));
                        lbl_ingresos.setFont(new Font("Tahoma", Font.PLAIN,14));
}
private void pregunta(){ //funcion pregunta
    lbl_mensajes.setText(pantalla.mostrarMensaje("¿Desea hacer otra operación?"));
    lbl_opcion4.setText(pantalla.mostrarMensaje("No"));
    lbl_opcion5.setText(pantalla.mostrarMensaje("Si"));
    lbl_ingresos.setVisible(false);
}
private void pago(){ //funcion pago
    lbl_opcion3.setText(pantalla.mostrarMensaje("Transferencia"));
    lbl_opcion5.setText(pantalla.mostrarMensaje("Efectivo"));
    lbl_opcion4.setText(pantalla.mostrarMensaje("Cancelar"));
}
private void retiro(int dinero){ //funcion retiro
    re.retiro(dinero);
    vaciar();
    lbl_mensajes.setText(pantalla.mostrarMensaje("Retire su dinero"));
    lbl_ingresos.setVisible(false);
    btn_cash.setVisible(true);
    lbl_imagenes.setVisible(true);
}
private void disponibilidad(){ //funcion disponibilidad
    if(tran.disponibilidadCajero(Integer.parseInt(lbl_ingresos.getText()))==true){ //condicion si hay o no dinero disponible
        if(tran.disponibilidadUsuario(Integer.parseInt(lbl_ingresos.getText()), disponible)){
            vaciar();
            lbl_mensajes.setText(pantalla.mostrarMensaje("No te alcanza"));
            lbl_opcion6.setText(pantalla.mostrarMensaje("Continuar"));
            lbl_opcion4.setText(pantalla.mostrarMensaje("Cancelar"));
            lbl_ingresos.setVisible(false);
        }
        else{
            lbl_opcion6.setText(pantalla.mostrarMensaje("Continuar"));
            lbl_opcion4.setText(pantalla.mostrarMensaje("Cancelar"));
        }
    }
    else{
        vaciar();
        lbl_ingresos.setVisible(false);
        lbl_mensajes.setText(pantalla.mostrarMensaje("No alcanza"));
        lbl_opcion6.setText(pantalla.mostrarMensaje("Continuar"));
        lbl_opcion4.setText(pantalla.mostrarMensaje("Cancelar"));
    }
}
private void sacar(int dinero){ //funcion sacar
        if(tran.disponibilidadCajero(dinero)==true){ //condicion si hay o no dinero disponible
            if(tran.disponibilidadUsuario(dinero, disponible)){
                vaciar();
                lbl_mensajes.setText(pantalla.mostrarMensaje("No te alcanza"));
                lbl_opcion6.setText(pantalla.mostrarMensaje("Continuar"));
                lbl_opcion4.setText(pantalla.mostrarMensaje("Cancelar"));
                lbl_ingresos.setVisible(false);
            }
            else{
                retiro(dinero);
            }
        }
        else{
            vaciar();
            lbl_ingresos.setVisible(false);
            lbl_mensajes.setText(pantalla.mostrarMensaje("No alcanza"));
            lbl_opcion6.setText(pantalla.mostrarMensaje("Continuar"));
            lbl_opcion4.setText(pantalla.mostrarMensaje("Cancelar"));
        }       
}
private void services(){ //funcion service
            vaciar();
            lbl_mensajes.setText(pantalla.mostrarMensaje("Ingrese su monto"));
            lbl_ingresos.setVisible(true);
            lbl_opcion4.setText(pantalla.mostrarMensaje("Cancelar"));
}
private void menu_retirar(){    //funcion menu_retirar
    if(tran.hayDinero()==false){    //condicion si hay o no dinero disponible
        lbl_mensajes.setText(pantalla.mostrarMensaje("No hay dinero"));
        lbl_opcion6.setText(pantalla.mostrarMensaje("Continuar"));
        lbl_opcion4.setText(pantalla.mostrarMensaje("Cancelar"));
    }
    else{
        lbl_mensajes.setText(pantalla.mostrarMensaje("Elija cuanto"));
        lbl_ingresos.setVisible(false);
        lbl_opcion6.setText(pantalla.mostrarMensaje("Cancelar"));
        lbl_opcion1.setText(pantalla.mostrarMensaje("100"));
        lbl_opcion2.setText(pantalla.mostrarMensaje("200"));
        lbl_opcion3.setText(pantalla.mostrarMensaje("Otro"));
        lbl_opcion4.setText(pantalla.mostrarMensaje("1000"));
        lbl_opcion5.setText(pantalla.mostrarMensaje("300"));
    }
}
private void menu_servicios(){  //funcion menu_servicios
            lbl_mensajes.setText(pantalla.mostrarMensaje("Selecione el servicio"));
            lbl_ingresos.setVisible(false);
            lbl_opcion1.setText(pantalla.mostrarMensaje("CFE"));
            lbl_opcion2.setText(pantalla.mostrarMensaje("Telmex"));
            lbl_opcion3.setText(pantalla.mostrarMensaje("izzi"));
            lbl_opcion5.setText(pantalla.mostrarMensaje("sky"));
            lbl_opcion4.setText(pantalla.mostrarMensaje("Cancelar"));
}
private void teclado(String numero){    //funcion teclado
    if((lbl_mensajes.getText().equals("Ingrese su Usuario")) || (lbl_mensajes.getText().equals("Ingrese su NIP"))){
    switch(multiplexor){
            case 0:
            lbl_ingresos.setText(pantalla.mostrarMensaje(lbl_ingresos.getText()+tn.escribirNumero(numero)));
            if(lbl_ingresos.getText().length()==5){
                bd.buscarUsuario(lbl_ingresos.getText());
                if(bd.dato[0]!=null){
                    lbl_mensajes.setText(pantalla.mostrarMensaje("Ingrese su NIP"));
                    lbl_ingresos.setText(pantalla.mostrarMensaje(""));
                    lbl_ingresos.setFont(new Font("Bookshelf Symbol 7", Font.PLAIN,14));
                    multiplexor=1;
                }
                else{
                    lbl_mensajes.setText(pantalla.mostrarMensaje("Usuario no encontrado: vuelva a intentarlo"));
                    lbl_opcion6.setText(pantalla.mostrarMensaje("Continuar"));
                    lbl_ingresos.setText(pantalla.mostrarMensaje(""));
                    lbl_ingresos.setVisible(false);
                }
            }
            break;
            case 1:
                lbl_ingresos.setText(lbl_ingresos.getText()+tn.escribirNumero(numero));
                if(lbl_ingresos.getText().length()==5){
                    if(bd.dato[1].equals(lbl_ingresos.getText())){
                        menu();
                        disponible=(int) bd.dato[2];
                    }
                    else{
                    lbl_ingresos.setText(pantalla.mostrarMensaje(""));
                    lbl_ingresos.setVisible(false);
                    lbl_mensajes.setText(pantalla.mostrarMensaje("NIP Equivocado: vuelva a intentarlo"));
                    lbl_opcion6.setText(pantalla.mostrarMensaje("Continuar"));
                    }
                }
            break;
        }
    }
    if(lbl_mensajes.getText().equals("Ingrese su monto")){    
        lbl_ingresos.setText(lbl_ingresos.getText()+tn.escribirNumero(numero));
        lbl_opcion6.setText(pantalla.mostrarMensaje("Continuar"));
        if(eot==0){
            if(tran.disponibilidadUsuario(Integer.parseInt(lbl_ingresos.getText()), disponible)==false){
                lbl_mensajes.setText(pantalla.mostrarMensaje("No tiene el dinero"));
                lbl_ingresos.setText(pantalla.mostrarMensaje(""));
            }
        }
    }
    if(lbl_mensajes.getText().equals("Ingrese su cuenta de servicio")){
        switch(servicio){
            case 1:
                if(lbl_ingresos.getText().length()<16){
                    lbl_ingresos.setText(lbl_ingresos.getText()+tn.escribirNumero(numero));
                }
                if(lbl_ingresos.getText().length()>=16){
                    lbl_ingresos.setText(lbl_ingresos.getText());
                    lbl_opcion6.setText(pantalla.mostrarMensaje("Continuar"));
                }
            break;
            case 2:
                if(lbl_ingresos.getText().length()<20){
                    lbl_ingresos.setText(lbl_ingresos.getText()+tn.escribirNumero(numero));
                }
                if(lbl_ingresos.getText().length()>=20){
                    lbl_ingresos.setText(lbl_ingresos.getText());
                    lbl_opcion6.setText(pantalla.mostrarMensaje("Continuar"));
                }
            break;
            case 3:
                if(lbl_ingresos.getText().length()<29){
                    lbl_ingresos.setText(lbl_ingresos.getText()+tn.escribirNumero(numero));
                }
                if(lbl_ingresos.getText().length()>=29){
                    lbl_ingresos.setText(lbl_ingresos.getText());
                    lbl_opcion6.setText(pantalla.mostrarMensaje("Continuar"));
                }
            break;
            case 4:
                if(lbl_ingresos.getText().length()<12){
                    lbl_ingresos.setText(lbl_ingresos.getText()+tn.escribirNumero(numero));
                }
                if(lbl_ingresos.getText().length()>=12){
                    lbl_ingresos.setText(lbl_ingresos.getText());
                    lbl_opcion6.setText(pantalla.mostrarMensaje("Continuar"));
                }
        }
    }
    if((lbl_mensajes.getText().equals("Ingrese no. cuenta"))){
        cinco(numero);
    }
    if((lbl_mensajes.getText().equals("Ingrese Nuevo Nip"))){
        cinco(numero);
    }
    if((lbl_mensajes.getText().equals("Cuanto necesita"))){
        if(lbl_ingresos.getText().length()>=7){
            lbl_ingresos.setText(lbl_ingresos.getText());
            disponibilidad();
        }
        else{
            lbl_ingresos.setText(lbl_ingresos.getText()+tn.escribirNumero(numero));
                disponibilidad();
        }
    }
}
private void vaciar(){ //funcion vaciar
    lbl_ingresos.setText(pantalla.Limpiar());
    lbl_opcion6.setText(pantalla.Limpiar());
    lbl_opcion5.setText(pantalla.Limpiar());
    lbl_opcion4.setText(pantalla.Limpiar());
    lbl_opcion3.setText(pantalla.Limpiar());
    lbl_opcion2.setText(pantalla.Limpiar());
    lbl_opcion1.setText(pantalla.Limpiar());
}
private void cursores(){ //funcion cursores
        Cursor cursor;
        ImageIcon imagen=new ImageIcon(getClass().getResource("/imagenes/flecha2.png"));
        Toolkit t=Toolkit.getDefaultToolkit();
        cursor=t.createCustomCursor(imagen.getImage(), new Point(1,1), "cursor");
        setCursor(cursor);
        
    }
private void cursores2(){ //funcion cursores 2
        Cursor cursor;
        ImageIcon imagen=new ImageIcon(getClass().getResource("/imagenes/mano.png"));
        Toolkit t=Toolkit.getDefaultToolkit();
        cursor=t.createCustomCursor(imagen.getImage(), new Point(1,1), "cursor");
        btn_continuar.setCursor(cursor);
        btn_salir.setCursor(cursor);
        btn_cancelar.setCursor(cursor);
        btn_limpiar.setCursor(cursor);
        btn_minimizar.setCursor(cursor);
        btn_op1.setCursor(cursor);
        btn_op2.setCursor(cursor);
        btn_op3.setCursor(cursor);
        btn_op4.setCursor(cursor);
        btn_op5.setCursor(cursor);
        btn_op6.setCursor(cursor);
        btn_cash.setCursor(cursor);
        btn_dinero.setCursor(cursor);
        btn_recibo.setCursor(cursor);
        btn_punto.setCursor(cursor);
        btn_no1.setCursor(cursor);
        btn_no2.setCursor(cursor);
        btn_no3.setCursor(cursor);
        btn_no4.setCursor(cursor);
        btn_no5.setCursor(cursor);
        btn_no6.setCursor(cursor);
        btn_no7.setCursor(cursor);
        btn_no8.setCursor(cursor);
        btn_no9.setCursor(cursor);
        btn_no0.setCursor(cursor);
        btn_no00.setCursor(cursor);
        
    }
private void cinco(String numero){ //funcion cinco
    if(lbl_ingresos.getText().length()<5){
            lbl_ingresos.setText(lbl_ingresos.getText()+tn.escribirNumero(numero));
        }
        if(lbl_ingresos.getText().length()>=5){
            lbl_ingresos.setText(lbl_ingresos.getText());
            lbl_opcion6.setText(pantalla.mostrarMensaje("Continuar"));
        }
}
private void cuentaservicio(){ //funcion cuentaservicio
    vaciar();
    lbl_ingresos.setVisible(true);
    lbl_opcion4.setText("Cancelar");
    lbl_mensajes.setText("Ingrese su cuenta de servicio");
}
/**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ATM().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_cash;
    private javax.swing.JButton btn_continuar;
    private javax.swing.JButton btn_dinero;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_minimizar;
    private javax.swing.JButton btn_no0;
    private javax.swing.JButton btn_no00;
    private javax.swing.JButton btn_no1;
    private javax.swing.JButton btn_no2;
    private javax.swing.JButton btn_no3;
    private javax.swing.JButton btn_no4;
    private javax.swing.JButton btn_no5;
    private javax.swing.JButton btn_no6;
    private javax.swing.JButton btn_no7;
    private javax.swing.JButton btn_no8;
    private javax.swing.JButton btn_no9;
    private javax.swing.JButton btn_op1;
    private javax.swing.JButton btn_op2;
    private javax.swing.JButton btn_op3;
    private javax.swing.JButton btn_op4;
    private javax.swing.JButton btn_op5;
    private javax.swing.JButton btn_op6;
    private javax.swing.JButton btn_punto;
    private javax.swing.JButton btn_recibo;
    private javax.swing.JButton btn_salir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl_efectivo;
    private javax.swing.JLabel lbl_encabezado;
    private javax.swing.JLabel lbl_imagenes;
    private javax.swing.JLabel lbl_ingresos;
    private javax.swing.JLabel lbl_insertar;
    private javax.swing.JLabel lbl_mensajes;
    private javax.swing.JLabel lbl_opcion1;
    private javax.swing.JLabel lbl_opcion2;
    private javax.swing.JLabel lbl_opcion3;
    private javax.swing.JLabel lbl_opcion4;
    private javax.swing.JLabel lbl_opcion5;
    private javax.swing.JLabel lbl_opcion6;
    private javax.swing.JLabel lbl_ranuraefe;
    private javax.swing.JLabel lbl_ranuraint;
    private javax.swing.JLabel lbl_ranurarec;
    private javax.swing.JLabel lbl_recibo;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JPanel panel_ld;
    private javax.swing.JPanel panel_li;
    private javax.swing.JPanel panel_ra;
    // End of variables declaration//GEN-END:variables
}
