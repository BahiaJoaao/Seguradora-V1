package com.mycompany.seguradora;

public class SeguroVida extends Seguro{
     
     private Integer idade;
     
    public SeguroVida(String nome, Double valor, Integer idade){
        
        super(nome, valor);
        this.idade = idade;
        
    }
    
     @Override
    public Double valorPremio(){
        Double valor = this.valor;
        
        if(this.idade < 50){
            
            valor += valor * 0.1;
            
        }
        return valor;
    }
    
    public int getIdade(){
        
        return this.idade;
        
    }
    
    public void setIdade(Integer idade){
        
        this.idade = idade;
        
    }
   
  }
