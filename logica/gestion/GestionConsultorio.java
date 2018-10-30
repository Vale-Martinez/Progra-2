package logica.gestion;

import logica.enums.EnumColores;
import logica.estructura.ColaNodo;

import logica.estructura.Cola;
import logica.negocio.consultorio.Consultorio;

public class GestionConsultorio {
    //crea los atributos necesarios
    private Cola<Consultorio> listaConsultoriosVerdes;
    private Cola<Consultorio> listaConsultoriosRojos;
    private Cola<Consultorio> listaConsultoriosAmarillos;
    private Cola<Consultorio> listaConsultoriosEgresados;
    private int NumeroRojo, NumeroVerde, NumeroAmarillo, NumeroEgresados;

    //getters and setters 
    public Cola<Consultorio> getListaConsultoriosEgresados() {
        return listaConsultoriosEgresados;
    }

    public void setListaConsultoriosEgresados(Cola<Consultorio> listaConsultoriosEgresados) {
        this.listaConsultoriosEgresados = listaConsultoriosEgresados;
    }

    public Cola<Consultorio> getListaConsultoriosVerdes() {
        return listaConsultoriosVerdes;
    }

    public void setListaConsultoriosVerdes(Cola<Consultorio> listaConsultoriosVerdes) {
        this.listaConsultoriosVerdes = listaConsultoriosVerdes;
    }

    public Cola<Consultorio> getListaConsultoriosRojos() {
        return listaConsultoriosRojos;
    }

    public void setListaConsultoriosRojos(Cola<Consultorio> listaConsultoriosRojos) {
        this.listaConsultoriosRojos = listaConsultoriosRojos;
    }

    public Cola<Consultorio> getListaConsultoriosAmarillos() {
        return listaConsultoriosAmarillos;
    }

    public void setListaConsultoriosAmarillos(Cola<Consultorio> listaConsultoriosAmarillos) {
        this.listaConsultoriosAmarillos = listaConsultoriosAmarillos;
    }
//constructor
    public GestionConsultorio(int NumeroRojo, int NumeroVerde, int NumeroAmarillo,int NumeroEgresados) {
        this.NumeroRojo = NumeroRojo;
        this.NumeroVerde = NumeroVerde;
        this.NumeroAmarillo = NumeroAmarillo;
        this.NumeroEgresados = NumeroEgresados;
        this.listaConsultoriosAmarillos = new Cola();
        this.listaConsultoriosRojos = new Cola();
        this.listaConsultoriosVerdes = new Cola();
        this.listaConsultoriosEgresados = new Cola();
    }
//agrega consultorios 
    public void agregar() {

        for (int i = 0; i < this.NumeroRojo; i++) {

            Consultorio NuevoConsultorioRojo = new Consultorio("consultorio Rojo #" + String.valueOf(i + 1), EnumColores.ROJO);

            this.listaConsultoriosRojos.agregar(NuevoConsultorioRojo);
        }

        for (int i = 0; i < this.NumeroAmarillo; i++) {

            Consultorio NuevoConsultorioAmarillo = new Consultorio("consultorio Amarillo #" + String.valueOf(i + 1), EnumColores.AMARILLO);
            this.listaConsultoriosAmarillos.agregar(NuevoConsultorioAmarillo);
        }

        for (int i = 0; i < this.NumeroVerde; i++) {

            Consultorio NuevoConsultorioVerde = new Consultorio("consultorio Verde #" + String.valueOf(i + 1), EnumColores.VERDE);
            this.listaConsultoriosVerdes.agregar(NuevoConsultorioVerde);
        }
        for (int i = 0; i < this.NumeroEgresados; i++) {

            Consultorio NuevoConsultorioEgresados = new Consultorio("consultorio Egreso #" + String.valueOf(i + 1), EnumColores.EGRESO);

            this.listaConsultoriosEgresados.agregar(NuevoConsultorioEgresados);
        }
       

    }

}
