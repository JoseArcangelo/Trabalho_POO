public class Viagem {
  private Rota rota; 
  private Motoristas motorista;
  private Veiculos veiculo;

  public Viagem(Rota rota, Motoristas motorista, Veiculos veiculo) {
    this.rota = rota;
    this.motorista = motorista;
    this.veiculo = veiculo;
  }

  public Rota getRota() {
    return rota;
  }

  
}
