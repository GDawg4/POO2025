public class Main {
    public static void main(String[] args){
        Short modelo = 2025;
        Byte capacidadGasolina = 48;
        Float eficienciaGasolina = (Float)(float)11.0;
        Integer kilometraje = 0;

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
        System.out.println("Eficiencia 1:");
        System.out.println(miCarro1.getEficienciaGasolina());
    }
}