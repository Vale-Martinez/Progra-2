package logica.Interfaz;

import javax.swing.JFrame;
import logica.estructura.Cola;
import logica.estructura.Heaps;
import logica.gestion.GestionConsultorio;

public class Configuracion extends javax.swing.JFrame {
//crea todos los atributos necesarios
    private PantallaPrincipal principal;
    private Cola ColaesperaV, ColaesperaA, ColaesperaR, ColaesperaE;
    private Heaps HeapsesperaV, HeapsesperaA, HeapsesperaR, HeapsesperaE;
    private String codigoverde, codigoamarrilo, codigorojo, codigoegresado;
    private int tiempoMin, tiempoMax;

    //getters and setters de todas los atributos
    public String getCodigoverde() {
        return codigoverde;
    }

    public void setCodigoverde(String codigoverde) {
        this.codigoverde = codigoverde;
    }

    public String getCodigoamarrilo() {
        return codigoamarrilo;
    }

    public void setCodigoamarrilo(String codigoamarrilo) {
        this.codigoamarrilo = codigoamarrilo;
    }

    public String getCodigorojo() {
        return codigorojo;
    }

    public void setCodigorojo(String codigorojo) {
        this.codigorojo = codigorojo;
    }

    public String getCodigoegresado() {
        return codigoegresado;
    }

    public void setCodigoegresado(String codigoegresado) {
        this.codigoegresado = codigoegresado;
    }

    public Cola getColaesperaV() {
        return ColaesperaV;
    }

    public void setColaesperaV(Cola ColaesperaV) {
        this.ColaesperaV = ColaesperaV;
    }

    public Cola getColaesperaA() {
        return ColaesperaA;
    }

    public void setColaesperaA(Cola ColaesperaA) {
        this.ColaesperaA = ColaesperaA;
    }

    public Cola getColaesperaR() {
        return ColaesperaR;
    }

    public void setColaesperaR(Cola ColaesperaR) {
        this.ColaesperaR = ColaesperaR;
    }

    public Cola getColaesperaE() {
        return ColaesperaE;
    }

    public void setColaesperaE(Cola ColaesperaE) {
        this.ColaesperaE = ColaesperaE;
    }

    public Heaps getHeapsesperaV() {
        return HeapsesperaV;
    }

    public void setHeapsesperaV(Heaps HeapsesperaV) {
        this.HeapsesperaV = HeapsesperaV;
    }

    public Heaps getHeapsesperaA() {
        return HeapsesperaA;
    }

    public void setHeapsesperaA(Heaps HeapsesperaA) {
        this.HeapsesperaA = HeapsesperaA;
    }

    public Heaps getHeapsesperaR() {
        return HeapsesperaR;
    }

    public void setHeapsesperaR(Heaps HeapsesperaR) {
        this.HeapsesperaR = HeapsesperaR;
    }

    public Heaps getHeapsesperaE() {
        return HeapsesperaE;
    }

    public void setHeapsesperaE(Heaps HeapsesperaE) {
        this.HeapsesperaE = HeapsesperaE;
    }

    public int getTiempoMin() {
        return tiempoMin;
    }

    public void setTiempoMin(int tiempoMin) {
        this.tiempoMin = tiempoMin;
    }

    public int getTiempoMax() {
        return tiempoMax;
    }

    public void setTiempoMax(int tiempoMax) {
        this.tiempoMax = tiempoMax;
    }

