package org.lindap.cuentaBancaria.files;

public class Cuenta {
    private int nCuenta;
    private double saldo;
    private double interes;
    private double interesDiario;
    private double deposito;
    private double retiro;
    public Cuenta() {
    }

    public Cuenta(int nCuenta, double saldo) {
        this.nCuenta = nCuenta;
        this.saldo = saldo;
    }

    public Cuenta(int nCuenta, double saldo, double interes) {
        this.nCuenta = nCuenta;
        this.saldo = saldo;
        this.interes = interes;
    }

    public Cuenta(int nCuenta, double saldo, double interes, double interesDiario) {
        this.nCuenta = nCuenta;
        this.saldo = saldo;
        this.interes = interes;
        this.interesDiario = interesDiario;
    }

    public Cuenta(int saldo, int interes) {
        this.saldo = saldo;
        this.interes = interes;
    }
    public int numeroCuenta(){
        nCuenta = 100001;
        return nCuenta;
    }

    public int getnCuenta() {
        return nCuenta;
    }

    public void setnCuenta(int i) {
        this.nCuenta = nCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getInteresDiario() {
        interesDiario = interes/365;
        return interesDiario;
    }

    public double actualizarSaldo(){
        interes = (8*saldo)/100;
        return this.saldo + interes;

    }
    public double ingresar(double deposito){
        this.deposito = deposito;
        this.saldo = this.deposito + this.saldo;
        return this.saldo;
    }
    public double retirar(double retiro){
        this.retiro = retiro;
        this.saldo = this.saldo - this.retiro;
        return this.saldo;
    }

    @Override
    public String toString() {
        return "Número de cuenta: " + nCuenta
                + "\nSaldo actual: " + "$" + saldo
                + "\nInteres anual: " + interes
                + "\nInteres diario: " + interesDiario;
    }
}
