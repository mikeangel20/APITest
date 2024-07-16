package com.example.model;

import jakarta.persistence.*;

@Entity
public class Cliente{

    @Id
    @Column(name = "idCliente", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private Integer IdCliente;
    private String Codigo;
    private String Nombre;
    private String Apellido;
    private String Email;
    private String Direccion;

    public Cliente() {
    }

    public Cliente(String Codigo, String Nombre, String Apellido, String Email, String Direccion) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Email = Email;
        this.Direccion = Direccion;
    }

    public Integer getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(Integer IdCliente) {
        this.IdCliente = IdCliente;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" + "IdCliente=" + IdCliente + ", Codigo=" + Codigo + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", Email=" + Email + ", Direccion=" + Direccion + '}';
    }

}
