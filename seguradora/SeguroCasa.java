package com.mycompany.seguradora;

public class SeguroCasa extends Seguro{
    
    protected String endereco;
    protected Integer ano;
    
    public SeguroCasa(String nome, Double valor, String endereco, Integer ano){
        
        super(nome, valor);
        this.endereco = endereco;
        this.ano = ano;
    }
    
    @Override
    public Double valorPremio(){
        Double valor = this.valor;
        
        Integer ano = 2022 - this.ano;
        
        valor = (valor *(0.02 * ano));
        
        return valor;
    }
    
    public String getEndereco(){
        
        return this.endereco;
    }
    
    public void setEndereco(String endereco){
        
        this.endereco = endereco;
    }
    
    public void setAno(Integer ano){
        
        this.ano = ano;
        
    }
    
    public Integer getAno(){
        
        return this.ano;
        
    } 
  }