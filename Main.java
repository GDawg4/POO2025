import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Short modelo = 2025;
        Byte capacidadGasolina = 48;
        Float eficienciaGasolina = (Float)(float)11.0;
        Float kilometraje = 0f;

        Carro miCarro1 = new Carro(
            "Rojo", 
            "Mazda", 
            "CX30", 
            modelo, 
            (Boolean)true, 
            capacidadGasolina, 
            eficienciaGasolina, 
            kilometraje
            );

        Carro miCarro2 = new Carro(
            "Azul", 
            "Toyota", 
            "Yaris", 
            modelo, 
            (Boolean)true, 
            capacidadGasolina, 
            eficienciaGasolina, 
            kilometraje
            );
        Garaje miGaraje = new Garaje("Garaje 1", 2);
        ArrayList<Carro> carrosNuevos = new ArrayList<>(Arrays.asList(miCarro1, miCarro2));
        miGaraje.agregarCarros(carrosNuevos, false);
        miGaraje.verCarros();
        
    }
}