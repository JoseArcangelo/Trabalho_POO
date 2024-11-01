
import java.util.ArrayList;
import java.util.List;

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

    public int getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public double getCapacidadeTotalBateria() {
        return capacidadeTotalBateria;
    }

    public double getAutonomiaMaxima() {
        return autonomiaMaxima;
    }

    public double getTempoMedioRecarga() {
        return tempoMedioRecarga;
    }

  
    public void verificarAutonomia(Rota rota) {
      List<Eletropostos> listEletropostos = rota.getEletropostos();
      List<Eletropostos> eletropostosParada = new ArrayList<>();
      List<Integer> aux = new ArrayList<>();

      double distancia = rota.getKmPercorrido();
      
      while(autonomiaMaxima < distancia && listEletropostos.size() > 0){
        System.out.println(distancia + "   " + autonomiaMaxima);
        int contador = 0;
        Eletropostos eletroposto = listEletropostos.get(contador);

        if(eletroposto.getDistancia() <= autonomiaMaxima){
          eletropostosParada.add(eletroposto);
          distancia = rota.getKmPercorrido() - eletroposto.getDistancia();
        }

        if(contador == listEletropostos.size() - 1){
          if(autonomiaMaxima < distancia){
            System.out.println("::ERRO! AUTONOMIA INSUFICIENTE!::");
            break;
          }

          else{
            System.out.println("::Paradas::");
            for(Eletropostos e : eletropostosParada) {
              System.out.println("DISTANCIA ELETROPOSTO: " + e.getDistancia());
            }
          }
          break;
        }          
        contador += 1;      
      }
      


    }


  









}