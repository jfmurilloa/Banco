package Modelo;

import java.time.LocalDate;

public class Titular {
    //Definir Atributos
    private String Documento;
    private String Nombres;
    private String Apellidos;
    private String Genero;
    private String Direccion ;
    private String Celular;
    private String Correo;
    private LocalDate FechaNacimiento;
    private String Tipo;
    
    //Definir Métodos

    public Titular() {
    }

    public Titular(String Documento, String Nombres, String Apellidos, String Genero, String Direccion, String Celular, String Correo, LocalDate FechaNacimiento, String Tipo) {
        this.Documento = Documento;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Genero = Genero;
        this.Direccion = Direccion;
        this.Celular = Celular;
        this.Correo = Correo;
        this.FechaNacimiento = FechaNacimiento;
        this.Tipo = Tipo;
    }

    public String getDocumento() {
        return this.Documento;
    }

    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }

    public String getNombres() {
        return this.Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return this.Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getGenero() {
        return this.Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getDireccion() {
        return this.Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCelular() {
        return this.Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getCorreo() {
        return this.Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public LocalDate getFechaNacimiento() {
        return this.FechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getTipo() {
        return this.Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
}
