/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronbuilder_casa;

/**
 *
 * @author lucas
 */
public class CasaBuilder {
    private int numeroPisos;
    private int numeroHabitaciones;
    private boolean tieneJardin;
    private boolean tieneGaraje;
    private String tipoTechos;
    private String tipoPisos;
    private String tipoVentanas;

    public CasaBuilder setNumeroPisos(int numeroPisos) {
        this.numeroPisos = numeroPisos;
        return this;
    }

    public CasaBuilder setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
        return this;
    }

    public CasaBuilder setTieneJardin(boolean tieneJardin) {
        this.tieneJardin = tieneJardin;
        return this;
    }

    public CasaBuilder setTieneGaraje(boolean tieneGaraje) {
        this.tieneGaraje = tieneGaraje;
        return this;
    }

    public CasaBuilder setTipoTechos(String tipoTechos) {
        this.tipoTechos = tipoTechos;
        return this;
    }

    public CasaBuilder setTipoPisos(String tipoPisos) {
        this.tipoPisos = tipoPisos;
        return this;
    }

    public CasaBuilder setTipoVentanas(String tipoVentanas) {
        this.tipoVentanas = tipoVentanas;
        return this;
    }

    public Casa build() {
        return new Casa(numeroPisos, numeroHabitaciones, tieneJardin, tieneGaraje, tipoTechos, tipoPisos, tipoVentanas);
    }
}

