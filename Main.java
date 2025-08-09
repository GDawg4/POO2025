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
        miCarro1.agregarGasolina(50f);
        System.out.println(miCarro1.getGasolinaActual());
        System.out.println(miCarro1.avanzar(400f));
        System.out.println(miCarro1.getGasolinaActual());
        System.out.println(miCarro1.getKilometraje());
    }
}