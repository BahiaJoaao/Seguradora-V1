package com.mycompany.seguradora;

public class Seguradora {

    public static void main(String[] args) {
     
        
        SeguroVida segVida = new SeguroVida("Bahia", 10000.00, 18);
        System.out.println("Valor do premio: " + segVida.valorPremio());
        
        SeguroCasa segCasa = new SeguroCasa("Bahia", 15000.50, "Costa Azul", 2020);
        System.out.println("Valor do premio: " + segCasa.valorPremio());
        
        SeguroAuto segAuto = new SeguroAuto("Volvo", 25000.00, 2019, "BA1SEA");
        System.out.println("Valor do premio: " + segAuto.valorPremio());

    }

}
