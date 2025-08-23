import java.util.ArrayList;

class Garaje {
    private String nombre;
    private Integer maxCapacidad;
    private ArrayList<Carro> carros;

    public Garaje(String nombre, Integer maxCapacidad){
        this.nombre = nombre;
        this.maxCapacidad = maxCapacidad;
        this.carros = new ArrayList<Carro>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getMaxCapacidad() {
        return maxCapacidad;
    }

    public void setMaxCapacidad(Integer maxCapacidad) {
        this.maxCapacidad = maxCapacidad;
    }

    public ArrayList<Carro> getCarros() {
        return carros;
    }

    public void setCarros(ArrayList<Carro> carros) {
        this.carros = carros;
    }

    private Integer getCapacidadActual(){
        return this.maxCapacidad - this.carros.size();
    }

    private Boolean actualizarCarros(ArrayList<Carro> carrosAvisar){
        for (Carro carro : carrosAvisar){
            carro.setGaraje(this);
        }
        return true;
    }

    /*
     * casoCapMax true -> Agregar todos los carros que quepan
     *            false -> Agregar solo si caben todos los carros
     * 
     * [x for x in lista if x != 0]
     */
    public Boolean agregarCarros(ArrayList<Carro> carrosNuevos, Boolean agregadoParcial){
        carrosNuevos.removeIf(carro -> carro.getGaraje() == this);
        Integer capacidadActual = this.getCapacidadActual();
        if (capacidadActual >= carrosNuevos.size()){
            this.actualizarCarros(carrosNuevos);
            this.carros.addAll(carrosNuevos);
            return true;
        }
        if (!agregadoParcial){
            return false;
        }
        ArrayList<Carro> carrosAgregar = new ArrayList<Carro>(carrosNuevos.subList(0,capacidadActual));
        this.carros.addAll(carrosAgregar);
        this.actualizarCarros(carrosAgregar);
        return true;
    }

    public Boolean verCarros(){
        for(Carro carro: this.carros){
            System.out.println(carro.toString());
        }
        return true;
    }
    
}