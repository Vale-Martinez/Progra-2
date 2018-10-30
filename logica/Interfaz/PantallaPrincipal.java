package logica.Interfaz;

import java.util.ArrayList;
import java.util.Arrays;
import logica.negocio.personas.Persona;
import logica.enums.EnumColores;
import logica.enums.EnumEnfermedad;
import logica.Interfaz.Administrador;
import logica.Interfaz.Configuracion;
import logica.gestion.GestionConsultorio;
import java.util.Calendar;
import javax.swing.JTable;
import logica.estructura.Cola;
import logica.estructura.ColaNodo;
import logica.estructura.HeapNodo;
import logica.estructura.Heaps;
import logica.estructura.ModeladorDeTablas;
import logica.negocio.consultorio.Consultorio;

public final class PantallaPrincipal extends javax.swing.JFrame {
//crea todos los atributos necesarios

    private String codigoverde, codigoamarrilo, codigorojo, codigoegresado;
    private Cola ColaesperaV, ColaesperaA, ColaesperaR, ColaesperaE;
    private Heaps HeapsesperaV, HeapsesperaA, HeapsesperaR, HeapsesperaE;
    int cont = 0;
    private GestionConsultorio gestorConsultorio;

//getters and setters de todas los atributos
    public GestionConsultorio getGestorConsultorio() {
        return gestorConsultorio;
    }

    public void setGestorConsultorio(GestionConsultorio gestorConsultorio) {
        this.gestorConsultorio = gestorConsultorio;
    }

    public JTable getListaEsperaEmergencia() {
        return PacientesEmergencia;
    }

    public void setListaEsperaEmergencia(JTable ListaEsperaEmergencia) {
        this.PacientesEmergencia = ListaEsperaEmergencia;
    }

    public JTable getListaEsperaUrgencia() {
        return PacientesUrgencia;
    }

    public void setListaEsperaUrgencia(JTable ListaEsperaUrgencia) {
        this.PacientesUrgencia = ListaEsperaUrgencia;
    }

    //metodo que actualiza la tabla de egresos, cambia el nuemero de cosultorios
    public void actualizarTablaEgresado() {
        ModeladorDeTablas.vaciarTabla(TablaEgresados);
        Object[] filaNueva;
        ColaNodo<Consultorio> TempEgresado = gestorConsultorio.getListaConsultoriosEgresados().getInicio();
        for (int i = 0; i < gestorConsultorio.getListaConsultoriosEgresados().getSize(); i++) {
            filaNueva = new Object[]{
                TempEgresado.getElemento().getNombre(),
                TempEgresado.getElemento().getEstado()
            };
            ModeladorDeTablas.nuevaFila(TablaEgresados, filaNueva);
            TempEgresado = TempEgresado.getNodoSig();
        }

    }
//metodo que actualiza la tabla de urgencias, cambia el nuemero de cosultorios

    public void actualizarTablaUrgencia() {

        ModeladorDeTablas.vaciarTabla(TablaUrgencias);
        Object[] filaNueva;
        ColaNodo<Consultorio> tempAmarillo = gestorConsultorio.getListaConsultoriosAmarillos().getInicio();
        ColaNodo<Consultorio> tempVerde = gestorConsultorio.getListaConsultoriosVerdes().getInicio();
        for (int i = 0; i < gestorConsultorio.getListaConsultoriosAmarillos().getSize(); i++) {
            filaNueva = new Object[]{
                tempAmarillo.getElemento().getNombre(),
                tempAmarillo.getElemento().getEstado()
            };
            ModeladorDeTablas.nuevaFila(TablaUrgencias, filaNueva);
            tempAmarillo = tempAmarillo.getNodoSig();
        }
        for (int i = 0; i < gestorConsultorio.getListaConsultoriosVerdes().getSize(); i++) {
            filaNueva = new Object[]{
                tempVerde.getElemento().getNombre(),
                tempVerde.getElemento().getEstado()
            };
            ModeladorDeTablas.nuevaFila(TablaUrgencias, filaNueva);
            tempVerde = tempVerde.getNodoSig();
        }
    }

    //metodo que actualiza la tabla de Emergencias, cambia el nuemero de cosultorios
    public void actualizarTablaEmergencia() {

        ModeladorDeTablas.vaciarTabla(TablaEmergencias);
        Object[] filaNueva;
        ColaNodo<Consultorio> tempRojo = gestorConsultorio.getListaConsultoriosRojos().getInicio();
        for (int i = 0; i < gestorConsultorio.getListaConsultoriosRojos().getSize(); i++) {
            filaNueva = new Object[]{
                tempRojo.getElemento().getNombre(),
                tempRojo.getElemento().getEstado()
            };
            ModeladorDeTablas.nuevaFila(TablaEmergencias, filaNueva);
            tempRojo = tempRojo.getNodoSig();

        }
    }
//metodo que actualiza la tabla de emergencias, con pacientes rojos

