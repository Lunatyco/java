package Modelo;

public class Clientes {
    private String rutCliente;
    private String dvCliente;
    private int numeroCelular;
    private int montoPlan;
    private String direccion; //debes modificar el combo para que se recupere en direccion
    private String comuna;
    private String region;
    private int renta;
    

    public Clientes(String rutCliente, String dvCliente, int numeroCelular, int montoPlan, String direccion, String comuna, String region, int renta) {
        this.rutCliente = rutCliente;
        this.dvCliente=dvCliente;
        this.numeroCelular = numeroCelular;
        this.montoPlan = montoPlan;
        this.direccion = direccion;
        this.comuna=comuna;
        this.region=region;
        this.renta = renta;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getDvCliente() {
        return dvCliente;
    }

    public void setDvCliente(String dvRutCliente) {
        this.dvCliente = dvRutCliente;
    }

    public int getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(int numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public int getMontoPlan() {
        return montoPlan;
    }

    public void setMontoPlan(int montoPlan) {
        this.montoPlan = montoPlan;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getRenta() {
        return renta;
    }

    public void setRenta(int renta) {
        this.renta = renta;
    }
    
    public String obtenerCategoriaCliente(){
        String categoria = null;
        if(montoPlan < 10000){
            categoria = "El Cliente es de Categoria Bronce";
        }
        else if(montoPlan >10000 && montoPlan < 20000){
            categoria = "El Cliente es de Categoria Plata";
        }
        else if(montoPlan > 20000){
            categoria = "El Cliente es de Categoria Oro";
        }
        return categoria;
    }
    
    public String clienteTieneCampana(){
        String campana = null;
        if(renta > 1000000){
            campana = "Cliente se considera en campaña";
        }else{
            campana = "Cliente no se considera en campaña";
        }
        return campana;
    }
    
    
    
}
