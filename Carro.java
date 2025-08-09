class Carro{
    /* Cambiar a enum, eventualmente */
    String color;
    String marca;
    String linea;
    Short modelo;
    /* True es autom_tico */
    Boolean transmision;
    Byte capacidadGasolina;
    private Float eficienciaGasolina;
    Integer kilometraje;

    public Carro(
        String color, 
        String marca, 
        String linea, 
        Short modelo, 
        Boolean transmision, 
        Byte capacidadGasolina,
        Float eficienciaGasolina, 
        Integer kilometraje
        ){
            this.color = color;
            this.marca = marca;
            this.linea = linea;
            this.modelo = modelo;
            this.transmision = transmision;
            this.capacidadGasolina = capacidadGasolina;
            this.eficienciaGasolina = eficienciaGasolina;
            this.kilometraje = kilometraje;
    }

    public Float getEficienciaGasolina(){
        return this.eficienciaGasolina;
    }
}