    public void TablaEsperaEmergencia() {
        if (this.codigorojo.equals("cola")) {

            ModeladorDeTablas.vaciarTabla(PacientesEmergencia);
            Object[] filaNueva;
            ColaNodo<Persona> tempRojo = ColaesperaR.getInicio();
            for (int i = 0; i < ColaesperaR.getSize(); i++) {
                filaNueva = new Object[]{
                    tempRojo.getElemento().getNombre(),
                    tempRojo.getElemento().getEnfermedad().getNombre(),
                    tempRojo.getElemento().getFicha()
                };
                ModeladorDeTablas.nuevaFila(PacientesEmergencia, filaNueva);
                tempRojo = tempRojo.getNodoSig();
            }
        } else {
            ModeladorDeTablas.vaciarTabla(PacientesEmergencia);
            Object[] filaNueva;
            HeapNodo<Persona> tempRojo = HeapsesperaR.getInicio();
            for (int i = 0; i < HeapsesperaR.getSize(); i++) {
                filaNueva = new Object[]{
                    tempRojo.getElemento().getNombre(),
                    tempRojo.getElemento().getEnfermedad().getNombre(),
                    tempRojo.getElemento().getFicha()
                };
                ModeladorDeTablas.nuevaFila(PacientesEmergencia, filaNueva);
                tempRojo = tempRojo.getHijoIzquierdo();
            }
        }
    }
//metodo que actualiza la tabla de urgencias, con pacientes verdes y amarillos

    public void TablaEsperaUrgencia() {
        if (this.codigoverde.equals("cola") && this.codigoamarrilo.equals("cola")) {

            ModeladorDeTablas.vaciarTabla(PacientesUrgencia);
            Object[] filaNueva;
            ColaNodo<Persona> tempAmarillo = ColaesperaA.getInicio();
            ColaNodo<Persona> tempVerde = ColaesperaV.getInicio();

            System.out.println(ColaesperaV.getSize());
            for (int i = 0; i < ColaesperaV.getSize(); i++) {
                filaNueva = new Object[]{
                    tempVerde.getElemento().getNombre(),
                    tempVerde.getElemento().getEnfermedad().getNombre(),
                    tempVerde.getElemento().getFicha(),
                    tempVerde.getElemento().getGravedad().getEstado()
                };
                ModeladorDeTablas.nuevaFila(PacientesUrgencia, filaNueva);
                tempVerde = tempVerde.getNodoSig();
            }

            System.out.println(ColaesperaA.getSize());
            for (int i = 0; i < ColaesperaA.getSize(); i++) {

                filaNueva = new Object[]{
                    tempAmarillo.getElemento().getNombre(),
                    tempAmarillo.getElemento().getEnfermedad().getNombre(),
                    tempAmarillo.getElemento().getFicha()
                };
                ModeladorDeTablas.nuevaFila(PacientesUrgencia, filaNueva);
                tempAmarillo = tempAmarillo.getNodoSig();
            }
        } else {

            ModeladorDeTablas.vaciarTabla(PacientesUrgencia);
            Object[] filaNueva;
            HeapNodo<Persona> tempAmarillo = HeapsesperaA.getInicio();
            HeapNodo<Persona> tempVerde = HeapsesperaV.getInicio();

            System.out.println(HeapsesperaV.getSize());
            for (int i = 0; i < HeapsesperaV.getSize(); i++) {
                filaNueva = new Object[]{
                    tempVerde.getElemento().getNombre(),
                    tempVerde.getElemento().getEnfermedad().getNombre(),
                    tempVerde.getElemento().getFicha(),
                    tempVerde.getElemento().getGravedad().getEstado()
                };
                ModeladorDeTablas.nuevaFila(PacientesUrgencia, filaNueva);
                tempVerde = tempVerde.getHijoIzquierdo();
            }

            System.out.println(HeapsesperaA.getSize());
            for (int i = 0; i < HeapsesperaA.getSize(); i++) {

                filaNueva = new Object[]{
                    tempAmarillo.getElemento().getNombre(),
                    tempAmarillo.getElemento().getEnfermedad().getNombre(),
                    tempAmarillo.getElemento().getFicha()
                };
                ModeladorDeTablas.nuevaFila(PacientesUrgencia, filaNueva);
                tempAmarillo = tempAmarillo.getHijoIzquierdo();
            }
        }
    }
//constructor

