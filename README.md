# patronBuilder_examenCod

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
• ¿Cuál es la función del patrón builder? Pon ejemplo (que no sea Pizzas)
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
El patrón Builder permite construir objetos complejos de manera gradual y estructurada, evitando la necesidad de crear múltiples constructores o sobrecargar los parámetros de un constructor. Este patrón separa la construcción del objeto de su representación, lo que facilita la creación de diferentes versiones del mismo objeto de manera reutilizable.

Como ejemplo yo creé un código del mismo tipo patron builder pero en lugar de emplear Pizza utilicé Casa. Usé el PatronBuilder para construir objetos Casa con atributos. En la clase CasaBuilder, establecí los mismo atributos que en Casa pero opcionales, también creé métodos para establecer cada atributo y devolver una instancia objeto CasaBuilder. Con el método build concluye la construcción y te devuelve una instancia de la clase Casa. En mi clase main creé objetos utilizando el constructor de la clase Casa y el patron builder con el cual establecí los atributos que quería.

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
¿Como es su Diagrama de clases de este ejemplo que has hecho? Realiza en el readme el diagrama
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
classDiagram
      Main "1" -- "1.." CasaBuilder : association
      class Main{
          +main()
      }
      class CasaBuilder{
          +setDireccion()
          +setTamaño()
          +setHabitaciones()
          +setBaños()
          +setCocheras()
          +build() --> Casa
      }
      CasaBuilder *-- "1" Casa : association
      class Casa{
        -direccion : String
        -tamaño : int
        -habitaciones : int
        -baños : int
        -cocheras : int
        +Casa(String, int, int, int, int)
        +getDireccion() : String
        +getTamaño() : int
        +getHabitaciones() : int
        +getBaños() : int
        +getCocheras() : int
        +toString() : String
      }
      
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
¿Podríamos combinarlo con el patrón Factory? Explícalo con algo de código como lo harías
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

Podemos combinar el patrón Builder con el patrón Factory para crear una fábrica que cree tipos diferentes de casas, podríamos tener una fábrica que cree casas pequeñas, medianas y grandes, con diferentes tamaños, habitaciones, baños...

Código para implementar una fábrica de casas utilizando patron Builder y Factory:
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Clase main:
public class Main {
    
    public static void main(String[] args) {
        
        CasaFactory factory = new CasaFactory();
        
        Casa casaPequeña = factory.crearCasaPequeña();
        Casa casaMediana = factory.crearCasaMediana();
        Casa casaGrande = factory.crearCasaGrande();
        
        System.out.println("Casa Pequeña: " + casaPequeña);
        System.out.println("Casa Mediana: " + casaMediana);
        System.out.println("Casa Grande: " + casaGrande);
    }
}
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Clase CasaFactory:
public class CasaFactory {
    
    public Casa crearCasaPequeña() {
        return new CasaBuilder()
                .setTamaño(100)
                .setHabitaciones(2)
                .setBaños(1)
                .setCocheras(1)
                .setDireccion("Calle A")
                .build();
    }
    
    public Casa crearCasaMediana() {
        return new CasaBuilder()
                .setTamaño(150)
                .setHabitaciones(3)
                .setBaños(2)
                .setCocheras(2)
                .setDireccion("Calle B")
                .build();
    }
    
    public Casa crearCasaGrande() {
        return new CasaBuilder()
                .setTamaño(200)
                .setHabitaciones(4)
                .setBaños(3)
                .setCocheras(3)
                .setDireccion("Calle C")
                .build();
    }
}
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
