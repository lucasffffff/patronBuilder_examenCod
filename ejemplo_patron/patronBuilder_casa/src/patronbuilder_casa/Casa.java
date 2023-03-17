/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronbuilder_casa;

/**
 *
 * @author lucas
 */
public class Casa {
    private int numeroPisos;
    private int numeroHabitaciones;
    private boolean tieneJardin;
    private boolean tieneGaraje;
    private String tipoTechos;
    private String tipoPisos;
    private String tipoVentanas;

    public Casa(int numeroPisos, int numeroHabitaciones, boolean tieneJardin, boolean tieneGaraje,
            String tipoTechos, String tipoPisos, String tipoVentanas) {
        this.numeroPisos = numeroPisos;
        this.numeroHabitaciones = numeroHabitaciones;
        this.tieneJardin = tieneJardin;
        this.tieneGaraje = tieneGaraje;
        this.tipoTechos = tipoTechos;
        this.tipoPisos = tipoPisos;
        this.tipoVentanas = tipoVentanas;
    }

    public int getNumeroPisos() {
        return numeroPisos;
    }

    public void setNumeroPisos(int numeroPisos) {
        this.numeroPisos = numeroPisos;
    }

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public boolean isTieneJardin() {
        return tieneJardin;
    }

    public void setTieneJardin(boolean tieneJardin) {
        this.tieneJardin = tieneJardin;
    }

    public boolean isTieneGaraje() {
        return tieneGaraje;
    }

    public void setTieneGaraje(boolean tieneGaraje) {
        this.tieneGaraje = tieneGaraje;
    }

    public String getTipoTechos() {
        return tipoTechos;
    }

    public void setTipoTechos(String tipoTechos) {
        this.tipoTechos = tipoTechos;
    }

    public String getTipoPisos() {
        return tipoPisos;
    }

    public void setTipoPisos(String tipoPisos) {
        this.tipoPisos = tipoPisos;
    }

    public String getTipoVentanas() {
        return tipoVentanas;
    }

    public void setTipoVentanas(String tipoVentanas) {
        this.tipoVentanas = tipoVentanas;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "numeroPisos=" + numeroPisos +
                ", numeroHabitaciones=" + numeroHabitaciones +
                ", tieneJardin=" + tieneJardin +
                ", tieneGaraje=" + tieneGaraje +
                ", tipoTechos='" + tipoTechos + '\'' +
                ", tipoPisos='" + tipoPisos + '\'' +
                ", tipoVentanas='" + tipoVentanas + '\'' +
                '}';
    }
}