    public Configuracion() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        numeroCV = new javax.swing.JSpinner();
        nuemeroCA = new javax.swing.JSpinner();
        numeroCR = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TiempoMin = new javax.swing.JSpinner();
        TiempoMax = new javax.swing.JSpinner();
        BotonInicio = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        numeroCE = new javax.swing.JSpinner();
        EstructuraV = new javax.swing.JComboBox<>();
        EstructuraA = new javax.swing.JComboBox<>();
        EstructuraR = new javax.swing.JComboBox<>();
        EstructuraE = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Configuracion Inical");
        setBackground(new java.awt.Color(0, 102, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.gray);
        setName("frameConfiguracion"); // NOI18N
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 24)); // NOI18N
        jLabel1.setText("Configuracion ");

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 18)); // NOI18N
        jLabel3.setText("Numero de Consultorio");

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 18)); // NOI18N
        jLabel4.setText("Tipo de Cola");

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 18)); // NOI18N
        jLabel2.setText("Tipo de Consultorio");

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 18)); // NOI18N
        jLabel5.setText("Verdes");

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 18)); // NOI18N
        jLabel6.setText("Amarillos");

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 18)); // NOI18N
        jLabel7.setText("Rojos");

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 18)); // NOI18N
        jLabel8.setText("Tiempo de espera:");

        jLabel9.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 18)); // NOI18N
        jLabel9.setText("Tiempo minimo de espera (segundos)");

        jLabel10.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 18)); // NOI18N
        jLabel10.setText("Tiempo maximo de espera (segundos)");

        BotonInicio.setBackground(new java.awt.Color(0, 204, 204));
        BotonInicio.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 18)); // NOI18N
        BotonInicio.setText("Iniciar");
        BotonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInicioActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 18)); // NOI18N
        jLabel11.setText("Egresados");

        EstructuraV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cola", "Heaps" }));

        EstructuraA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cola", "Heaps" }));

        EstructuraR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cola", "Heaps" }));

        EstructuraE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cola", "Heaps" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addGap(164, 164, 164)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nuemeroCA, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numeroCR, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numeroCE, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TiempoMin, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TiempoMax, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(numeroCV, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(53, 53, 53))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel10)
                                .addComponent(BotonInicio))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(47, 47, 47)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(jLabel1)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EstructuraV, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(EstructuraA, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EstructuraR, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EstructuraE, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(numeroCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EstructuraV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(nuemeroCA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EstructuraA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(numeroCR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EstructuraR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(numeroCE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(EstructuraE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TiempoMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(TiempoMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BotonInicio)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInicioActionPerformed
        //extrae los datos ingresados por el cliente y los ingresa en  variables
        int valueV = (Integer) numeroCV.getValue();
        int valueA = (Integer) nuemeroCA.getValue();
        int valueR = (Integer) numeroCR.getValue();
        int valueE = (Integer) numeroCE.getValue();
        this.setTiempoMin((Integer) TiempoMin.getValue());
        this.setTiempoMax((Integer) TiempoMax.getValue());
        GestionConsultorio agregarConsultorios = new GestionConsultorio(valueV, valueA, valueR, valueE);
        agregarConsultorios.agregar();
        /*
        en los soguientes ifs, se da la seleccion de la estructura de datos que el cliente eliga 
        el codigo, como por ejemplo codigoverde, es un codigo creado pro nosotros, para que sea mas facil de identificar cual estructura elijio el cliente
        tambien se inicializan las colas o los heaps 
         */
        if (EstructuraV.getModel().getSelectedItem().toString().toLowerCase().equals("cola")) {
            ColaesperaV = new Cola();
            this.setCodigoverde("cola");
        } else {
            HeapsesperaV = new Heaps();
            this.setCodigoverde("heap");
        }
        if (EstructuraA.getModel().getSelectedItem().toString().toLowerCase().equals("cola")) {
            ColaesperaA = new Cola();
            this.setCodigoamarrilo("cola");
        } else {
            HeapsesperaA = new Heaps();
            this.setCodigoamarrilo("heap");
        }
        if (EstructuraR.getModel().getSelectedItem().toString().toLowerCase().equals("cola")) {
            ColaesperaR = new Cola();
            this.setCodigorojo("cola");
        } else {
            HeapsesperaR = new Heaps();
            this.setCodigorojo("heap");
        }
        if (EstructuraE.getModel().getSelectedItem().toString().toLowerCase().equals("cola")) {
            ColaesperaE = new Cola();
            this.setCodigoegresado("cola");
        } else {
            HeapsesperaE = new Heaps();
            this.setCodigoegresado("heap");
        }

        PantallaPrincipal principal = new PantallaPrincipal(agregarConsultorios,getCodigoverde(),getCodigoamarrilo(),getCodigorojo(),getCodigoegresado(),getColaesperaV(),getColaesperaA(),getColaesperaR(),getColaesperaE(),getHeapsesperaV(),getHeapsesperaA(),getHeapsesperaR(),getHeapsesperaE());
        principal.setVisible(true);
        principal.actualizarTablaEmergencia();
        principal.actualizarTablaUrgencia();
        principal.actualizarTablaEgresado();
        dispose();

    }//GEN-LAST:event_BotonInicioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonInicio;
    public static javax.swing.JComboBox<String> EstructuraA;
    public static javax.swing.JComboBox<String> EstructuraE;
    public static javax.swing.JComboBox<String> EstructuraR;
    public static javax.swing.JComboBox<String> EstructuraV;
    private javax.swing.JSpinner TiempoMax;
    private javax.swing.JSpinner TiempoMin;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner nuemeroCA;
    private javax.swing.JSpinner numeroCE;
    private javax.swing.JSpinner numeroCR;
    private javax.swing.JSpinner numeroCV;
    // End of variables declaration//GEN-END:variables
}
