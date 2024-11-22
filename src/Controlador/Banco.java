package Controlador;
import Modelo.Cuenta;
import Modelo.Titular;
import java.util.ArrayList;

public class Banco {
    //Definir atributos
    private String Nit;
    private String RazonSocial;
    private ArrayList<Cuenta> Cuentas;
    private ArrayList<Titular> Clientes;
    
    //Definir Métodos

    public Banco() {
        this.Cuentas= new ArrayList<>();
        this.Clientes= new ArrayList<>();
    }

    public Banco(String Nit, String RazonSocial) {
        this.Nit = Nit;
        this.RazonSocial = RazonSocial;
        this.Cuentas= new ArrayList<>();
        this.Clientes= new ArrayList<>();
    }
    

    public String getNit() {
        return this.Nit;
    }

    public void setNit(String Nit) {
        this.Nit = Nit;
    }

    public String getRazonSocial() {
        return this.RazonSocial;
    }

    public void setRazonSocial(String RazonSocial) {
        this.RazonSocial = RazonSocial;
    }

    public ArrayList<Cuenta> getCuentas() {
        return this.Cuentas;
    }
    public ArrayList<Titular> getClientes() {
        return this.Clientes;
    }
    
    public boolean addCliente(Titular obj){
        for(Titular t: this.Clientes){
            if(t.getDocumento().equals(obj.getDocumento())){
                return false;
            }
        }
        this.Clientes.add(obj);
        return true;    
    }
    
    public boolean addCuenta(Cuenta obj){
        for(Cuenta c: this.Cuentas){
            if(c.getNumero().equals(obj.getNumero())){
                return false;
            }
        }
        this.Cuentas.add(obj);
        return true;    
    }
    
    public Titular buscarCliente(String ced){
        Titular obj= null;
        for(Titular t: this.Clientes){
            if(t.getDocumento().equals(ced)){
                obj= t;
                break;
            }
        }
        return obj;
    }
    public Cuenta buscarCuenta(String num){
        Cuenta cta=null;
        for(Cuenta c: this.Cuentas){
            if(c.getNumero().equals(num)){
                cta=c;
                break;
            }
        }
        return cta;
    }    
}
