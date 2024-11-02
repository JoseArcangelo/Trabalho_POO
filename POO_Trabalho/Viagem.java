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
  
  public Motoristas getMotorista() {
    return motorista;
  }

  public void exibirViagem() {
    System.out.println("-> Origem: " + rota.getOrigem() + ", Destino: " + rota.getDestino() + ", Distancia:" + rota.getKmPercorrido() + "KM" + 
    "\nVEICULO UTILIZADO - " + " Modelo: " + veiculo.getModelo() + ", Marca: " + veiculo.getMarca() + "\n");
  }
  
}
