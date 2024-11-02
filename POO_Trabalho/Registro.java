import java.util.ArrayList;
import java.util.List;

public class Registro {
  private List<Viagem> registroViagens;
  private List<String> recargasHistorico;
 
  public Registro() {
    this.registroViagens = new ArrayList<>();
    this.recargasHistorico = new ArrayList<>();
  }

  public void addRegistro(Viagem v) {
    registroViagens.add(v);
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
}
