import java.util.ArrayList;
import java.util.List;

public class Registro {
  private List<Viagem> registroViagens;
  private List<String> recargasHistorico;
  private List<Integer> manutencaoVeiculos;
 
  public Registro() {
    this.registroViagens = new ArrayList<>();
    this.recargasHistorico = new ArrayList<>();
    this.manutencaoVeiculos = new ArrayList<>();
  }

  public void addRegistro(Viagem v) {
    registroViagens.add(v);
  }


  public void autonomiaInferior(List<Veiculos> veiculos) {
    for(Veiculos veiculo : veiculos) {
      if(veiculo.getBateriaAtual() < veiculo.getCapacidadeTotalBateria() * 0.2) {
        System.out.println("-> Marca: " + veiculo.getMarca() + ", Modelo: " + veiculo.getModelo() +", Ano Fabricacao: " + veiculo.getAnoFabricacao() + ", ID: " + veiculo.getId());
      }
    }

  }

  public void consultarMotorista(Motoristas motorista){
    System.out.println("\n::VIAGENS REALIZADAS POR " + motorista.getNome() + "::");
    for(Viagem v : registroViagens) {
      if(motorista.getId() == v.getMotorista().getId()){
        v.exibirViagem();
      } 
    }
  }

  public void exibirHistoricoRecargas(){
    if(recargasHistorico.size() > 0) {
      System.out.println("\n::HISTORICO DE RECARGAS::");
      for(String recarga : recargasHistorico) {
      
        System.out.println(recarga);
      }
    }
    else {
      System.out.println("\n::NENHUMA RECARGA REGISTRADA!::");
    }
    
  }

  public void addRegistroRecarga(String registro) {
    recargasHistorico.add(registro);
  }

  public void addVeiculoManutencao(Integer v) {
    this.manutencaoVeiculos.add(v);
  }

  public void consultarVeiculosManutencao(List<Veiculos> veiculos) {
    System.out.println("::VEICULOS EM MANUTECAO::");
    for(Veiculos veiculo : veiculos) {
      for(Integer veiculoManutencao : manutencaoVeiculos) {
        if(veiculoManutencao == veiculo.getId()) {
          System.out.println("-> Marca: " + veiculo.getMarca() + ", Modelo: " + veiculo.getModelo() +", Ano Fabricacao: " + veiculo.getAnoFabricacao() + ", ID: " + veiculo.getId());
        }
      }
    }
  }


  public boolean veiculosManutencao(Integer id) {
    for(Integer veiculoManutencao : manutencaoVeiculos) {
      if(id == veiculoManutencao) {
        return false;
      }
    }
    return true;
  }

  

}
