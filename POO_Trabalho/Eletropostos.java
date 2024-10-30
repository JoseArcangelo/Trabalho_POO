public class Eletropostos {
  private int id;
  private int numeroVagas;
  private double tempoCarregamento;

  public Eletropostos(int id, int numeroVagas, double tempoCarregamento) {
      this.id = id;
      this.numeroVagas = numeroVagas;
      this.tempoCarregamento = tempoCarregamento;
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
}

