import static java.lang.Math.*;

class Carro{
    /* Cambiar a enum, eventualmente */
    private String color;
    private String marca;
    private String linea;
    private Short modelo;
    /* True es autom_tico */
    private Boolean transmision;
    private Byte capacidadGasolina; /* litros */
    private Float eficienciaGasolina; /* km/litro */
    private Float kilometraje;
    private Float gasolinaActual;
    /*
     * km/litro * 1/km = 1/litro
     */

    public Carro(
        String color, 
        String marca, 
        String linea, 
        Short modelo, 
        Boolean transmision, 
        Byte capacidadGasolina,
        Float eficienciaGasolina, 
        Float kilometraje
        ){
            this.color = color;
            this.marca = marca;
            this.linea = linea;
            this.modelo = modelo;
            this.transmision = transmision;
            this.capacidadGasolina = capacidadGasolina;
            this.eficienciaGasolina = eficienciaGasolina;
            this.kilometraje = kilometraje;
            this.gasolinaActual = 0f;
    }

    public Float getEficienciaGasolina(){
        return this.eficienciaGasolina;
    }

    public Float getKilometraje(){
        return this.kilometraje;
    }

    public String getColor(){
        return this.color;
    }

    public Float getGasolinaActual(){
        return this.gasolinaActual;
    }

    protected Boolean setColor(String newColor){
        this.color = newColor;
        return true;
    }

    protected Float agregarGasolina(Float gasolina){
        Float gasolinaAgregada;
        if ((this.gasolinaActual + gasolina) > this.capacidadGasolina){
            gasolinaAgregada = this.capacidadGasolina - this.gasolinaActual;
        } else {
            gasolinaAgregada = gasolina;
        }
        this.gasolinaActual = min(
            this.capacidadGasolina, 
            this.gasolinaActual+gasolina
            );
        return gasolinaAgregada;
    }

    protected Float quitarGasolina(Float gasolina){
        Float gasolinaQuitada;
        if ((this.gasolinaActual - gasolina) < 0){
            gasolinaQuitada = this.gasolinaActual;
        } else {
            gasolinaQuitada = gasolina;
        }
        this.gasolinaActual = max(
            0, 
            this.gasolinaActual-gasolina
            );
        return gasolinaQuitada;
        
    }

    protected Boolean aumentarKilometraje(Float kmAvanzados){
        if (kmAvanzados > 0){
            this.kilometraje = this.kilometraje + kmAvanzados;
            return true;
        }
        return false;
    }

    private Float calcularKmGasolinaDisponibles(){
        return this.capacidadGasolina * this.eficienciaGasolina;
    }

    protected Float avanzar(Float kmAvanzados){
        if (kmAvanzados <= 0){
            return 0f;
        }
        Float capacidadAvanzar = this.calcularKmGasolinaDisponibles();
        if (capacidadAvanzar >= kmAvanzados){
            this.aumentarKilometraje(kmAvanzados);
            Float gasolinaAQuitar = this.getEficienciaGasolina()*1/kmAvanzados;
            this.quitarGasolina(1/gasolinaAQuitar);
            return kmAvanzados;
        } else {
            Float kmRealmenteAvanzados = kmAvanzados - capacidadAvanzar;
            this.aumentarKilometraje(kmRealmenteAvanzados);
            Float gasolinaAQuitar = this.getEficienciaGasolina()*1/kmRealmenteAvanzados;
            this.quitarGasolina(1/gasolinaAQuitar);
            return kmRealmenteAvanzados;
        }
    }

}