    public PantallaPrincipal(GestionConsultorio gestionConsultorio) {
        this.gestorConsultorio = gestionConsultorio;
        initComponents();
        poblarComboboxColorCB();
        poblarComboboxPadecimientosCB();
        actualizarTablaUrgencia();
        actualizarTablaEmergencia();
        actualizarTablaEgresado();
        int cont = 0;

    }
//constructor con todas las variables de la ventana con figuracion

    public PantallaPrincipal(GestionConsultorio gestionConsultorio, String codigoverde, String codigoamarillo, String codigorojo, String codigoegreso, Cola ColaesperaV, Cola ColaesperaA, Cola ColaesperaR, Cola ColaesperaE, Heaps HeapsesperaV, Heaps HeapsesperaA, Heaps HeapsesperaR, Heaps HeapsesperaE) {
        this.gestorConsultorio = gestionConsultorio;
        initComponents();
        poblarComboboxColorCB();
        poblarComboboxPadecimientosCB();
        actualizarTablaUrgencia();
        actualizarTablaEmergencia();
        actualizarTablaEgresado();
        int cont = 0;
        this.codigoverde = codigoverde;
        this.codigoamarrilo = codigoamarillo;
        this.codigorojo = codigorojo;
        this.codigoegresado = codigoegreso;
        this.ColaesperaV = ColaesperaV;
        this.ColaesperaA = ColaesperaA;
        this.ColaesperaR = ColaesperaR;
        this.ColaesperaE = ColaesperaE;
        this.HeapsesperaV = HeapsesperaV;
        this.HeapsesperaA = HeapsesperaA;
        this.HeapsesperaR = HeapsesperaR;
        this.HeapsesperaE = HeapsesperaE;
    }
//metodo para poblar los combobox para los enums 

    public void poblarComboboxColorCB() {
        ArrayList<EnumColores> valores = new ArrayList<>();
        valores.addAll(Arrays.asList(EnumColores.values()));

        for (int i = 0; i < valores.size(); i++) {
            ColorCB.addItem(valores.get(i).estado);
        }

    }
//metodo para poblar los combobox para los enums 

    public void poblarComboboxPadecimientosCB() {
        ArrayList<EnumEnfermedad> valores = new ArrayList<>();
        valores.addAll(Arrays.asList(EnumEnfermedad.values()));

        for (int i = 0; i < valores.size(); i++) {
            PadecimientosCB.addItem(valores.get(i).nombre);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        BotonConfijuracion = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        BotonAdmin = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Textnombre = new javax.swing.JTextField();
        BotonAgregar = new javax.swing.JButton();
        PadecimientosCB = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ColorCB = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        TextEdad = new javax.swing.JTextField();
        FechaNacimiento = new com.toedter.calendar.JDateChooser();
        TextFicha = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        PacientesEmergencia = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaEmergencias = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        AtenderEmergencia = new javax.swing.JButton();
        LyAEmergencia = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaEgresados = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        PacientesUrgencia = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaUrgencias = new javax.swing.JTable();
        AtenderUrgencias = new javax.swing.JButton();
        LyAUrgencias = new javax.swing.JButton();
        BotonEncuesta = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TEC Emergency");
        setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.activeBorderColor"));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        BotonConfijuracion.setBackground(new java.awt.Color(0, 204, 204));
        BotonConfijuracion.setText("Configuracion");
        BotonConfijuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConfijuracionActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 36)); // NOI18N
        jLabel4.setText("TEC Emergency");

