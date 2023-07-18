package org.lindap.cuentaBancaria.main;

import org.lindap.cuentaBancaria.files.Cliente;
import org.lindap.cuentaBancaria.files.Cuenta;

public class Main {
    public static void main(String[] args) {

        System.out.println(".:Banco Mágico:.");
        Cliente linda = new  Cliente("Linda", "Prieto","PIOL960730F57");
        Cuenta li = new Cuenta(100001,3562,30);

        Cliente memo = new Cliente("Guillermo", "Guerra","GFGT881031888");
        Cuenta me = new Cuenta(1000002,5600,20);

        System.out.println("....................................................");
        System.out.println(linda);
        System.out.println(li);

        System.out.println(new StringBuilder().append("Saldo con interés del ")
                .append(String.format("%.2f", li.getInteresDiario()))
                .append("% ").append("diario: ").append("$")
                .append(String.format("%.2f", li.actualizarSaldo())));
        System.out.println("...................................................");
        System.out.println("Deposito (200):" + li.ingresar(200));
        System.out.println("...................................................");
        System.out.println("Retiro(150): " + li.retirar(150));
        System.out.println("...................................................");
        System.out.println("Saldo actualizado: " +  li.getSaldo());
        System.out.println("...................................................");
        System.out.println(memo);
        System.out.println(me);
        System.out.println(new StringBuilder().append("Saldo con interés del ")
                .append(String.format("%.2f", me.getInteresDiario()))
                .append("% ").append("diario: ").append("$")
                .append(String.format("%.2f", me.actualizarSaldo())));
        System.out.println("...................................................");
        System.out.println("Deposito (200):" + me.ingresar(200));
        System.out.println("...................................................");
        System.out.println("Retiro(150): " + me.retirar(150));
        System.out.println("...................................................");
        System.out.println("Saldo actualizado: " + me.getSaldo());
        System.out.println("...................................................");

    }
}