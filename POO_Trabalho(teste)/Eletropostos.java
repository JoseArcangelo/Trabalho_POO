public class Eletropostos {
  private int id;
  private int numeroVagas;
  private double tempoCarregamento;
  private double distancia;

  public Eletropostos(int id, int numeroVagas, double tempoCarregamento) {
      this.id = id;
      this.numeroVagas = numeroVagas;
      this.tempoCarregamento = tempoCarregamento;
  }
  
  public int get_id(){
    return this.id;
  }

  public Boolean setDistancia(double d, Rota rota) {
    double distanciaRota = rota.getKmPercorrido();
    if(d <= distanciaRota && d > 0) {
      this.distancia = d;
      return true;
    }
    
    System.out.println("::ERRO! DISTANCIA DO ELETROPOSTO INVALIDA!::");
    return false;
  }

  public void exibirEletroposto() {
    System.out.println("Eletroposto id: #" + id + 
    "\nNumero de vagas: " + numeroVagas + 
    "\nTempo de carregamento: " + tempoCarregamento + 
    "\nDistancia: " + distancia + "km" + "\n");
  }

  public int getId() {
    return id;
  }

  public int getNumeroVagas() {
    return numeroVagas;
  }

  public double getTempoCarregamento() {
    return tempoCarregamento;
  }

  public double getDistancia() {
    return distancia;
  }

  


}

