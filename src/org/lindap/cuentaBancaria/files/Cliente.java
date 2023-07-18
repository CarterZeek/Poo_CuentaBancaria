package org.lindap.cuentaBancaria.files;

public class Cliente extends Cuenta {

    private String nombre;
    private String apellido;
    private String dni;

    public Cliente() {
    }

    public Cliente(int saldo, int interes, String nombre) {
        super(saldo, interes);
        this.nombre = nombre;
    }

    public Cliente(int saldo, int interes, String nombre, String apellido, String dni) {
        super(saldo, interes);
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public Cliente(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public Cliente(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Cliente: " + nombre + " " + apellido
                + "\nDNI: " + dni;
    }
}
