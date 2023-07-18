package org.lindap.cuentaBancaria.main;

import org.lindap.cuentaBancaria.files.Cliente;
import org.lindap.cuentaBancaria.files.Cuenta;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {

        int option=0, deposito=0, retiro=0;
        Scanner s = new Scanner(System.in);
        Cliente linda = new Cliente("Linda", "Prieto", "PIOL960730F57");
        Cuenta li = new Cuenta(100001, 3562, 30);
        do {
            System.out.println("........................:Banco Mágico:.....................");
            System.out.println("¿Qué operación desea realizar?");
            System.out.println("1.Consultar estado de cuenta");
            System.out.println("2.Actualizar saldo");
            System.out.println("3.Realizar un depósito");
            System.out.println("4.Realizar un retiro");
            System.out.println("5.Salir");
            option = s.nextInt();
            switch (option) {
                case 1:
                System.out.println(".............................................");
                System.out.println(linda);
                System.out.println(li);
                break;
                case 2:
                    System.out.println("...........................................");
                    System.out.println("Saldo de la cuenta" +
                            "aplicando interés diario: " + "$" + String.format("%.2f",li.actualizarSaldo()));
                    break;
                case 3:
                    System.out.println("...........................................");
                    System.out.println("Ingrese el monto que desea depositar: ");
                    deposito = s.nextInt();
                    System.out.println("Su nuevo saldo es de: " + "$" + li.ingresar(deposito));
                    break;
                case 4:
                    System.out.println("...........................................");
                    System.out.println("Ingrese el monto que desea retirar: ");
                    retiro = s.nextInt();
                    System.out.println("Su nuevo saldo es de: " + "$" + li.retirar(retiro));
            }
        }while(option!=5);
    }
}