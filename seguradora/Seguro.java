package com.mycompany.seguradora;

public abstract class Seguro {

    protected String nome;
    protected Double valor;
    
    public Seguro(String nome, Double valor){
        
        this.nome = nome;
        this.valor = valor;
        // Construtor
        
    }
    
    public abstract Double valorPremio();
   
    public Double getValor(){
        
        return this.valor;
    }
    
    public void setValor(Double valor){
       
       this.valor = valor;
               
   }
   
   public String getNome(){
       
       return this.nome;
       
   }
   
   public void setNome(String nome){
       
       this.nome = nome;
   }
}