        BotonAdmin.setBackground(new java.awt.Color(0, 204, 204));
        BotonAdmin.setText("Administracion");
        BotonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAdminActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 18)); // NOI18N
        jLabel5.setText("Ingreso de pacientes");

        jLabel12.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 18)); // NOI18N
        jLabel12.setText("Lista espera Emergencias");

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 18)); // NOI18N
        jLabel6.setText("Lista de espera Emergencia ");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setText("Nombre del paciente");

        jLabel2.setText("Fecha de nacimento");

        jLabel3.setText("Detalle del padecimiento ");

        Textnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextnombreActionPerformed(evt);
            }
        });

        BotonAgregar.setBackground(new java.awt.Color(0, 204, 204));
        BotonAgregar.setText("Agregar paciente");
        BotonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarActionPerformed(evt);
            }
        });

        PadecimientosCB.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PadecimientosCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                PadecimientosCBItemStateChanged(evt);
            }
        });
        PadecimientosCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PadecimientosCBActionPerformed(evt);
            }
        });

        jLabel10.setText("Valoracion del paciente ");

        ColorCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColorCBActionPerformed(evt);
            }
        });

        jLabel11.setText("Edad");

        TextFicha.setEditable(false);
        TextFicha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TextFicha.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(TextFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ColorCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TextEdad)
                                    .addComponent(Textnombre)
                                    .addComponent(PadecimientosCB, 0, 180, Short.MAX_VALUE)
                                    .addComponent(FechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(124, 124, 124))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(BotonAgregar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Textnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(FechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TextEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(PadecimientosCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(ColorCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonAgregar)
                    .addComponent(TextFicha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PacientesEmergencia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Paciente", "Prioridad", "Ficha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        PacientesEmergencia.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane4.setViewportView(PacientesEmergencia);
        if (PacientesEmergencia.getColumnModel().getColumnCount() > 0) {
            PacientesEmergencia.getColumnModel().getColumn(0).setResizable(false);
            PacientesEmergencia.getColumnModel().getColumn(1).setResizable(false);
            PacientesEmergencia.getColumnModel().getColumn(2).setResizable(false);
        }

        TablaEmergencias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Consultorio ", "Disponibilidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaEmergencias.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(TablaEmergencias);
        if (TablaEmergencias.getColumnModel().getColumnCount() > 0) {
            TablaEmergencias.getColumnModel().getColumn(0).setResizable(false);
            TablaEmergencias.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 18)); // NOI18N
        jLabel7.setText("Egresados");

        AtenderEmergencia.setBackground(new java.awt.Color(0, 204, 204));
        AtenderEmergencia.setText("Atender ");
        AtenderEmergencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtenderEmergenciaActionPerformed(evt);
            }
        });

        LyAEmergencia.setBackground(new java.awt.Color(0, 204, 204));
        LyAEmergencia.setText("Liberar y Atender");
        LyAEmergencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LyAEmergenciaActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 18)); // NOI18N
        jLabel13.setText("Lista espera Urgencias");

        TablaEgresados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Estado", "prioridad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaEgresados.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane3.setViewportView(TablaEgresados);
        if (TablaEgresados.getColumnModel().getColumnCount() > 0) {
            TablaEgresados.getColumnModel().getColumn(0).setResizable(false);
            TablaEgresados.getColumnModel().getColumn(1).setResizable(false);
        }

        PacientesUrgencia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Paciente", "Prioridad", "Ficha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        PacientesUrgencia.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane5.setViewportView(PacientesUrgencia);
        if (PacientesUrgencia.getColumnModel().getColumnCount() > 0) {
            PacientesUrgencia.getColumnModel().getColumn(0).setResizable(false);
            PacientesUrgencia.getColumnModel().getColumn(1).setResizable(false);
            PacientesUrgencia.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 18)); // NOI18N
        jLabel8.setText("Lista de espera Urgencia");

        TablaUrgencias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Consultorio", "Disponibilidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaUrgencias.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(TablaUrgencias);
        if (TablaUrgencias.getColumnModel().getColumnCount() > 0) {
            TablaUrgencias.getColumnModel().getColumn(0).setResizable(false);
        }

        AtenderUrgencias.setBackground(new java.awt.Color(0, 204, 204));
        AtenderUrgencias.setText("Atender ");
        AtenderUrgencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtenderUrgenciasActionPerformed(evt);
            }
        });

        LyAUrgencias.setBackground(new java.awt.Color(0, 204, 204));
        LyAUrgencias.setText("Liberar y Atender");
        LyAUrgencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LyAUrgenciasActionPerformed(evt);
            }
        });

        BotonEncuesta.setBackground(new java.awt.Color(0, 204, 204));
        BotonEncuesta.setText("Llenar encuesta final");
        BotonEncuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEncuestaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonConfijuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(238, 238, 238)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(46, 46, 46))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(BotonEncuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(AtenderUrgencias)
                                    .addGap(183, 183, 183)
                                    .addComponent(LyAUrgencias))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(73, 73, 73)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(AtenderEmergencia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LyAEmergencia))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 23, Short.MAX_VALUE))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonConfijuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AtenderEmergencia)
                            .addComponent(LyAEmergencia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LyAUrgencias)
                    .addComponent(BotonEncuesta)
                    .addComponent(AtenderUrgencias))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void BotonConfijuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConfijuracionActionPerformed
        Configuracion verconfiguracion = new Configuracion();
        verconfiguracion.setVisible(true);
        dispose();

    }//GEN-LAST:event_BotonConfijuracionActionPerformed

    private void TextnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextnombreActionPerformed

    private void BotonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarActionPerformed
        //extrae los datos ingresados por el cliente
        String nombre = Textnombre.getText();
        String fecha = FechaNacimiento.getDate().toLocaleString();
        String edad = TextEdad.getText();
        EnumColores gravedad = (EnumColores) EnumColores.valueOf(ColorCB.getSelectedItem().toString().trim().toUpperCase());
        EnumEnfermedad enfermedad = EnumEnfermedad.valueOf(PadecimientosCB.getModel().getSelectedItem().toString().toUpperCase());
        String ficha = Character.toString(enfermedad.getId()) + "-" + Character.toString(gravedad.getId()) + "-" + Integer.toString(cont += 1);
        TextFicha.setText("Su ficha es: " + ficha);
        
        //crea el paciente
        Persona paciente = new Persona(nombre, edad, fecha, gravedad, enfermedad, ficha);
        
        /*
        en los soguientes ifs, se da la seleccion de la estructura de datos que el cliente eliga 
        el codigo, como por ejemplo codigoverde, es un codigo creado pro nosotros, para que sea mas facil de identificar cual estructura elijio el cliente
        tambien se inicializan las colas o los heaps 
         */
        if (ColorCB.getSelectedItem().toString().trim().toUpperCase().equals("VERDE")) {
            if (this.codigoverde.equals("cola")) {
                this.ColaesperaV.agregar(paciente);
            } else {
                this.HeapsesperaV.agregar(paciente);
            }
        }

        if (ColorCB.getSelectedItem().toString().trim().toUpperCase().equals("AMARRILO")) {
            if (this.codigoamarrilo.equals("cola")) {
                this.ColaesperaA.agregar(paciente);
            } else {
                this.HeapsesperaA.agregar(paciente);
            }
        }

        if (ColorCB.getSelectedItem().toString().trim().toUpperCase().equals("ROJO")) {
            if (this.codigorojo.equals("cola")) {
                this.ColaesperaR.agregar(paciente);
            } else {
                this.HeapsesperaR.agregar(paciente);
            }
        }
        TablaEsperaEmergencia();
        TablaEsperaUrgencia();
        //vacia los textfield para estar listos para un cliente nuevo 
        Textnombre.setText("");
        FechaNacimiento.setCalendar(null);
        TextEdad.setText("");
    }//GEN-LAST:event_BotonAgregarActionPerformed

    private void PadecimientosCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PadecimientosCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PadecimientosCBActionPerformed

    private void AtenderEmergenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtenderEmergenciaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_AtenderEmergenciaActionPerformed

    private void AtenderUrgenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtenderUrgenciasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AtenderUrgenciasActionPerformed

    private void LyAEmergenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LyAEmergenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LyAEmergenciaActionPerformed

    private void LyAUrgenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LyAUrgenciasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LyAUrgenciasActionPerformed

    private void PadecimientosCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_PadecimientosCBItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_PadecimientosCBItemStateChanged

    private void ColorCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColorCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ColorCBActionPerformed

    private void BotonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAdminActionPerformed
        Administrador verAdmin = new Administrador();
        verAdmin.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotonAdminActionPerformed

    private void BotonEncuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEncuestaActionPerformed
        EncuestaSalida verEncuesta = new EncuestaSalida();
        verEncuesta.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotonEncuestaActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtenderEmergencia;
    private javax.swing.JButton AtenderUrgencias;
    private javax.swing.JButton BotonAdmin;
    private javax.swing.JButton BotonAgregar;
    private javax.swing.JButton BotonConfijuracion;
    private javax.swing.JButton BotonEncuesta;
    private javax.swing.JComboBox<String> ColorCB;
    private com.toedter.calendar.JDateChooser FechaNacimiento;
    private javax.swing.JButton LyAEmergencia;
    private javax.swing.JButton LyAUrgencias;
    private javax.swing.JTable PacientesEmergencia;
    private javax.swing.JTable PacientesUrgencia;
    private javax.swing.JComboBox<String> PadecimientosCB;
    private javax.swing.JTable TablaEgresados;
    private javax.swing.JTable TablaEmergencias;
    private javax.swing.JTable TablaUrgencias;
    private javax.swing.JTextField TextEdad;
    private javax.swing.JTextField TextFicha;
    private javax.swing.JTextField Textnombre;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}
