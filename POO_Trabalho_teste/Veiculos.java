
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

    
  
    public boolean verificarAutonomia(Rota rota, Registro r) {
      List<Eletropostos> listEletropostos = rota.getEletropostos();
      List<Eletropostos> eletropostosParada = new ArrayList<>();
      List<Integer> aux = new ArrayList<>();

      double distancia = rota.getKmPercorrido();
      int contador = 0;
      while(autonomiaMaxima < distancia && contador < listEletropostos.size()){
                
        Eletropostos eletroposto = listEletropostos.get(contador);
        contador += 1;  
      
        eletropostosParada.add(eletroposto);
        distancia = rota.getKmPercorrido() - eletroposto.getDistancia();
            
      }
      if(autonomiaMaxima < distancia){
        return false;
      }
      else{
        for(Eletropostos e : eletropostosParada) {
          r.addRegistroRecarga("-> ELETROPOSTO DA ROTA: " + rota.getOrigem() + "/" + rota.getDestino() + ", VEICULO " + "Modelo: " + modelo + ", Marca: " + marca);
        }
        System.out.println("::Paradas::");
        for(Eletropostos e : eletropostosParada) {
          System.out.println("DISTANCIA ELETROPOSTO: " + e.getDistancia());
        }
        capacidadeTotalBateria -= rota.getKmPercorrido();
        if(capacidadeTotalBateria <= 0) {
          r.addVeiculoManutencao(id);
        }
        return true;
      }
    }


  









}