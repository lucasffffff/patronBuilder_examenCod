/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patronbuilder_casa;

/**
 *
 * @author lucas
 */
public class PatronBuilder_casa {

    public static void main(String[] args) {
        // Creación de casas usando el constructor privado de clase Casa
        Casa casa1 = new Casa(2, 3, true, true, "Tejas", "Madera", "Ventanas de PVC");
        Casa casa2 = new Casa(1, 2, false, false, "Chapa", "Cerámica", "Ventanas de Aluminio");

        System.out.println("Casa 1: " + casa1.toString());
        System.out.println("Casa 2: " + casa2.toString());

        // Creación de casas usando el patrón Builder
        Casa casaBuilder1 = new CasaBuilder()
                .setNumeroPisos(3)
                .setNumeroHabitaciones(4)
                .setTieneJardin(true)
                .setTieneGaraje(true)
                .setTipoTechos("Tejas")
                .setTipoPisos("Marmol")
                .setTipoVentanas("Ventanas de PVC")
                .build();

        Casa casaBuilder2 = new CasaBuilder()
                .setNumeroPisos(1)
                .setNumeroHabitaciones(3)
                .setTieneJardin(false)
                .setTieneGaraje(true)
                .setTipoTechos("Chapa")
                .setTipoPisos("Madera")
                .setTipoVentanas("Ventanas de Aluminio")
                .build();

        System.out.println("Casa Builder 1: " + casaBuilder1.toString());
        System.out.println("Casa Builder 2: " + casaBuilder2.toString());
    }
}

