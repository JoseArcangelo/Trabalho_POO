public class Veiculos{
  protected int id;
  protected String marca;
  protected String modelo;
  protected int anoFabricacao;
  protected double capacidadeTotalBateria;
  protected double autonomiaMaxima;
  protected double tempoMedioRecarga;

  public Veiculos(int anoFabricacao, double autonomiaMaxima, double capacidadeTotalBateria, int id, String marca, String modelo, double tempoMedioRecarga, Frota frota) {
    this.anoFabricacao = anoFabricacao;
    this.autonomiaMaxima = autonomiaMaxima;
    this.capacidadeTotalBateria = capacidadeTotalBateria;
    this.id = id;
    this.marca = marca;
    this.modelo = modelo;
    this.tempoMedioRecarga = tempoMedioRecarga;

    frota.addVeiculo(this);
  }

  public String getModelo() {
      return modelo;
  }

    
  

  
  



  









}