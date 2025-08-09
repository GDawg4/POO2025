public class Carro2 {
    byte gasolina;
    String color;
    int anio;
    String marca;
    String modelo;

    public byte getGasolina() {
        return gasolina;
    }
    public void setGasolina(byte gasolina) {
        this.gasolina = gasolina;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Carro2(byte gasolina, String color, int anio, String marca, String modelo) {
        this.gasolina = gasolina;
        this.color = color;
        this.anio = anio;
        this.marca = marca;
        this.modelo = modelo;
    }
    public Carro2(byte gasolina, int anio, String marca, String modelo) {
        this.gasolina = gasolina;
        this.color = "Rojo";
        this.anio = anio;
        this.marca = marca;
        this.modelo = modelo;
    }

    

}