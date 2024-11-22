package Modelo;

import java.time.LocalDate;

public class Cuenta {
    //Definir tributos
    private String Numero;
    private String Tipo ;
    private Titular Titular;
    private LocalDate FechaApertura;
    private double Saldo;
    private String Clave;
    private String ClaveDinamica;
    
    //Definir Métodos

    public Cuenta() {
    }

    public Cuenta(String Numero, String Tipo, Titular Titular, LocalDate FechaApertura, double Saldo, String Clave, String ClaveDinamica) {
        this.Numero = Numero;
        this.Tipo = Tipo;
        this.Titular = Titular;
        this.FechaApertura = FechaApertura;
        this.Saldo = Saldo;
        this.Clave = Clave;
        this.ClaveDinamica = ClaveDinamica;
    }

    public String getNumero() {
        return this.Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getTipo() {
        return this.Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public Titular getTitular() {
        return this.Titular;
    }

    public void setTitular(Titular Titular) {
        this.Titular = Titular;
    }

    public LocalDate getFechaApertura() {
        return this.FechaApertura;
    }

    public void setFechaApertura(LocalDate FechaApertura) {
        this.FechaApertura = FechaApertura;
    }

    public double getSaldo() {
        return this.Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public String getClave() {
        return this.Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public String getClaveDinamica() {
        return this.ClaveDinamica;
    }

    public void setClaveDinamica(String ClaveDinamica) {
        this.ClaveDinamica = ClaveDinamica;
    }
    
    
}
