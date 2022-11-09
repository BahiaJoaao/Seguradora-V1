package com.mycompany.seguradora;

public class SeguroAuto extends Seguro{
    
    protected Integer ano;
    protected String chassi;
    
    public SeguroAuto(String nome, Double valor, Integer ano, String Chassi){
        
        super(nome, valor);
        this.ano = ano;
        this.chassi = chassi;
        
    }
    @Override
    public Double valorPremio(){
        Double valor = this.valor;
        Integer ano = 2022 - this.ano;
        
        valor = ((valor * 0.90) * (ano * 0.02));
        
        return valor;
        
    }
  }